package TransportNew;

import java.nio.Buffer;

public class Car extends Transport {
    private BodyType bodyType;

    public Car(String brand,
               String model,
               float engineValue,
               BodyType body) {
        super(brand,
                model,
                engineValue);
        setBodyType(bodyType);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType body) {
        if (bodyType == null) {
            System.err.println("BodyType no changed");
            this.bodyType = BodyType.Sedan;
        } else {
            this.bodyType = body;
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                ", type " + getBodyType();
    }
}
