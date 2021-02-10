package com.agnes.StudyPlan.model;

import com.agnes.StudyPlan.user.Lecturer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Subject {

    @Id
    private long id;
    private String subjectName;
    private String lecturerOfSubject;
    private short numberOfLectureHours;
    private String SubjectDescription;
    @OneToOne
    @JoinColumn(name = "lecturer_id")
    private Lecturer lecturer;

}
