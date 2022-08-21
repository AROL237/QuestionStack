package com.Signing.QuestionStackProject.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schema {
    private Collection<Exam> examCollection;
    private Collection<Option> optionCollection;
    private  Collection<Specialty> specialtyCollection;
}
