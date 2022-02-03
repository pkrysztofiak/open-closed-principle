package pl.pkrysztofiak;

import java.util.List;

public abstract class Measurement {

    public abstract List<Point> getPoints();

    public abstract void accept(Converter converter);
}
