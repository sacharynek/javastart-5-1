public class Room {

    private double x, y, z, currentTemp, minTemp, airConditioningPowerInKw;
    private boolean hasAirConditioning;
    private double watPerCubic;
    private final int COOLING_TIME_PER_DEGREE = 30;

    public Room(double x, double y, double z, double currentTemp, double minTemp, double airConditioningPowerInKw, boolean hasAirConditioning) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.currentTemp = currentTemp;
        this.minTemp = minTemp;
        this.airConditioningPowerInKw = airConditioningPowerInKw;
        this.hasAirConditioning = hasAirConditioning;
        this.watPerCubic = airConditioningPowerInKw * 1000/calculateCubics();
    }

    public boolean turnTempDown(double d) {
        //tenary operator?
        if (currentTemp - d >= minTemp && isHasAirConditioning()) {
            currentTemp -= d;
            return true;
        }
        return false;
    }

    public boolean isMinAndCurrentTempEqual(){
        return currentTemp == minTemp;
    }

    private double calculateCubics() {
        return this.x * this.y * this.z;
    }

    public int calculateCoolingTime() {
        double coolingParam = 1;
        if (watPerCubic < 10) {
            coolingParam = 1.5;
        } else if(watPerCubic <45){
            coolingParam = 1;
        } else{
            coolingParam = 0.5;
        }

        return (int) (COOLING_TIME_PER_DEGREE * coolingParam);
    }

    public double getWatPerCubic() {
        return this.watPerCubic;
    }

    public boolean turnTempDown() {
        return turnTempDown(1.0);
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getCurrentTemp() {
        return currentTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public double getAirConditioningPowerInKw() {
        return airConditioningPowerInKw;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    @Override
    public String toString() {
        return "Current temperature in the room is " + currentTemp +
                " and minimal allowed temperature is " + minTemp;
    }
}
