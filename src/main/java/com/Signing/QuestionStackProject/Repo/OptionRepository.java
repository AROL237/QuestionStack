package com.Signing.QuestionStackProject.Repo;

import com.Signing.QuestionStackProject.Model.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface OptionRepository extends JpaRepository<Option, Integer> {


}