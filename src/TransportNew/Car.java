package TransportNew;

public class Car extends Transport {
    private BodyType body;

    public Car(String brand,
               String model,
               Float engineValue,
               BodyType body) {
        super(brand,
                model,
                engineValue);
        setBodyType(body);
    }

    public BodyType getBodyType() {
        return body;
    }

    public void setBodyType(BodyType body) {
        if (body == null) {
            System.err.println("BodyType no changed");
            this.body = BodyType.Sedan;
        } else {
            this.body = body;
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                ", type " + getBodyType();
    }
}
