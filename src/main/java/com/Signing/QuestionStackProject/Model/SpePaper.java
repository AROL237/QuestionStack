package com.Signing.QuestionStackProject.Model;

import javax.persistence.*;

@Entity
@Table(name = "spe_paper")
public class SpePaper {
    @EmbeddedId
    private SpePaperId id;

    @MapsId("pId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "P_id", nullable = false)
    private Paper p;

    public SpePaperId getId() {
        return id;
    }

    public void setId(SpePaperId id) {
        this.id = id;
    }

    public Paper getP() {
        return p;
    }

    public void setP(Paper p) {
        this.p = p;
    }

}