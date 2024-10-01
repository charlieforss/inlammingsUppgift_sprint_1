public class Cactus extends Plant {
    private static final double WATER_AMOUNT = 0.02; // 2 cl

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateDailyWater() {
        return WATER_AMOUNT;
    }

    @Override
    public String getLiquidType() {
        return "mineralvatten";
    }
}
