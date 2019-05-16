public class RoomBuilder {

    private double x, y, z, currentTemp, minTemp, airConditioningPowerInKw;
    private boolean hasAirConditioning;

    public RoomBuilder(){

    }

    public RoomBuilder(double x, double y, double z, double currentTemp, double minTemp, double airConditioningPowerInKw, boolean hasAirConditioning) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.currentTemp = currentTemp;
        this.minTemp = minTemp;
        this.airConditioningPowerInKw = airConditioningPowerInKw;
        this.hasAirConditioning = hasAirConditioning;
    }

    public RoomBuilder setX(double x) {
        this.x = x;
        return this;
    }

    public RoomBuilder setY(double y) {
        this.y = y;
        return this;
    }

    public RoomBuilder setZ(double z) {
        this.z = z;
        return this;
    }

    public RoomBuilder setCurrentTemp(double currentTemp) {
        this.currentTemp = currentTemp;
        return this;
    }

    public RoomBuilder setMinTemp(double minTemp) {
        this.minTemp = minTemp;
        return this;
    }

    public RoomBuilder setAirConditioningPowerInKw(double airConditioningPowerInKw) {
        this.airConditioningPowerInKw = airConditioningPowerInKw;
        return this;
    }

    public RoomBuilder setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
        return this;
    }


    public Room build() {
        return new Room(this.x, this.y, this.z, this.currentTemp, this.minTemp, this.airConditioningPowerInKw, this.hasAirConditioning);
    }
}
