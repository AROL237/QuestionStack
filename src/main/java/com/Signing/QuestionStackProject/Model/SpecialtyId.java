package com.Signing.QuestionStackProject.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class SpecialtyId implements Serializable {
    private static final long serialVersionUID = -2443772769240249939L;
    @Column(name = "op_id", nullable = false)
    private Integer opId;

    @Column(name = "sp_code", nullable = false, length = 50)
    private String spCode;

    public Integer getOpId() {
        return opId;
    }

    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    public String getSpCode() {
        return spCode;
    }

    public void setSpCode(String spCode) {
        this.spCode = spCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SpecialtyId entity = (SpecialtyId) o;
        return Objects.equals(this.opId, entity.opId) &&
                Objects.equals(this.spCode, entity.spCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opId, spCode);
    }

}