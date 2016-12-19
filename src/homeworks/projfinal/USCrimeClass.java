package homeworks.projfinal;

/**
 *
 * @author 
 */
public class USCrimeClass {

        private float rateOfMurder;
    private float rateOfRobbery;
    private int propertyCrime;
    private int   population;
    private int   motorVehicleTheft;
    private final int   year;
    
    public float getMurderRate() {
        return rateOfMurder;
    }

    public void setMurderRate(float murderRate) {
        this.rateOfMurder = murderRate;
    }

    public float getRobberyRate() {
        return rateOfRobbery;
    }

    public void setRobberyRate(float robberyRate) {
        this.rateOfRobbery = robberyRate;
    }

    public void pop(int propertyCrime) {
        this.propertyCrime = propertyCrime;
    }
    
    public int getPropertyCrime() {
        return propertyCrime;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getMotorVehicleTheft() {
        return motorVehicleTheft;
    }

    public void setMotorVehicleTheft(int motorVehicleTheft) {
        this.motorVehicleTheft = motorVehicleTheft;
    }
    
    public int getYear() {
        return year;
    }
    
    public USCrimeClass(int year) {
        this.year = year;
    }
    

    
}
