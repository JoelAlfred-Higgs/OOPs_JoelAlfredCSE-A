import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SwingExample {

    public static void main(String[] args) {
        // Run the GUI creation on the Event Dispatch Thread (EDT) for thread safety
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // 1. Create the main window frame
        JFrame frame = new JFrame("Java Swing Complete Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null); // Centers the window on screen

        // 2. Create components
        JLabel inputLabel = new JLabel("Enter your name:");
        JTextField nameTextField = new JTextField(15);
        JButton greetButton = new JButton("Greet Me!");
        JLabel outputLabel = new JLabel("Welcome! Your greeting will appear here.");

        // 3. Arrange components in a layout panel
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(inputLabel);
        inputPanel.add(nameTextField);
        inputPanel.add(greetButton);

        JPanel outputPanel = new JPanel(new FlowLayout());
        outputPanel.add(outputLabel);

        // 4. Add panels to the frame's content pane
        frame.setLayout(new BorderLayout());
        frame.add(inputPanel, BorderLayout.CENTER);
        frame.add(outputPanel, BorderLayout.SOUTH);
        
        // 5. Add action listener (Event handling) to the button
        greetButton.addActionListener(e -> {
            String userName = nameTextField.getText().trim();
            if (userName.isEmpty()) {
                outputLabel.setText("Please enter a name first!");
            } else {
                outputLabel.setText("Hello, " + userName + "! Have a great day!");
            }
        });

        // 6. Make the window visible
        frame.setVisible(true);
    }
}
