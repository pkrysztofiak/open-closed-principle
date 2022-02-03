package pl.pkrysztofiak;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Measurement> measurements = List.of(new CurveMeasurement(), new LineMeasurment());
    }
}
