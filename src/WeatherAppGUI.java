import javax.swing.*;

public class WeatherAppGUI extends JFrame {
    public WeatherAppGUI() {
        // Title
        super("Weather App");

        // config GUI to end processes once closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 650); // window sizing
        setLocationRelativeTo(null); // load gui to center of screen
        setLayout(null); // allows for manual positioning of components in GUI
        setResizable(false); // disables window resizing
    }
}