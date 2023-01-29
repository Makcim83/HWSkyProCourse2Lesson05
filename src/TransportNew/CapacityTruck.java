package TransportNew;

public enum CapacityTruck {
    N1(0, 3.5f),
    N2(3.5f, 12f),
    N3(12f, 500f);

    protected final float truckCapacityMin;
    protected final float truckCapacityMax;

    CapacityTruck(float truckCapacityMin, float truckCapacityMax) {
        this.truckCapacityMin = truckCapacityMin;
        this.truckCapacityMax = truckCapacityMax;
    }
}
