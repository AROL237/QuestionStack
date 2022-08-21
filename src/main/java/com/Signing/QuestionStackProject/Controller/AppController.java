package com.Signing.QuestionStackProject.Controller;

import antlr.ASTNULLType;
import com.Signing.QuestionStackProject.Model.Exam;
import com.Signing.QuestionStackProject.Model.Role;
import com.Signing.QuestionStackProject.Model.Schema;
import com.Signing.QuestionStackProject.Model.User;
import com.Signing.QuestionStackProject.Repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AppController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private ExamRepository examRepository;
    @Autowired
    private SpecialtyRepository specialtyRepository;
    @Autowired
    private OptionRepository optionRepository;

    @GetMapping("/")
    public String  dashboard(){
        return  "index";

    }

    public User register(User user) throws Exception {
        if (user.equals(null))
        {
            throw new Exception("User information object is null");
        }
        else {
            User user1=userRepository.save(user);
            roleRepository.save(new Role(1,user1,"ROLE_USER"));
            return user1;
        }
    }

    @GetMapping("/details")
    public Schema getDetails(){

        return new Schema(examRepository.findAll(),optionRepository.findAll(),specialtyRepository.findAll()) ;
    }
}
