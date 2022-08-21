package com.Signing.QuestionStackProject.Repo;

import com.Signing.QuestionStackProject.Model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
}