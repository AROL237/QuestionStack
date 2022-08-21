package com.Signing.QuestionStackProject.Model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "paper")
public class Paper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "P_id", nullable = false)
    private Integer id;

    @Column(name = "course_code", length = 254)
    private String courseCode;

    @Column(name = "course_name", length = 254)
    private String courseName;

    @Column(name = "Question_doc")
    private byte[] questionDoc;

    @Column(name = "solution_content")
    private byte[] solutionContent;

    @Column(name = "year", length = 254)
    private String year;

    public void setSolutionContent(byte[] solutionContent) {
        this.solutionContent = solutionContent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public byte[] getQuestionDoc() {
        return questionDoc;
    }

    public void setQuestionDoc(byte[] questionDoc) {
        this.questionDoc = questionDoc;
    }

    public byte[] getSolutionContent() {
        return solutionContent;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}