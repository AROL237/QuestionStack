package com.Signing.QuestionStackProject.Repo;

import com.Signing.QuestionStackProject.Model.Role;
import com.Signing.QuestionStackProject.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Collection<Role> findByUser(User user);
}