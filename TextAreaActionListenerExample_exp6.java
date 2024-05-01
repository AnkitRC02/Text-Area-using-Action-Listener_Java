import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextAreaActionListenerExample_exp6 extends JFrame {

    public TextAreaActionListenerExample_exp6() {
        setTitle("TextArea with ActionListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a text area
        JTextArea textArea = new JTextArea(10, 20);
        textArea.setLineWrap(true); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Wrap at word boundaries

        // Create a label to display the result
        JLabel resultLabel = new JLabel("Result:");

        // Create a panel and add components to it
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER); // Add text area with scrollbars
        panel.add(resultLabel, BorderLayout.SOUTH);

        // Add a key listener to the text area to detect Enter key press
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // When Enter key is pressed, update the label with the text entered
                    String text = textArea.getText();
                    resultLabel.setText("Result: " + text);
                }
            }
        });

        // Add the panel to the frame
        add(panel);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextAreaActionListenerExample_exp6::new);
    }
}
