package com.agnes.StudyPlan.user;

import com.agnes.StudyPlan.model.Subject;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Lecturer {

    @Id
    private long Id;
    private String academicDegree;
    private String firstName;
    private String lastName;
    @OneToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

}
