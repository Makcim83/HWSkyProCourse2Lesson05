package TransportNew;

public class Bus extends Transport {
    private SizeBus sizeBus;

    public Bus(String brand,
               String model,
               Float engineValue,
               SizeBus sizeBus) {
        super(brand,
                model,
                engineValue);
        setSizeBus(sizeBus);
    }

    public SizeBus getSizeBuss() {
        return sizeBus;
    }

    private void setSizeBus(SizeBus sizeBus) {
        if (sizeBus == null) {
            System.out.println("Size of Bus no changed");
            this.sizeBus = SizeBus.VerySmall;
        } else {
            this.sizeBus = sizeBus;
        }
    }

    public void printType() {
        System.out.print("Size of this bus is ");
        if (sizeBus != null) {
            System.out.println(sizeBus.toString() +
                    ", carries from " + getSizeBuss().numOfSeatsMin +
                    ", up to " + getSizeBuss().numOfSeatsMax + " passengers");
        } else {
            System.out.println(" unknown");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", size " + getSizeBuss();
    }
}
