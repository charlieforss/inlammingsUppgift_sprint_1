import javax.swing.*;

public class GreenestHotel {
    public static void main(String[] args) {
        Plant[] plants = {
                new Cactus("Igge", 0.2),
                new Palm("Laura", 5.0),
                new MeatPlant("Meatloaf", 0.7),
                new Palm("Olof", 1.0)
        };

        String plantName = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
        Plant selectedPlant = null;

        for (Plant plant : plants) {
            if (plant.getName().equalsIgnoreCase(plantName)) {
                selectedPlant = plant;
                break;
            }
        }

        if (selectedPlant != null) {
            String message = String.format("%s ska ha %.2f liter %s per dag.",
                    selectedPlant.getName(),
                    selectedPlant.calculateDailyWater(),
                    selectedPlant.getLiquidType());
            JOptionPane.showMessageDialog(null, message);
        } else {
            JOptionPane.showMessageDialog(null, "Växten finns inte på hotellet.");
        }
    }
}
