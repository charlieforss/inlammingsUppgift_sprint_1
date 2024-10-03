import javax.swing.*;
import java.util.Objects;

public class GreenestHotel {
    public static void main(String[] args) {
        // add all plants to the hotel
        Plant[] plants = {
                new Cactus("Igge", 0.2),
                new Palm("Laura", 5.0),
                new MeatPlant("Meatloaf", 0.7),
                new Palm("Olof", 1.0)
        };

        // take input from user
        String plantName = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
        // validera input från användaren
        if (Objects.isNull(plantName)) {
            JOptionPane.showMessageDialog(null, "Tråkigt att du inte ville använda programmet :(.");
            System.exit(0);
        }
        if (plantName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Du har inte matat in något namn, försök igen!");
            System.exit(0);
        }

        // iterate over all plants to check if user input exists in the hotel
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
