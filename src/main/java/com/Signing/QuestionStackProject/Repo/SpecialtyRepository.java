package com.Signing.QuestionStackProject.Repo;

import com.Signing.QuestionStackProject.Model.Specialty;
import com.Signing.QuestionStackProject.Model.SpecialtyId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtyRepository extends JpaRepository<Specialty, SpecialtyId> {
}