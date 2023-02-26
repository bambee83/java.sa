package sa;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(30, 1000, 1, 80);
        Bus bus2 = new Bus(35, 2000, 2, 60);

        bus1.addPassenger(2);
        bus1.gasDecrease(-50);
        bus1.gasDecrease(10);
        bus1.busState("차고지행");
        bus1.busState("운행중");
        bus1.addPassenger(45);
        bus1.addPassenger(5);
        bus1.gasDecrease(-55);

    }
}
