package TransportNew;

public abstract class Transport<T> {
    private final String brand;
    private final String model;
    private final Float engineValue;


    public Transport(String brand,
                     String model,
                     Float engineValue) {
        this.brand = validateString(brand, "Default");
        this.model = validateString(model, "Default");
        this.engineValue = validateFloat(engineValue);
    }

    public abstract void printType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineValue() {
        return engineValue;
    }

    @Override
    public String toString() {
        return "brand=" + brand +
                ", model=" + model +
                ", engineValue=" + engineValue;
    }

    public String validateString(String validateString, String defaultValue) {
        return validateString == null || validateString.isEmpty() || validateString.isBlank() ? defaultValue : validateString;
    }

    public float validateFloat(Float validateFloat) {
        return validateFloat != null && validateFloat > 0 ? validateFloat : 0;

        //неправильная реализация, что не проходила проверку на null (нельзя сравнивать примитив с объектом null)
        //return validateFloat == null || validateFloat < 0 ? 0 : validateInt;
    }
}
