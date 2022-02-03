package pl.pkrysztofiak;

public abstract class MeasurementTypeFactory<T> {

    public final T create(Type type) {
        switch (type) {
            case LINE:
                return caseLine();
            case CURVE:
                return caseCurve();
            default:
                throw new IllegalArgumentException();
        }
    }

    protected abstract T caseLine();

    protected abstract T caseCurve();

}
