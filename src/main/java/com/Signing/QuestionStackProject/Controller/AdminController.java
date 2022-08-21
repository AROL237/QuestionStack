package com.Signing.QuestionStackProject.Controller;

import com.Signing.QuestionStackProject.Model.Paper;
import com.Signing.QuestionStackProject.Model.PaperSchema;
import com.Signing.QuestionStackProject.Model.Specialty;
import com.Signing.QuestionStackProject.Repo.PaperRepository;
import com.Signing.QuestionStackProject.Repo.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private PaperRepository paperRepository;
    private SpecialtyRepository specialtyRepository;

    @GetMapping("/index")
    public String hello()
    {
        return "hello react";
    }

    @PostMapping("/newQuestionPaper")
    public Paper newQuestionPaper(@RequestBody PaperSchema paperSchema) throws Exception {
        if(paperSchema==null)
            throw new Exception("the paperSchema object is empty");
        else {

            Paper paper = paperRepository.save(new Paper());
            paper.setCourseCode(paperSchema.getCourseCode());
            paper.setCourseName(paperSchema.getCourseName());
            paper.setQuestionDoc(paperSchema.getQuestionPaper());
          //  System.out.println(paperSchema.getQuestionPaper());

            if (paperSchema.getSolution()==null) {
                paper.setYear(paperSchema.getYear());
            } else {
                paper.setSolutionContent(paperSchema.getSolution());
                paper.setYear(paperSchema.getYear());
            }
            return  paperRepository.save(paper);

        }
    }

    @PostMapping("/newSpecialty")
    public Specialty newSpecialty(@RequestBody Specialty specialty) throws Exception {
        if (specialty.equals(null))
        {
            throw new Exception("the specialty object is null");
        }
        else {
            return specialtyRepository.save(specialty);
        }
    }

}
