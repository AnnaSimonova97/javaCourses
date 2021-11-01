package Lesson8.HomeWork;

public class Main {
    public static void main(String[] args) {
        Base base = new Base();
        base.setVehicle_on_base(67);
        base.setPeople_on_base(101);
        base.setPetrol_on_base(1000.0);
        base.setGoods_on_base(2000.0);

        Bus vehicle1 = new Bus(1, 50, 75, 30, 17);
        vehicle1.getInfoOfBase();
        vehicle1.arrive();
        vehicle1.getInfoOfBase();
        vehicle1.leave();
        vehicle1.getInfoOfBase();
        vehicle1.leave();
        vehicle1.leave();
        vehicle1.leave();
        vehicle1.getInfoOfBase();
        vehicle1.leave();
        vehicle1.getInfoOfBase();


        Truck truck1 = new Truck(1, 65, 75, 100, 200);
        truck1.arrive();
        truck1.getInfoOfBase();
        truck1.leave();
        truck1.getInfoOfBase();

        Truck truck2 = new Truck(1, 40, 75, 200, 200);
        truck2.leave();
        truck2.getInfoOfBase();
        base.getInfoOfBase();


    }
}
