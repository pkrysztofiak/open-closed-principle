package pl.pkrysztofiak;

import java.util.ArrayList;
import java.util.List;

public class CurveMeasurement extends Measurement {

    @Override
    public List<Point> getPoints() {
        return new ArrayList<>();
    }

    @Override
    public void accept(Converter converter) {

    }
}