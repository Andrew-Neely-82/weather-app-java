import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

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
        addGuiComponents();
    }

    private void addGuiComponents() {
        JTextField searchTextField = new JTextField();
        searchTextField.setBounds(15, 15, 351, 45);
        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(searchTextField);

        JButton searchButton = new JButton(loadImage("src/assets/search.png"));
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375, 13, 47, 45);
        add(searchButton);

        // weather image
        JLabel weatherConditionImage = new JLabel(loadImage("src/assets/cloudy.png"));
        weatherConditionImage.setBounds(0, 125, 450, 217);
        add(weatherConditionImage);

        // temperature text
        JLabel temperatureText = new JLabel("10*C");
        temperatureText.setBounds(0, 350, 450, 54);
        temperatureText.setFont(new Font("Dialog", Font.BOLD, 48));
        temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
        add(temperatureText);

        // weather condition
        JLabel weatherCondition = new JLabel("Cloudy");
        weatherCondition.setBounds(0, 405, 450, 36);
        weatherCondition.setFont(new Font("Dialog", Font.PLAIN, 32));
        weatherCondition.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherCondition);
    }

    private ImageIcon loadImage(String path) {
        try {
            BufferedImage image = ImageIO.read(new File(path));
            return new ImageIcon(image);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Could not find resource");
        return null;
    }
}