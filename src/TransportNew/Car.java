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

    public void printType() {
        System.out.println("Type of Car body is " + (this.body != null ? this.body.toString() : " unknown"));
    }

    public BodyType getBodyType() {
        return body;
    }

    private void setBodyType(BodyType body) {
        if (body == null) {
            System.out.println("Body type of car no changed");
            this.body = BodyType.Sedan;
        } else {
            this.body = body;
        }
    }

    @Override
    public void diagnosticsCheck() {
        System.out.println(getBrand() + " diagnostic is done");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", type " + getBodyType();
    }
}
