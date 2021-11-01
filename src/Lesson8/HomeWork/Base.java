package Lesson8.HomeWork;

public class Base {
    private static int people_on_base;
    private static int vehicle_on_base;
    private static double petrol_on_base;
    private static double goods_on_base;

    void getInfoOfBase() {
        System.out.println("Всего транспорта: " + getVehicle_on_base() + "\n" +
                "Всего людей на базе: " + getPeople_on_base() + "\n"
                + "Всего топлива на базе: " + getPetrol_on_base() + "\n" + "Всего товаров на базе: " + getGoods_on_base());
    }

    public int getPeople_on_base() {
        return people_on_base;
    }

    public void setPeople_on_base(int people_on_base) {
        this.people_on_base = people_on_base;
    }

    public int getVehicle_on_base() {
        return vehicle_on_base;
    }

    public void setVehicle_on_base(int vehicle_on_base) {
        this.vehicle_on_base = vehicle_on_base;
    }

    public double getPetrol_on_base() {
        return petrol_on_base;
    }

    public void setPetrol_on_base(double petrol_on_base) {
        this.petrol_on_base = petrol_on_base;
    }

    public double getGoods_on_base() {
        return goods_on_base;
    }

    public void setGoods_on_base(double goods_on_base) {
        this.goods_on_base = goods_on_base;
    }

}

