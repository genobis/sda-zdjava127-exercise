package pl.sdacademy.java.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GradesCsvLoaderTest {

    private GradesCsvLoader gradesCsvLoader;

    @BeforeEach
    void setUp() {
        gradesCsvLoader = new GradesCsvLoader(
                ()->GradesCsvLoaderTest.class.getResourceAsStream("/csv/grades.csv")
        );
    }

    @Test
    void shouldLoadGrades() {
        //when
        List<Grade> grades = gradesCsvLoader.getData();

        //then
        assertThat(grades).hasSize(6);
    }


}