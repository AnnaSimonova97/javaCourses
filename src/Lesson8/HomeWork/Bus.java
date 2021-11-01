package Lesson8.HomeWork;

public class Bus extends Vehicle {
    private int maxPeople;
    private int people;

    public Bus(int driver, double petrol_amount, double tank_volume, int maxPeople, int people) {
        super(driver, petrol_amount, tank_volume);
        this.maxPeople = maxPeople;
        this.people = people;
    }

    public Bus(int driver, double petrol_amount, double tank_volume, int maxPeople) {
        super(driver, petrol_amount, tank_volume);
        this.maxPeople = maxPeople;
    }

    @Override
    void arrive() {
        super.arrive();
        setPeople_on_base(getPeople_on_base() + getPeopleCount());

    }

    @Override
    void leave() {
        super.leave();
        setPeople_on_base(checkOfNegativeValue(getPeople_on_base() - getMaxPeople()));
    }


    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getPeopleCount() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

}
