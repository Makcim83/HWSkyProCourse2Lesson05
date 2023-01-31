package TransportNew;

public class Main {
    public static void main(String[] args) throws TransportTypeException {
        Car carTest = new Car(null, null, null, null);
        System.out.println(carTest.toString());
        carTest.printType();
        Car carTest1 = new Car("SomeCar", "simple", 1.1f, BodyType.StationWagon);
        System.out.println(carTest1.toString());
        carTest1.printType();
        carTest1.diagnosticsCheck();

        System.out.println();

        Bus busTest = new Bus(null, null, null, null);
        System.out.println(busTest.toString());
        busTest.printType();
        Bus busTest1 = new Bus("SomeBus", "simple", 1.1f, SizeBus.Small);
        System.out.println(busTest1.toString());
        busTest1.printType();
        try {
            busTest1.diagnosticsCheck();
        } catch (TransportTypeException e) {
            System.err.println(e);
        }




        System.out.println();

        Truck truckTest = new Truck(null, null, null, null);
        System.out.println(truckTest.toString());
        truckTest.printType();
        Truck truckTest1 = new Truck("Some Truck", "simple", 1.1f, CapacityTruck.N2);
        System.out.println(truckTest1.toString());
        truckTest1.printType();
        truckTest1.diagnosticsCheck();


    }
}