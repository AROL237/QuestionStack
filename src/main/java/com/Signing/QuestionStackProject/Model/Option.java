package com.Signing.QuestionStackProject.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "options")
@NamedQueries(
        value = {
                @NamedQuery(name=("Option.getOptions"), query = "select distinct o.opName from Option o")
        })
public class Option {
    @Id
    @Column(name = "op_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Ex_id")
    private Exam ex;

    @Column(name = "op_name", nullable = false, length = 254)
    private String opName;

    @Column(name = "Description", length = 254)
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Exam getEx() {
        return ex;
    }

    public void setEx(Exam ex) {
        this.ex = ex;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}