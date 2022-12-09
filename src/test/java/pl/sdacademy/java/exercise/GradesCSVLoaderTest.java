package pl.sdacademy.java.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GradesCSVLoaderTest {

    private GradesCSVLoader gradesCSVLoader;

    @BeforeEach
    void setUp() {
        gradesCSVLoader = new GradesCSVLoader(
                () -> GradesCSVLoaderTest.class.getResourceAsStream("/csv/grades.csv")
        );
    }

    @Test
    void shouldLoadGrades() {
        //when
        List<Grade> grades = gradesCSVLoader.getData();

        //then
        assertThat(grades).hasSize(6);
    }
}