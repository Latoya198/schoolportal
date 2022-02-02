package com.kataacademy.schoolportal.common.models.schoolatribute;

import com.kataacademy.schoolportal.common.models.enums.SchoolSubjects;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "subject_mark")
public class SubjectMarks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "school_subject")
    @Enumerated(EnumType.STRING)
    private SchoolSubjects schoolSubjects;

    @OneToMany
    @JoinColumn(name="subject_id", referencedColumnName="id")
    private Set<Mark> marks;

    @Override
    public String toString() {
        return "SubjectMarks{" +
                "schoolSubjects=" + schoolSubjects +
                ", marks=" + marks +
                '}';
    }
}
