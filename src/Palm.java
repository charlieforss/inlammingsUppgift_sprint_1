public class Palm extends Plant {
    private static final WaterRate waterRate = WaterRate.PALM;

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateDailyWater() {
        return waterRate.rate() * height;
    }

    @Override
    public String getLiquidType() {
        return "kranvatten";
    }
}