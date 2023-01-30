package TransportNew;

public enum SizeBus {
    VerySmall(0, 10),
    Small(11, 25),
    Average(26, 50),
    Big(51, 80),
    VeryBig(81, 120);

    protected final int numOfSeatsMin;
    protected final int numOfSeatsMax;

    SizeBus(int numOfSeatsMin, int numOfSeatsMax) {
        this.numOfSeatsMin = numOfSeatsMin;
        this.numOfSeatsMax = numOfSeatsMax;
    }
}
