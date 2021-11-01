package Lesson9;

public class Ingredient extends Dishes {
    protected String name;
    protected String unitOfMeasurement;

    public Ingredient() {

    }

    public Ingredient(String name, String unitOfMeasurement) {
        this.name = name;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }
    @Override
    public String toString() {
        return name + " " + unitOfMeasurement;
    }
}

