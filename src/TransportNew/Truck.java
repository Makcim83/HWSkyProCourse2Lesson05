package TransportNew;

public class Truck extends Transport {
    private CapacityTruck capacityTruck;

    public Truck(String brand,
                 String model,
                 Float engineValue,
                 CapacityTruck capacityTruck) {
        super(brand,
                model,
                engineValue);
        setCapacityTruck(capacityTruck);
    }

    public CapacityTruck getCapacityTruck() {
        return capacityTruck;
    }

    public void setCapacityTruck(CapacityTruck capacityTruck) {
        if (capacityTruck == null) {
            System.out.println("Capacity class of truck no changed");
            this.capacityTruck = CapacityTruck.N1;
        } else {
            this.capacityTruck = capacityTruck;
        }
    }

    public void printType() {
        System.out.print("Category capacity of this truck is ");
        if (capacityTruck != null) {
            System.out.println(getCapacityTruck().toString() +
                    ", tonnage from " + getCapacityTruck().truckCapacityMin +
                    ", up to " + getCapacityTruck().truckCapacityMax);
        } else {
            System.out.println(" unknown");
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                ", type " + getCapacityTruck();
    }
}
