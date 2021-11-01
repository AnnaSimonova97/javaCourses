package Lesson8.Lesson;

public class Vehicle {

  private double tankVolume;
  private double petrolAmount;

  public Vehicle() {

  }

    public Vehicle(double tankVolume, double petrolAmount) {
        this.tankVolume = tankVolume;
        this.petrolAmount = petrolAmount;
    }

    public double getTankVolume() {
    return tankVolume;
  }

  public void setTankVolume(double tankVolume) {
    this.tankVolume = tankVolume;
  }

  public double getPetrolAmount() {
    return petrolAmount;
  }

  public void setPetrolAmount(double petrolAmount) {
    this.petrolAmount = petrolAmount;
  }

  public void arrive() {
    Base.people_on_base++;
    Base.vehicle_on_base++;
  }

  public boolean leave() {
   if (!canLeaveVehicle()) {
     return false;
   }
      Base.people_on_base--;
      Base.vehicle_on_base--;
      Base.petrol_on_base = Base.petrol_on_base - (tankVolume - petrolAmount);
    return true;
    }
    protected boolean canLeaveVehicle() {
      if (Base.people_on_base < 1) {
        return false;
      }
      if (Base.vehicle_on_base < 1) {
        return false;
      }
      if (tankVolume - petrolAmount > Base.petrol_on_base) {
        return false;
      }
      return true;
    }
  }

