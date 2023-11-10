import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.util.Stack;
import java.util.StringTokenizer;

public class ContinuousCalculatorGUI extends JFrame {
    private JTextField display;
    private String currentInput = "";
    private boolean decimalAdded = false;

    public ContinuousCalculatorGUI() {
        setTitle("Scientific Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        JPanel panel = new JPanel(new GridLayout(5, 4));
        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "sqrt", "sin", "cos"
        };

        for (String buttonLabel : buttons) {
            JButton button = new JButton(buttonLabel);
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }
 
        // Add a KeyListener to handle keyboard input
        display.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isDigit(keyChar)) {
                    currentInput += keyChar;
                    display.setText(currentInput);
                } else if ("+-*/".indexOf(keyChar) >= 0) {
                    if (!currentInput.isEmpty()) {
                        currentInput += keyChar;
                        display.setText(currentInput);
                    }
                } else if (keyChar == '.' && !decimalAdded) {
                    currentInput += keyChar;
                    display.setText(currentInput);
                    decimalAdded = true; // Set the flag to true
                } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    //evaluateExpression();
                }
            }
        });
    }
    

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if ("0123456789".contains(command)) {
                currentInput += command;
                display.setText(currentInput);
            } else if ("+-*/".contains(command)) {
                if (!currentInput.isEmpty()) {
                    currentInput += command;
                    display.setText(currentInput);
                }
            } else if ("=".equals(command)) {
              //  evaluateExpression();
            } else if ("C".equals(command)) {
                currentInput = "";
                display.setText("");
                decimalAdded = false; // Reset the decimal flag
            } else if ("sqrt".equals(command)) {
                double inputValue = Double.parseDouble(currentInput);
                double result = Math.sqrt(inputValue);
                currentInput = Double.toString(result);
                display.setText(currentInput);
            } else if ("sin".equals(command)) {
                double inputValue = Double.parseDouble(currentInput);
                double result = Math.sin(Math.toRadians(inputValue));
                currentInput = Double.toString(result);
                display.setText(currentInput);
            } else if ("cos".equals(command)) {
                double inputValue = Double.parseDouble(currentInput);
                double result = Math.cos(Math.toRadians(inputValue));
                currentInput = Double.toString(result);
                display.setText(currentInput);
            }
        }
    }

    // Other methods (evaluateExpression, isNumeric, isOperator, hasPrecedence, applyOperator) remain the same

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ContinuousCalculatorGUI calculator = new ContinuousCalculatorGUI();
            calculator.setVisible(true);
        });
    }
}
