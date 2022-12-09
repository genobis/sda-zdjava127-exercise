package pl.sdacademy.java.exercise;

import java.io.InputStream;
import java.util.List;
import java.util.function.Supplier;

public class GradesCsvLoader {
    private Supplier<InputStream> inputStreamSupplier;

    public GradesCsvLoader(Supplier<InputStream> inputStreamSupplier) {
        this.inputStreamSupplier = inputStreamSupplier;
    }

    public List<Grade> getData(){
        throw new UnsupportedOperationException();
    }
}
