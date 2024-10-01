public class Palm extends Plant {
    private static final double WATER_RATE = 0.5;

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateDailyWater() {
        return WATER_RATE * height;
    }

    @Override
    public String getLiquidType() {
        return "kranvatten";
    }
}