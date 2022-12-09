package pl.sdacademy.java.exercise;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Grade {
    private UUID courseUuid;
    private GradeType gradeType;
    private LocalDateTime dateTime;
    private BigDecimal value;

    public Grade(UUID courseUuid, GradeType gradeType, LocalDateTime dateTime, BigDecimal value) {
        this.courseUuid = courseUuid;
        this.gradeType = gradeType;
        this.dateTime = dateTime;
        this.value = value;
    }

    public UUID getCourseUuid() {
        return courseUuid;
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
                "courseUuid=" + courseUuid +
                ", gradeType=" + gradeType +
                ", dateTime=" + dateTime +
                ", value=" + value +
                '}';
    }
}
