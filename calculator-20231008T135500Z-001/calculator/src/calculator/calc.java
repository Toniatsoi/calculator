import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends JFrame {
    private JTextField textField;
    private String currentInput = "";
    private double result = 0.0;
    private char lastOperator = ' ';

    public calc() {
        setTitle("Scientific Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        panel.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    handleButtonClick(label);
                }
            });
            buttonPanel.add(button);
        }

        panel.add(buttonPanel, BorderLayout.CENTER);

        getContentPane().add(panel);
    }

    private void handleButtonClick(String label) {
        if (label.equals("=")) {
            calculateResult();
        } else {
            currentInput += label;
            textField.setText(currentInput);
        }
    }

    private void calculateResult() {
        try {
            double currentNumber = Double.parseDouble(currentInput);
            switch (lastOperator) {
                case '+':
                    result += currentNumber;
                    break;
                case '-':
                    result -= currentNumber;
                    break;
                case '*':
                    result *= currentNumber;
                    break;
                case '/':
                    if (currentNumber != 0) {
                        result /= currentNumber;
                    } else {
                        textField.setText("Error: Division by zero");
                        return;
                    }
                    break;
                default:
                    result = currentNumber;
                    break;
            }
            textField.setText(Double.toString(result));
            currentInput = "";
        } catch (NumberFormatException e) {
            textField.setText("Error: Invalid Input");
            currentInput = "";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }
}
