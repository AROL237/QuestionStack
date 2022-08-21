package com.Signing.QuestionStackProject.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialty")
public class Specialty {
    @EmbeddedId
    private SpecialtyId id;

    @Column(name = "sp_name", nullable = false, length = 254)
    private String spName;

    @Column(name = "Description", length = 254)
    private String description;

    public SpecialtyId getId() {
        return id;
    }

    public void setId(SpecialtyId id) {
        this.id = id;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}