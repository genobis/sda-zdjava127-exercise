package pl.sdacademy.java.exercise;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Grade {
    private UUID courseUUID;
    private GradeType gradeType;
    private LocalDateTime dateTime;
    private BigDecimal value;


    public Grade(UUID courseUUID, GradeType gradeType, LocalDateTime dateTime, BigDecimal value) {
        this.courseUUID = courseUUID;
        this.gradeType = gradeType;
        this.dateTime = dateTime;
        this.value = value;
    }

    public UUID getCourseUUID() {
        return courseUUID;
    }

    public GradeType getGradeType() {
        return gradeType;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "courseUUID=" + courseUUID +
                ", gradeType=" + gradeType +
                ", dateTime=" + dateTime +
                ", value=" + value +
                '}';
    }
}

