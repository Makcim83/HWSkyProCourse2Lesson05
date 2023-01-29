package TransportNew;

public class Transport {
    private final String brand;
    private final String model;
    private final float engineValue;

    public Transport(String brand,
                     String model,
                     Float engineValue) {
        this.brand = validateString(brand, "Default");
        this.model = validateString(model, "Default");
        this.engineValue = validateFloat(engineValue);
    }

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

    public int validateInt(Integer validateInt) {
        return validateInt != null && validateInt > 0 ? validateInt : 0;
        //неправильная реализация ниже, что не проходила проверку на null
        //return validateInt == null || validateInt < 0 ? 0 : validateInt;
    }

    public float validateFloat(Float validateFloat) {
        return validateFloat != null && validateFloat > 0 ? validateFloat : 0;
    }
}
