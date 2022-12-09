package pl.sdacademy.java.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class GradesCsvLoader {
    private Supplier<InputStream> inputStreamSupplier;

    public GradesCsvLoader(Supplier<InputStream> inputStreamSupplier) {
        this.inputStreamSupplier = inputStreamSupplier;
    }

    public List<Grade> getData(){
        try(InputStream inputStream = inputStreamSupplier.get()){
            var bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            return bufferedReader.lines()
                    .map(this::gradeReturn)
//                    .map(line -> gradeReturn(line))
                    .toList();
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
    }

    private Grade gradeReturn(String line) {

        String[] strings =  line.split(",");
        return new Grade(
                UUID.fromString(strings[0]),
                GradeType.valueOf(strings[1]),
                LocalDateTime.parse(strings[2]),
                new BigDecimal(strings[3])
        );

    }

}
