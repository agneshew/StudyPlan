package com.agnes.StudyPlan.user;

import com.agnes.StudyPlan.model.LectureShedule;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Student {

    @Id
    private short indexNumber;
    private String firstName;
    private String lastName;
    @OneToOne
    @JoinColumn(name = "lectureShedule_id")
    private LectureShedule lectureShedule;
}
