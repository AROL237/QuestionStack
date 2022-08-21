package com.Signing.QuestionStackProject.Repo;

import com.Signing.QuestionStackProject.Model.Paper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperRepository extends JpaRepository<Paper, Integer> {
}