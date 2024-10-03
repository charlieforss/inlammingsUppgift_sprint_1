public enum WaterRate {
    PALM(0.5),
    CACTUS(0.2),
    MEATPLANT_BASE(0.1),
    MEATPLANT_EXTRA(0.2);

    private final Double rate;

    WaterRate(Double d) {
        this.rate = d;
    }

    public Double rate() {
        return this.rate;
    }
}
