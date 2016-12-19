package homeworks.projfinal;

import java.util.Map;

/**
 *
 * @author
 */
public class USCrimeClass {

    // The year will act as the key to finding a row of data.
    private int year;

    private int population;
    private int violentCrimes;
    private float violentCrimeRates;
    private int murders;
    private float murderRates;
    private int vehicleTheft;
    private float vehicleTheftRate;
    private int propertyCrime;
    private float propertyCrimeRate;
    private int robbery;
    private float robberyRate;

    public USCrimeClass(String line) {

        String[] stats = line.split(",");
        this.year = Integer.parseInt(stats[0]);
        this.population = Integer.parseInt(stats[1]);
        this.violentCrimes = Integer.parseInt(stats[2]);
        this.violentCrimeRates = Float.parseFloat(stats[3]);
        this.murders = Integer.parseInt(stats[4]);
        this.murderRates = Float.parseFloat(stats[5]);
        this.robbery = Integer.parseInt(stats[8]);
        this.robberyRate = Float.parseFloat(stats[9]);
        this.propertyCrime = Integer.parseInt(stats[12]);
        this.propertyCrimeRate = Float.parseFloat(stats[13]);
        this.vehicleTheft = Integer.parseInt(stats[18]);
        this.vehicleTheftRate = Float.parseFloat(stats[19]);
    }

    public int getYear() {
        return year;
    }

    public int getPopulation() {
        return population;
    }

    public int getViolentCrimes() {
        return violentCrimes;
    }

    public float getViolentCrimeRates() {
        return violentCrimeRates;
    }

    public int getMurders() {
        return murders;
    }

    public float getMurderRates() {
        return murderRates;
    }

    public int getVehicleTheft() {
        return vehicleTheft;
    }

    public float getVehicleTheftRate() {
        return vehicleTheftRate;
    }

    public int getPropertyCrime() {
        return propertyCrime;
    }

    public float getPropertyCrimeRate() {
        return propertyCrimeRate;
    }

    public int getRobbery() {
        return robbery;
    }

    public float getRobberyRate() {
        return robberyRate;
    }
    
    

}
