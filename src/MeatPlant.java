public class MeatPlant extends Plant {
    private static final double BASE_AMOUNT = 0.1;
    private static final double EXTRA_RATE = 0.2;

    public MeatPlant(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateDailyWater() {
        return BASE_AMOUNT + (EXTRA_RATE * height);
    }

    @Override
    public String getLiquidType() {
        return "proteindryck";
    }
}