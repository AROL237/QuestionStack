package com.Signing.QuestionStackProject.Security;

import com.Signing.QuestionStackProject.Model.Role;
import com.Signing.QuestionStackProject.Model.User;
import com.Signing.QuestionStackProject.Repo.RoleRepository;
import com.Signing.QuestionStackProject.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class CustomAuthProvider implements AuthenticationProvider {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
   private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String Email = authentication.getName();
        String password = authentication.getCredentials().toString();

        User user  = userRepository.findByEmail(Email);

        if (passwordEncoder.matches(password,user.getPassword())) {
            return new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword(),getAuthorities(user));
        }
        else if (user == null) {
            throw new UsernameNotFoundException("Unknown user");
        }
        else
            throw new BadCredentialsException("invalid username and password");

    }

    public ArrayList<SimpleGrantedAuthority> getAuthorities(User user)
    {
        Collection<Role> userRole = roleRepository.findByUser(user);
        ArrayList<SimpleGrantedAuthority> roles= new ArrayList<>();
        userRole.stream().map(role ->{
            roles.add(new SimpleGrantedAuthority(role.getRole()));
            return null;
        } );
        return roles;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return  authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
