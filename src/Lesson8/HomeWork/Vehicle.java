package Lesson8.HomeWork;

public class Vehicle extends Base {
    private int driver;
    private double petrol_amount;
    private double tank_volume;

    void arrive() {
        System.out.println("Приехал транспорт");
        setPeople_on_base(getPeople_on_base() + getDriver());
        setVehicle_on_base(getVehicle_on_base() + 1);

    }


    void leave() {

        if (getPeople_on_base() > 0 && getVehicle_on_base() > 0 && getPetrol_on_base() > 0) {
            System.out.println("Уехал транспорт");
            setPeople_on_base(getPeople_on_base() - getDriver());
            setVehicle_on_base(getVehicle_on_base() - 1);
            setPetrol_on_base(checkOfNegativeValue(getPetrol_on_base() - (getTank_volume() - getPetrol_amount())));

        } else {
            System.out.println("Ошибка");
            if (getPeople_on_base() == 0) {
                System.out.println("Людей не осталось на базе");
            }
            if (getVehicle_on_base() == 0) {
                System.out.println("Машины на базе отсутсвуют");
            }
            if (getPetrol_on_base() == 0) {
                System.out.println("Бензин на базе закончился");
            }
            if (getGoods_on_base() == 0) {
                System.out.println("Груз на базе закончился");
            }
        }
    }

    int checkOfNegativeValue(int amount) {
        if (amount <= 0) return 0;
        else return amount;
    }

    double checkOfNegativeValue(double amount) {
        if (amount <= 0) return 0;
        else return amount;
    }


    public int getDriver() {
        return driver;
    }

    public void setDriver(int driver) {
        this.driver = driver;
    }

    public double getPetrol_amount() {
        return petrol_amount;
    }

    public void setPetrol_amount(double petrol_amount) {
        this.petrol_amount = petrol_amount;
    }

    public double getTank_volume() {
        return tank_volume;
    }

    public void setTank_volume(double tank_volume) {
        this.tank_volume = tank_volume;
    }

    public Vehicle() {
    }

    public Vehicle(int driver, double petrol_amount, double tank_volume) {
        this.driver = driver;
        this.petrol_amount = petrol_amount;
        this.tank_volume = tank_volume;
    }
}