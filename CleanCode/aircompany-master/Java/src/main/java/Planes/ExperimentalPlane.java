package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

import java.util.Objects;

public class ExperimentalPlane extends Plane {

    private final ExperimentalTypes type;

    private final ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ExperimentalTypes getType() {
        return type;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        ExperimentalPlane that = (ExperimentalPlane) object;
        return getType() == that.getType() && getClassificationLevel() == that.getClassificationLevel();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType(), getClassificationLevel());
    }

    @Override
    public String toString() {
        return "experimentalPlane{model='" + getModel() + '\'' +
                '}';
    }
}
