public class Cactus extends Plant {

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateDailyWater() {
        return WaterRate.CACTUS.rate();
    }

    @Override
    public String getLiquidType() {
        return "mineralvatten";
    }
}
