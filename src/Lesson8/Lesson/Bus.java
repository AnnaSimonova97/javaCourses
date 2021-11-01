package Lesson8.Lesson;

public class Bus extends Vehicle {
    private int peopleCount;
    private int maxPeople;

    public Bus() {

    }

    public Bus(double tankVolume, double petrolAmount, int peopleCount, int maxPeople) {
      //  super(tankVolume, petrolAmount);
        this.peopleCount = peopleCount;
        this.maxPeople = maxPeople;
        this.setPetrolAmount(petrolAmount);
        this.setTankVolume(tankVolume);
    }

    @Override
    public void arrive() {
        Base.people_on_base++;
        Base.vehicle_on_base++;
        Base.people_on_base = Base.people_on_base + peopleCount;
    }

    @Override
    public boolean leave() {
        if (!canLeaveVehicle()) {
            return false;
        }
        Base.people_on_base--;
        Base.vehicle_on_base--;
        Base.petrol_on_base = Base.petrol_on_base - (getTankVolume()- getPetrolAmount()); //вызываем через гет потому что в том классе доступ private

        if(Base.people_on_base >= maxPeople - peopleCount) {  //50 20
            Base.people_on_base-= maxPeople - peopleCount;
            peopleCount = maxPeople;
        } else {

            peopleCount = peopleCount +   Base.people_on_base;
                    Base.people_on_base = 0;
        }
        return true;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }
}
