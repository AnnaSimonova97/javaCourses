package Lesson8.HomeWork;

public class Truck extends Vehicle {
    private double load;
    private double max_load;

    public Truck(int driver, double petrol_amount, double tank_volume, double load, double max_load) {
        super(driver, petrol_amount, tank_volume);
        this.load = load;
        this.max_load = max_load;
    }

    @Override
    void arrive() {
        super.arrive();
        setGoods_on_base(getGoods_on_base() + getCurrentLoad());
    }

    @Override
    void leave() {
        super.leave();
        setGoods_on_base(checkOfNegativeValue(getGoods_on_base() - getMax_load()));
    }

    public double getCurrentLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public double getMax_load() {
        return max_load;
    }

    public void setMax_load(double max_load) {
        this.max_load = max_load;
    }

}
