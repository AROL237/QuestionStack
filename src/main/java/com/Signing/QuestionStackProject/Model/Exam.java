package com.Signing.QuestionStackProject.Model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "exam")
public class Exam {

    @Id
    @Column(name = "Ex_id", nullable = false)
    private Long id;


    @Column(name = "Ex_name", nullable = false, length = 254)
    private String exName;

    @Column(name = "description", length = 254)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExName() {
        return exName;
    }

    public void setExName(String exName) {
        this.exName = exName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}