package devoir6;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

public class WeatherIconManager {
    private Map<String, ImageIcon> weatherIcons;

    public WeatherIconManager() {
        weatherIcons = new HashMap<>();

        //On  Charge les icônes météorologiques correspondantes
        weatherIcons.put("clear", createImageIcon("sun.jpg"));
        weatherIcons.put("clouds", createImageIcon("cloudy.jpg"));
        weatherIcons.put("rain", createImageIcon("rain.jpg"));
        weatherIcons.put("snow", createImageIcon("snow.jpg"));
        weatherIcons.put("Windy", createImageIcon("windy.jpg"));

    }

    public ImageIcon getWeatherIcon(String weatherCondition) {
        ImageIcon icon = weatherIcons.get(weatherCondition);
        if (icon != null) {
            return icon;
        } else {
            // Condition pour si aucune icône n'est trouvée
            return new ImageIcon();
        }
    }

    private ImageIcon createImageIcon(String path) {
        Image image = new ImageIcon(this.getClass().getResource(path)).getImage();
        return new ImageIcon(image);
    }

}