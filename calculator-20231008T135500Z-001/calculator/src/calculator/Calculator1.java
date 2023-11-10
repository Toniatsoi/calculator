package calculator;
import java.text.DecimalFormat;

public class Calculator1 extends javax.swing.JFrame {
   
  private static final DecimalFormat df = new DecimalFormat("0.00");
  private boolean operatorTyped = false;
  private boolean decimalAdded = false; 
  private boolean operate = false;
 
  public Calculator1() {
        initComponents();
     convert.setVisible(false);
    }
  
  public void calculate(){
      String expression = nor.getText();
    try {
        double result = evaluateExpression(expression);
        String formattedResult;

        if (result == (int) result) {
            formattedResult = String.format("%d", (int) result);
            decimalAdded = false;
        } else {
            formattedResult = String.format("%.2f", result);
            decimalAdded = true;
            
        }

        nor.setText(formattedResult);
    } catch (Exception ex) {
       nor.setText("");
    }
    operate = false;
 }
  private boolean isOperator(String input) {
    return "+-*/".contains(input);
 }
  
  public void HexToBinary() {
    String hexInput = hex.getText();
    try {
        String[] parts = hexInput.split("\\.");
        if (parts.length == 1) {
            String binaryValue = String.format("%4s", Integer.toBinaryString(Integer.parseInt(parts[0], 16))).replace(' ', '0');
            binary.setText(binaryValue.substring(0, Math.min(21, binaryValue.length())));
        } else if (parts.length == 2) {
            String binaryIntPart = String.format("%4s", Integer.toBinaryString(Integer.parseInt(parts[0], 16))).replace(' ', '0');
            StringBuilder binaryFractionalPart = new StringBuilder(".");
            String fractionalHexPart = parts[1];
            for (int i = 0; i < fractionalHexPart.length(); i++) {
                int decimalValue = Integer.parseInt(String.valueOf(fractionalHexPart.charAt(i)), 16);
                String binaryPart = Integer.toBinaryString(decimalValue);
                while (binaryPart.length() < 4) {
                    binaryPart = "0" + binaryPart;
                }
                binaryFractionalPart.append(binaryPart);
            }
            String binaryResult = binaryIntPart + binaryFractionalPart.toString();
            binary.setText(binaryResult.substring(0, Math.min(21, binaryResult.length())));
        } else {
            binary.setText("Invalid Hexadecimal");
        }
    } catch (NumberFormatException ex) {
            binary.setText("Invalid Hexadecimal");
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        convert = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        d1 = new javax.swing.JButton();
        e1 = new javax.swing.JButton();
        f1 = new javax.swing.JButton();
        zero1 = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        nine1 = new javax.swing.JButton();
        eight1 = new javax.swing.JButton();
        seven1 = new javax.swing.JButton();
        five1 = new javax.swing.JButton();
        four1 = new javax.swing.JButton();
        six1 = new javax.swing.JButton();
        equals1 = new javax.swing.JButton();
        three1 = new javax.swing.JButton();
        one1 = new javax.swing.JButton();
        clr1 = new javax.swing.JButton();
        two1 = new javax.swing.JButton();
        cal = new javax.swing.JButton();
        hex = new javax.swing.JTextField();
        delete1 = new javax.swing.JButton();
        binary = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        zero2 = new javax.swing.JButton();
        normal = new javax.swing.JPanel();
        zero = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        five = new javax.swing.JButton();
        four = new javax.swing.JButton();
        six = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        three = new javax.swing.JButton();
        one = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        deci = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        two = new javax.swing.JButton();
        bsn = new javax.swing.JButton();
        nor = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        negate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        convert.setBackground(new java.awt.Color(0, 0, 0));
        convert.setPreferredSize(new java.awt.Dimension(355, 441));
        convert.setLayout(null);

        b1.setBackground(new java.awt.Color(0, 0, 0));
        b1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 102, 204));
        b1.setText("B");
        b1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        convert.add(b1);
        b1.setBounds(210, 200, 50, 50);

        c1.setBackground(new java.awt.Color(0, 0, 0));
        c1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        c1.setForeground(new java.awt.Color(0, 102, 204));
        c1.setText("C");
        c1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        convert.add(c1);
        c1.setBounds(210, 260, 50, 50);

        d1.setBackground(new java.awt.Color(0, 0, 0));
        d1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        d1.setForeground(new java.awt.Color(0, 102, 204));
        d1.setText("D");
        d1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });
        convert.add(d1);
        d1.setBounds(270, 140, 50, 50);

        e1.setBackground(new java.awt.Color(0, 0, 0));
        e1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        e1.setForeground(new java.awt.Color(0, 102, 204));
        e1.setText("E");
        e1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        convert.add(e1);
        e1.setBounds(270, 200, 50, 50);

        f1.setBackground(new java.awt.Color(0, 0, 0));
        f1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        f1.setForeground(new java.awt.Color(0, 102, 204));
        f1.setText("F");
        f1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });
        convert.add(f1);
        f1.setBounds(270, 260, 50, 50);

        zero1.setBackground(new java.awt.Color(0, 0, 0));
        zero1.setForeground(new java.awt.Color(255, 255, 255));
        zero1.setText("0");
        zero1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        zero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero1ActionPerformed(evt);
            }
        });
        convert.add(zero1);
        zero1.setBounds(30, 320, 50, 50);

        a1.setBackground(new java.awt.Color(0, 0, 0));
        a1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        a1.setForeground(new java.awt.Color(0, 102, 204));
        a1.setText("A");
        a1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        convert.add(a1);
        a1.setBounds(210, 140, 50, 50);

        nine1.setBackground(new java.awt.Color(0, 0, 0));
        nine1.setForeground(new java.awt.Color(255, 255, 255));
        nine1.setText("9");
        nine1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        nine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nine1ActionPerformed(evt);
            }
        });
        convert.add(nine1);
        nine1.setBounds(150, 140, 50, 50);

        eight1.setBackground(new java.awt.Color(0, 0, 0));
        eight1.setForeground(new java.awt.Color(255, 255, 255));
        eight1.setText("8");
        eight1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        eight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eight1ActionPerformed(evt);
            }
        });
        convert.add(eight1);
        eight1.setBounds(90, 140, 50, 50);

        seven1.setBackground(new java.awt.Color(0, 0, 0));
        seven1.setForeground(new java.awt.Color(255, 255, 255));
        seven1.setText("7");
        seven1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        seven1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven1ActionPerformed(evt);
            }
        });
        convert.add(seven1);
        seven1.setBounds(30, 140, 50, 50);

        five1.setBackground(new java.awt.Color(0, 0, 0));
        five1.setForeground(new java.awt.Color(255, 255, 255));
        five1.setText("5");
        five1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        five1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five1ActionPerformed(evt);
            }
        });
        convert.add(five1);
        five1.setBounds(90, 200, 50, 50);

        four1.setBackground(new java.awt.Color(0, 0, 0));
        four1.setForeground(new java.awt.Color(255, 255, 255));
        four1.setText("4");
        four1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        four1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four1ActionPerformed(evt);
            }
        });
        convert.add(four1);
        four1.setBounds(150, 200, 50, 50);

        six1.setBackground(new java.awt.Color(0, 0, 0));
        six1.setForeground(new java.awt.Color(255, 255, 255));
        six1.setText("6");
        six1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        six1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                six1ActionPerformed(evt);
            }
        });
        convert.add(six1);
        six1.setBounds(30, 200, 50, 50);

        equals1.setBackground(new java.awt.Color(102, 102, 102));
        equals1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        equals1.setForeground(new java.awt.Color(255, 255, 255));
        equals1.setText("=");
        equals1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        equals1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equals1ActionPerformed(evt);
            }
        });
        convert.add(equals1);
        equals1.setBounds(150, 380, 170, 50);

        three1.setBackground(new java.awt.Color(0, 0, 0));
        three1.setForeground(new java.awt.Color(255, 255, 255));
        three1.setText("3");
        three1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        three1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three1ActionPerformed(evt);
            }
        });
        convert.add(three1);
        three1.setBounds(30, 260, 50, 50);

        one1.setBackground(new java.awt.Color(0, 0, 0));
        one1.setForeground(new java.awt.Color(255, 255, 255));
        one1.setText("1");
        one1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        one1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one1ActionPerformed(evt);
            }
        });
        convert.add(one1);
        one1.setBounds(150, 260, 50, 50);

        clr1.setBackground(new java.awt.Color(0, 0, 0));
        clr1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clr1.setForeground(new java.awt.Color(204, 0, 51));
        clr1.setText("CLR");
        clr1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        clr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr1ActionPerformed(evt);
            }
        });
        convert.add(clr1);
        clr1.setBounds(240, 320, 80, 50);

        two1.setBackground(new java.awt.Color(0, 0, 0));
        two1.setForeground(new java.awt.Color(255, 255, 255));
        two1.setText("2");
        two1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        two1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two1ActionPerformed(evt);
            }
        });
        convert.add(two1);
        two1.setBounds(90, 260, 50, 50);

        cal.setBackground(new java.awt.Color(0, 0, 0));
        cal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cal.setForeground(new java.awt.Color(255, 255, 255));
        cal.setText("CALCULATOR");
        cal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calActionPerformed(evt);
            }
        });
        convert.add(cal);
        cal.setBounds(30, 380, 110, 50);

        hex.setBackground(new java.awt.Color(102, 102, 102));
        hex.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hex.setForeground(new java.awt.Color(255, 255, 255));
        hex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexActionPerformed(evt);
            }
        });
        hex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hexKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hexKeyTyped(evt);
            }
        });
        convert.add(hex);
        hex.setBounds(30, 40, 290, 30);

        delete1.setBackground(new java.awt.Color(0, 0, 0));
        delete1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delete1.setForeground(new java.awt.Color(204, 0, 51));
        delete1.setText("DLT");
        delete1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        convert.add(delete1);
        delete1.setBounds(150, 320, 80, 50);

        binary.setBackground(new java.awt.Color(153, 153, 153));
        binary.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        binary.setForeground(new java.awt.Color(255, 255, 255));
        binary.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        convert.add(binary);
        binary.setBounds(30, 100, 290, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("HEXADECIMAL");
        convert.add(jLabel2);
        jLabel2.setBounds(30, 10, 150, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("BINARY");
        convert.add(jLabel3);
        jLabel3.setBounds(30, 70, 150, 30);

        zero2.setBackground(new java.awt.Color(0, 0, 0));
        zero2.setForeground(new java.awt.Color(255, 255, 255));
        zero2.setText(".");
        zero2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        zero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero2ActionPerformed(evt);
            }
        });
        convert.add(zero2);
        zero2.setBounds(90, 320, 50, 50);

        normal.setBackground(new java.awt.Color(0, 0, 0));
        normal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        normal.setForeground(new java.awt.Color(0, 102, 204));
        normal.setPreferredSize(new java.awt.Dimension(355, 441));
        normal.setRequestFocusEnabled(false);
        normal.setVerifyInputWhenFocusTarget(false);
        normal.setLayout(null);

        zero.setBackground(new java.awt.Color(0, 0, 0));
        zero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        zero.setForeground(new java.awt.Color(255, 255, 255));
        zero.setText("0");
        zero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        normal.add(zero);
        zero.setBounds(210, 320, 50, 50);

        nine.setBackground(new java.awt.Color(0, 0, 0));
        nine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nine.setForeground(new java.awt.Color(255, 255, 255));
        nine.setText("9");
        nine.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        nine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nineKeyPressed(evt);
            }
        });
        normal.add(nine);
        nine.setBounds(150, 200, 50, 50);

        eight.setBackground(new java.awt.Color(0, 0, 0));
        eight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eight.setForeground(new java.awt.Color(255, 255, 255));
        eight.setText("8");
        eight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        normal.add(eight);
        eight.setBounds(90, 200, 50, 50);

        seven.setBackground(new java.awt.Color(0, 0, 0));
        seven.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seven.setForeground(new java.awt.Color(255, 255, 255));
        seven.setText("7");
        seven.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        normal.add(seven);
        seven.setBounds(30, 200, 50, 50);

        five.setBackground(new java.awt.Color(0, 0, 0));
        five.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        five.setForeground(new java.awt.Color(255, 255, 255));
        five.setText("5");
        five.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        normal.add(five);
        five.setBounds(90, 260, 50, 50);

        four.setBackground(new java.awt.Color(0, 0, 0));
        four.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        four.setForeground(new java.awt.Color(255, 255, 255));
        four.setText("4");
        four.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        normal.add(four);
        four.setBounds(30, 260, 50, 50);

        six.setBackground(new java.awt.Color(0, 0, 0));
        six.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        six.setForeground(new java.awt.Color(255, 255, 255));
        six.setText("6");
        six.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        normal.add(six);
        six.setBounds(150, 260, 50, 50);

        equals.setBackground(new java.awt.Color(102, 102, 102));
        equals.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        equals.setForeground(new java.awt.Color(255, 255, 255));
        equals.setText("=");
        equals.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });
        normal.add(equals);
        equals.setBounds(180, 380, 140, 50);

        three.setBackground(new java.awt.Color(0, 0, 0));
        three.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        three.setForeground(new java.awt.Color(255, 255, 255));
        three.setText("3");
        three.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        normal.add(three);
        three.setBounds(150, 320, 50, 50);

        one.setBackground(new java.awt.Color(0, 0, 0));
        one.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        one.setForeground(new java.awt.Color(255, 255, 255));
        one.setText("1");
        one.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        normal.add(one);
        one.setBounds(30, 320, 50, 50);

        clr.setBackground(new java.awt.Color(0, 0, 0));
        clr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clr.setForeground(new java.awt.Color(204, 0, 51));
        clr.setText("CLR");
        clr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });
        normal.add(clr);
        clr.setBounds(270, 140, 50, 110);

        deci.setBackground(new java.awt.Color(0, 0, 0));
        deci.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deci.setForeground(new java.awt.Color(255, 255, 255));
        deci.setText(".");
        deci.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        deci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deciActionPerformed(evt);
            }
        });
        normal.add(deci);
        deci.setBounds(210, 260, 50, 50);

        plus.setBackground(new java.awt.Color(0, 0, 0));
        plus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        plus.setForeground(new java.awt.Color(0, 102, 204));
        plus.setText("+");
        plus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        plus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                plusKeyPressed(evt);
            }
        });
        normal.add(plus);
        plus.setBounds(30, 140, 50, 50);

        minus.setBackground(new java.awt.Color(0, 0, 0));
        minus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        minus.setForeground(new java.awt.Color(0, 102, 204));
        minus.setText("-");
        minus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        normal.add(minus);
        minus.setBounds(210, 140, 50, 50);

        multiply.setBackground(new java.awt.Color(0, 0, 0));
        multiply.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multiply.setForeground(new java.awt.Color(0, 102, 204));
        multiply.setText("X");
        multiply.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });
        normal.add(multiply);
        multiply.setBounds(90, 140, 50, 50);

        divide.setBackground(new java.awt.Color(0, 0, 0));
        divide.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        divide.setForeground(new java.awt.Color(0, 102, 204));
        divide.setText("÷");
        divide.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        normal.add(divide);
        divide.setBounds(150, 140, 50, 50);

        two.setBackground(new java.awt.Color(0, 0, 0));
        two.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        two.setForeground(new java.awt.Color(255, 255, 255));
        two.setText("2");
        two.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        two.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                twoKeyPressed(evt);
            }
        });
        normal.add(two);
        two.setBounds(90, 320, 50, 50);

        bsn.setBackground(new java.awt.Color(0, 0, 0));
        bsn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bsn.setForeground(new java.awt.Color(255, 255, 255));
        bsn.setText("BASE N");
        bsn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        bsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsnActionPerformed(evt);
            }
        });
        normal.add(bsn);
        bsn.setBounds(30, 380, 140, 50);

        nor.setBackground(new java.awt.Color(102, 102, 102));
        nor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nor.setForeground(new java.awt.Color(255, 255, 255));
        nor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                norActionPerformed(evt);
            }
        });
        normal.add(nor);
        nor.setBounds(30, 60, 290, 60);

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(204, 0, 51));
        delete.setText("DLT");
        delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        normal.add(delete);
        delete.setBounds(270, 260, 50, 110);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CASIO NI");
        normal.add(jLabel1);
        jLabel1.setBounds(30, 20, 130, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("fx-570Gwap0");
        normal.add(jLabel4);
        jLabel4.setBounds(240, 30, 80, 16);

        negate.setBackground(new java.awt.Color(0, 0, 0));
        negate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        negate.setForeground(new java.awt.Color(255, 255, 255));
        negate.setText("+/-");
        negate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        negate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negateActionPerformed(evt);
            }
        });
        normal.add(negate);
        negate.setBounds(210, 200, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(normal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(convert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(normal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(convert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        hex.setText(hex.getText() + "B");
    }//GEN-LAST:event_b1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        hex.setText(hex.getText() + "C");
    }//GEN-LAST:event_c1ActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        hex.setText(hex.getText() + "D");
    }//GEN-LAST:event_d1ActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        hex.setText(hex.getText() + "E");
    }//GEN-LAST:event_e1ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        hex.setText(hex.getText() + "F");
    }//GEN-LAST:event_f1ActionPerformed

    private void zero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero1ActionPerformed
       hex.setText(hex.getText() + "0");
    }//GEN-LAST:event_zero1ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        hex.setText(hex.getText() + "A");
    }//GEN-LAST:event_a1ActionPerformed

    private void nine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nine1ActionPerformed
       hex.setText(hex.getText() + "9");
    }//GEN-LAST:event_nine1ActionPerformed

    private void eight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eight1ActionPerformed
      hex.setText(hex.getText() + "8");
    }//GEN-LAST:event_eight1ActionPerformed

    private void seven1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven1ActionPerformed
       hex.setText(hex.getText() + "7");
    }//GEN-LAST:event_seven1ActionPerformed

    private void five1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five1ActionPerformed
       hex.setText(hex.getText() + "5");
    }//GEN-LAST:event_five1ActionPerformed

    private void four1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four1ActionPerformed
        hex.setText(hex.getText() + "4");
    }//GEN-LAST:event_four1ActionPerformed

    private void six1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_six1ActionPerformed
       hex.setText(hex.getText() + "6");
    }//GEN-LAST:event_six1ActionPerformed

    private void equals1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equals1ActionPerformed
     HexToBinary();
    }//GEN-LAST:event_equals1ActionPerformed

    private void three1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three1ActionPerformed
        hex.setText(hex.getText() + "3");
    }//GEN-LAST:event_three1ActionPerformed

    private void one1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one1ActionPerformed
        hex.setText(hex.getText() + "1");
    }//GEN-LAST:event_one1ActionPerformed

    private void clr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr1ActionPerformed
        hex.setText("");
        binary.setText(""); 
        decimalAdded = false;
    }//GEN-LAST:event_clr1ActionPerformed

    private void two1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two1ActionPerformed
       hex.setText(hex.getText() + "2");
    }//GEN-LAST:event_two1ActionPerformed

    private void calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calActionPerformed
     convert.setVisible(false);
     normal.setVisible(true);
     nor.setText("");
     decimalAdded = false;
    }//GEN-LAST:event_calActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
         int length = hex.getText().length();
         int num = hex.getText().length()-1;
         String store;
         if (length >0){
             StringBuilder back = new StringBuilder (hex.getText());
             back.deleteCharAt(num);
             store = back.toString();
             hex.setText(store);
             binary.setText("");
         }
         decimalAdded = false;
    }//GEN-LAST:event_delete1ActionPerformed

    private void hexKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hexKeyPressed
        
    }//GEN-LAST:event_hexKeyPressed

    private void hexKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hexKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_hexKeyTyped

    private void hexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hexActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int length = nor.getText().length();
        int num = nor.getText().length()-1;
        String store;
        if (length >0){
            StringBuilder back = new StringBuilder (nor.getText());
            back.deleteCharAt(num);
            store = back.toString();
            nor.setText(store);
        }
         decimalAdded = false;
         operate = false;
    }//GEN-LAST:event_deleteActionPerformed

    private void norActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_norActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_norActionPerformed

    private void bsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsnActionPerformed
        normal.setVisible(false);
        convert.setVisible(true);
        hex.setText("");
        binary.setText(""); 
        decimalAdded = false;
    }//GEN-LAST:event_bsnActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        nor.setText(nor.getText() + "2");
        operate = false;
    }//GEN-LAST:event_twoActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
    if (!operate) {
        if(nor.getText().equals("")){
           operate = false; 
        }else{
        nor.setText(nor.getText() + "/");
        operate = true;
        }
    }
        decimalAdded = false;
        
    }//GEN-LAST:event_divideActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
    if (!operate) {
        if(nor.getText().equals("")){
           operate = false; 
        }else{
        nor.setText(nor.getText() + "*");
        operate = true;
        }
    }
        decimalAdded = false;
        
    }//GEN-LAST:event_multiplyActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
    if (!operate) {
        nor.setText(nor.getText() + "-");
        operate = true;
    }
        decimalAdded = false;
    }//GEN-LAST:event_minusActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        if (!operate) {
            nor.setText(nor.getText() + "+");
            operate = true;
        }
       decimalAdded = false;
    }//GEN-LAST:event_plusActionPerformed

    private void deciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deciActionPerformed
        if (!decimalAdded) {
            nor.setText(nor.getText() + ".");
            decimalAdded = true;
        }
        //operate = true;
    }//GEN-LAST:event_deciActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        nor.setText(""); 
        decimalAdded = false;
        operate = false;
    }//GEN-LAST:event_clrActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        nor.setText(nor.getText() + "1");
        operate = false;
    }//GEN-LAST:event_oneActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        nor.setText(nor.getText() + "3");
        operate = false;
    }//GEN-LAST:event_threeActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
         calculate();  
    }//GEN-LAST:event_equalsActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        nor.setText(nor.getText() + "6");
        operate = false;
    }//GEN-LAST:event_sixActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        nor.setText(nor.getText() + "4");
        operate = false;
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        nor.setText(nor.getText() + "5");
        operate = false;
    }//GEN-LAST:event_fiveActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        nor.setText(nor.getText() + "7");
        operate = false;
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        nor.setText(nor.getText() + "8");
        operate = false;
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        nor.setText(nor.getText() + "9");
        operate = false;
    }//GEN-LAST:event_nineActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        nor.setText(nor.getText() + "0");
        operate = false;
    }//GEN-LAST:event_zeroActionPerformed

    private void negateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negateActionPerformed
      try {
    String input = nor.getText();
        int lastIndex = -1;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                lastIndex = i;
            }
        }
        if (lastIndex != -1) {
            String beforeOperator = input.substring(0, lastIndex + 1);
            String afterOperator = input.substring(lastIndex + 1);
            if (afterOperator.contains(".")) {
                double number = Double.parseDouble(afterOperator);
                number = -number;
                afterOperator = String.valueOf(number);
            } else {
                int number = Integer.parseInt(afterOperator);
                number = -number;
                afterOperator = String.valueOf(number);
            }
            String updatedInput = beforeOperator + afterOperator;
            nor.setText(updatedInput.replaceAll("--", ""));
        } else { 
            if (input.startsWith("-")) { 
                nor.setText(input.substring(1));
            } else { 
                nor.setText("-" + input);
            }
        }
    } catch (NumberFormatException ex) { // Handle NumberFormatException
    }
    }//GEN-LAST:event_negateActionPerformed

    private void zero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero2ActionPerformed
     if (!decimalAdded && !operatorTyped) {
            hex.setText(hex.getText() + ".");
            decimalAdded = true;
     } else if (operatorTyped && !decimalAdded) {
            decimalAdded = true;
     }
    }//GEN-LAST:event_zero2ActionPerformed

    private void nineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nineKeyPressed
   
    }//GEN-LAST:event_nineKeyPressed

    private void twoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_twoKeyPressed
    
    }//GEN-LAST:event_twoKeyPressed

    private void plusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plusKeyPressed
   
    }//GEN-LAST:event_plusKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator1().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton b1;
    private javax.swing.JLabel binary;
    private javax.swing.JButton bsn;
    private javax.swing.JButton c1;
    private javax.swing.JButton cal;
    private javax.swing.JButton clr;
    private javax.swing.JButton clr1;
    private javax.swing.JPanel convert;
    private javax.swing.JButton d1;
    private javax.swing.JButton deci;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JButton divide;
    private javax.swing.JButton e1;
    private javax.swing.JButton eight;
    private javax.swing.JButton eight1;
    private javax.swing.JButton equals;
    private javax.swing.JButton equals1;
    private javax.swing.JButton f1;
    private javax.swing.JButton five;
    private javax.swing.JButton five1;
    private javax.swing.JButton four;
    private javax.swing.JButton four1;
    private javax.swing.JTextField hex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton negate;
    private javax.swing.JButton nine;
    private javax.swing.JButton nine1;
    private javax.swing.JTextField nor;
    private javax.swing.JPanel normal;
    private javax.swing.JButton one;
    private javax.swing.JButton one1;
    private javax.swing.JButton plus;
    private javax.swing.JButton seven;
    private javax.swing.JButton seven1;
    private javax.swing.JButton six;
    private javax.swing.JButton six1;
    private javax.swing.JButton three;
    private javax.swing.JButton three1;
    private javax.swing.JButton two;
    private javax.swing.JButton two1;
    private javax.swing.JButton zero;
    private javax.swing.JButton zero1;
    private javax.swing.JButton zero2;
    // End of variables declaration//GEN-END:variables
     private static double evaluateExpression(String expression) {
        try {
            return new Object() {
                int pos = -1, ch;

                void nextChar() {
                    ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
                }

                boolean eat(int charToEat) {
                    while (Character.isWhitespace(ch)) nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }

                double parse() {
                    nextChar();
                    double x = parseExpression();
                    if (pos < expression.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                    return x;
                }

                double parseExpression() {
                    double x = parseTerm();
                    for (; ; ) {
                        if (eat('+')) x += parseTerm(); // addition
                        else if (eat('-')) x -= parseTerm(); // subtraction
                        else return x;
                    }
                }

                double parseTerm() {
                    double x = parseFactor();
                    for (; ; ) {
                        if (eat('*')) x *= parseFactor(); // multiplication
                        else if (eat('/')) x /= parseFactor(); // division
                        else return x;
                    }
                }

                double parseFactor() {
                    if (eat('+')) return parseFactor(); // unary plus
                    if (eat('-')) return -parseFactor(); // unary minus

                    double x;
                    int startPos = this.pos;
                    if (eat('(')) { // parentheses
                        x = parseExpression();
                        eat(')');
                    } else if (Character.isDigit(ch) || ch == '.') { // numbers
                        while (Character.isDigit(ch) || ch == '.') nextChar();
                        x = Double.parseDouble(expression.substring(startPos, this.pos));
                    } else {
                        throw new RuntimeException("Unexpected: " + (char) ch);
                    }

                    return x;
                }
            }.parse();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid expression: " + expression);
        }
    }
}