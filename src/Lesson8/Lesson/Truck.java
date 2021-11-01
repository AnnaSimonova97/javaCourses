package Lesson8.Lesson;

public class Truck extends Vehicle {
    private int currentLoad;
    private int maxLoad;

    public Truck() {

    }

    public Truck(double tankVolume, double petrolAmount, int currentLoad, int maxLoad) {
        super(tankVolume, petrolAmount);
        this.currentLoad = currentLoad;
        this.maxLoad = maxLoad;
    }

    @Override
    public void arrive() {
        super.arrive();
        Base.goods_on_base += currentLoad;

    }

    @Override
    public boolean leave() {
        if (!canLeaveVehicle()) {
            return false;
        }
        Base.people_on_base--;
        Base.vehicle_on_base--;
        Base.petrol_on_base = Base.petrol_on_base - (getTankVolume()- getPetrolAmount());

        if(Base.goods_on_base >= maxLoad - currentLoad) {
            Base.goods_on_base-= maxLoad - currentLoad;
            currentLoad = maxLoad;
        } else {
            currentLoad += Base.goods_on_base;
            Base.goods_on_base = 0;
        }
        return true;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(int currentLoad) {
        this.currentLoad = currentLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }
}
