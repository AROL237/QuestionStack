package com.Signing.QuestionStackProject.Model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PaperSchema {
    private Integer pId;
    private SpecialtyId id;
    private String courseCode;
    private String courseName;
    private byte[] questionPaper;
    private byte[] solution;
    private String year;

}
