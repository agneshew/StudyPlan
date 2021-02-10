package com.agnes.StudyPlan.model;

import com.agnes.StudyPlan.user.Lecturer;
import com.agnes.StudyPlan.user.Student;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class LectureShedule {

    @Id
    private long Id;
    private short numberOfHoursPlanned;
    private short numberOfHoursRemaining;
    @OneToMany
    @JoinColumn(name = "subject_id")
    private List<Subject> subject;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;




}
