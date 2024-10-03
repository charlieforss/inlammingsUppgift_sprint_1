public class MeatPlant extends Plant {
    //private static final double BASE_AMOUNT = 0.1;
    //private static final double EXTRA_RATE = 0.2;
    // gjorde dessa innan jag började på enums och har kvar som en annan variant på enums.

    public MeatPlant(String name, double height) {
        super(name, height);
    }
//constructor som i de andra klasserna för att få namn och höjd på planta
    @Override
    public double calculateDailyWater() {
        return WaterRate.MEATPLANT_BASE.rate()+WaterRate.MEATPLANT_EXTRA.rate()*height;
    }
//POLYMORFISM
    @Override
    public String getLiquidType() {
        return "proteindryck";
    }
}