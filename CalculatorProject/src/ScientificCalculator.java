import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.SwingConstants;

public class ScientificCalculator extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTextField textField;

  private String decimalFormat = "%.4f";

  double firstOperand;
  double secondOperand;
  double result;
  String operation;
  String answer;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          ScientificCalculator frame = new ScientificCalculator();
          frame.setResizable(false);
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public ScientificCalculator() {
    setTitle("Scientific Calculator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 530, 570);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    setContentPane(contentPane);
    
    JButton btnOne = new JButton("1");
    btnOne.setBounds(10, 272, 65, 65);
    btnOne.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnOne.setBackground(Color.WHITE);
    btnOne.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnOne.getText();
        textField.setText(number);
      }
    });
    contentPane.setLayout(null);
    
    JLabel lblCalcLabel = new JLabel("Version 1.0    https://github.com/gjinrexhaj");
    lblCalcLabel.setBounds(10, 506, 307, 14);
    contentPane.add(lblCalcLabel);
    
    JButton btnNine = new JButton("9");
    btnNine.setBounds(160, 120, 65, 65);
    btnNine.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnNine.setBackground(Color.WHITE);
    btnNine.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnNine.getText();
        textField.setText(number);
      }
    });
    contentPane.add(btnNine);
    
    JButton btnEight = new JButton("8");
    btnEight.setBounds(85, 120, 65, 65);
    btnEight.setBackground(Color.WHITE);
    btnEight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnEight.getText();
        textField.setText(number);
      }
    });
    btnEight.setFont(new Font("Tahoma", Font.PLAIN, 22));
    contentPane.add(btnEight);
    
    JButton btnSeven = new JButton("7");
    btnSeven.setBounds(10, 120, 65, 65);
    btnSeven.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnSeven.setBackground(Color.WHITE);
    btnSeven.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnSeven.getText();
        textField.setText(number);
      }
    });
    contentPane.add(btnSeven);
    
    JButton btnSix = new JButton("6");
    btnSix.setBounds(160, 196, 65, 65);
    btnSix.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnSix.setBackground(Color.WHITE);
    btnSix.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnSix.getText();
        textField.setText(number);
      }
    });
    contentPane.add(btnSix);
    
    JButton btnFive = new JButton("5");
    btnFive.setBounds(85, 196, 65, 65);
    btnFive.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnFive.setBackground(Color.WHITE);
    btnFive.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnFive.getText();
        textField.setText(number);
      }
    });
    contentPane.add(btnFive);
    
    JButton btnFour = new JButton("4");
    btnFour.setBounds(10, 196, 65, 65);
    btnFour.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnFour.setBackground(Color.WHITE);
    btnFour.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnFour.getText();
        textField.setText(number);
      }
    });
    contentPane.add(btnFour);
    
    JButton btnThree = new JButton("3");
    btnThree.setBounds(160, 272, 65, 65);
    btnThree.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnThree.setBackground(Color.WHITE);
    btnThree.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnThree.getText();
        textField.setText(number);
      }
    });
    contentPane.add(btnThree);
    
    JButton btnTwo = new JButton("2");
    btnTwo.setBounds(84, 272, 66, 65);
    btnTwo.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnTwo.setBackground(Color.WHITE);
    btnTwo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnTwo.getText();
        textField.setText(number);
      }
    });
    contentPane.add(btnTwo);
    contentPane.add(btnOne);
    
    JButton btnDecimal = new JButton(".");
    btnDecimal.setBounds(85, 348, 65, 65);
    btnDecimal.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnDecimal.setBackground(Color.WHITE);
    btnDecimal.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnDecimal.getText();
        textField.setText(number);
      }
    });
    contentPane.add(btnDecimal);
    
    JButton btnEquals = new JButton("=");
    btnEquals.setToolTipText("Equals");
    btnEquals.setBounds(160, 426, 65, 65);
    btnEquals.setBackground(Color.GREEN);
    btnEquals.setForeground(Color.BLACK);
    btnEquals.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        secondOperand = Double.parseDouble(textField.getText());
        // if statement to check and perform operations
        if (operation == "+") {
          result = firstOperand + secondOperand;
          answer = String.format(decimalFormat, result);
          textField.setText(answer); 
        } else if (operation == "-") {
          result = firstOperand - secondOperand;
          answer = String.format(decimalFormat, result);
          textField.setText(answer); 
        }else if (operation == "x") {
          result = firstOperand * secondOperand;
          answer = String.format(decimalFormat, result);
          textField.setText(answer); 
        }else if (operation == "/") {
          result = firstOperand / secondOperand;
          answer = String.format(decimalFormat, result);
          textField.setText(answer); 
        }else if (operation == "mod") {
          result = firstOperand % secondOperand;
          answer = String.format(decimalFormat, result);
          textField.setText(answer); 
        }
        
      }
    });
    btnEquals.setFont(new Font("Tahoma", Font.BOLD, 22));
    contentPane.add(btnEquals);
    
    JButton btnClearEverything = new JButton("CE");
    btnClearEverything.setToolTipText("Clear everything (textfield and operation chain)");
    btnClearEverything.setBounds(10, 426, 140, 65);
    btnClearEverything.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnClearEverything.setForeground(new Color(255, 255, 255));
    btnClearEverything.setBackground(new Color(255, 0, 0));
    btnClearEverything.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(null);
      }
    });
    contentPane.add(btnClearEverything);
    
    JButton btnZero = new JButton("0");
    btnZero.setBounds(10, 348, 65, 65);
    btnZero.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnZero.setBackground(Color.WHITE);
    btnZero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnZero.getText();
        textField.setText(number);
      }
    });
    contentPane.add(btnZero);
    
    textField = new JTextField();
    textField.setToolTipText("You can type numbers here!");
    textField.setBounds(10, 57, 494, 52);
    textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
    textField.setBackground(Color.WHITE);
    contentPane.add(textField);
    textField.setColumns(10);
    
    JButton btnAdd = new JButton("+");
    btnAdd.setToolTipText("Addition");
    btnAdd.setBounds(252, 120, 65, 65);
    btnAdd.setBackground(Color.YELLOW);
    btnAdd.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "+";
      }
    });
    btnAdd.setFont(new Font("Tahoma", Font.BOLD, 22));
    contentPane.add(btnAdd);
    
    JButton btnSubtract = new JButton("-");
    btnSubtract.setToolTipText("Subtraction");
    btnSubtract.setBounds(252, 196, 65, 65);
    btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnSubtract.setBackground(Color.YELLOW);
    btnSubtract.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "-";
      }
    });
    contentPane.add(btnSubtract);
    
    JButton btnMultiply = new JButton("x");
    btnMultiply.setToolTipText("Multiplication");
    btnMultiply.setBounds(252, 272, 65, 65);
    btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnMultiply.setBackground(Color.YELLOW);
    btnMultiply.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "x";
      }
    });
    contentPane.add(btnMultiply);
    
    JButton btnDivide = new JButton("/");
    btnDivide.setToolTipText("Division");
    btnDivide.setBounds(252, 348, 65, 65);
    btnDivide.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnDivide.setBackground(Color.YELLOW);
    btnDivide.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "/";
      }
    });
    contentPane.add(btnDivide);
    
    JButton btnBackspace = new JButton("<");
    btnBackspace.setToolTipText("Backspace");
    btnBackspace.setBounds(160, 348, 65, 65);
    btnBackspace.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // acts as a backspace key
        String RevisedTextField = textField.getText().substring(0, textField.getText().length() - 1);
        textField.setText(RevisedTextField);
      }
    });
    btnBackspace.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnBackspace.setBackground(Color.CYAN);
    contentPane.add(btnBackspace);
    
    JButton btnNegate = new JButton("+/-");
    btnNegate.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String negative = "-";
        
        if (textField.getText().substring(0, 1).compareTo(negative) == 0) {
          String RevisedTextField = textField.getText().substring(1, textField.getText().length());
          textField.setText(RevisedTextField);
          
        } else {
          String RevisedTextField = "-" + textField.getText();
          textField.setText(RevisedTextField);
        }
        
      }
    });
    btnNegate.setToolTipText("Negate");
    btnNegate.setFont(new Font("Tahoma", Font.BOLD, 16));
    btnNegate.setBackground(Color.LIGHT_GRAY);
    btnNegate.setBounds(363, 120, 65, 65);
    contentPane.add(btnNegate);
    
    JButton btnPi = new JButton("π");
    btnPi.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(Math.PI + textField.getText());
      }
    });
    btnPi.setToolTipText("Pi");
    btnPi.setFont(new Font("Cambria Math", Font.BOLD, 22));
    btnPi.setBackground(Color.LIGHT_GRAY);
    btnPi.setBounds(363, 272, 65, 65);
    contentPane.add(btnPi);
    
    JButton btnE = new JButton("e");
    btnE.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(Math.E + textField.getText());
      }
    });
    btnE.setToolTipText("Natural constant");
    btnE.setFont(new Font("Cambria Math", Font.BOLD, 22));
    btnE.setBackground(Color.LIGHT_GRAY);
    btnE.setBounds(363, 348, 65, 65);
    contentPane.add(btnE);
    
    // use HTML formatting for superscript
    JButton btnSquared = new JButton("<html>x<sup>2</sup></html>");
    btnSquared.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        firstOperand = Double.parseDouble(textField.getText());
        result = Math.pow(firstOperand, 2);
        answer = String.format(decimalFormat, result);
        textField.setText(answer);
      }
    });
    btnSquared.setToolTipText("Square");
    btnSquared.setFont(new Font("Cambria Math", Font.BOLD, 17));
    btnSquared.setBackground(Color.GREEN);
    btnSquared.setBounds(438, 348, 65, 65);
    contentPane.add(btnSquared);
    
    JButton btnSqrt = new JButton("√x");
    btnSqrt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        result = Math.sqrt(firstOperand);
        answer = String.format(decimalFormat, result);
        textField.setText(answer);
      }
    });
    btnSqrt.setToolTipText("Square root");
    btnSqrt.setFont(new Font("Cambria Math", Font.BOLD, 17));
    btnSqrt.setBackground(Color.GREEN);
    btnSqrt.setBounds(438, 272, 65, 65);
    contentPane.add(btnSqrt);
    
    JButton btnAbsoluteValue = new JButton("|x|");
    btnAbsoluteValue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        String negative = "-";
        
        if (textField.getText().substring(0, 1).compareTo(negative) == 0) {
          String RevisedString = textField.getText().substring(1, textField.getText().length());
          textField.setText(RevisedString);
        } 
        

      }
    });
    btnAbsoluteValue.setToolTipText("Absolute value");
    btnAbsoluteValue.setFont(new Font("Cambria Math", Font.BOLD, 17));
    btnAbsoluteValue.setBackground(Color.LIGHT_GRAY);
    btnAbsoluteValue.setBounds(363, 196, 65, 65);
    contentPane.add(btnAbsoluteValue);
    
    JButton btnLogE = new JButton("ln(x)");
    btnLogE.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // ln(x) where x is firstOperand
        firstOperand = Double.parseDouble(textField.getText());
        result = Math.log(firstOperand); 
        answer = String.format(decimalFormat, result);
        textField.setText(answer);
        
      }
    });
    btnLogE.setToolTipText("Natural logarithm");
    btnLogE.setFont(new Font("Cambria Math", Font.BOLD, 13));
    btnLogE.setBackground(Color.GREEN);
    btnLogE.setBounds(438, 120, 65, 65);
    contentPane.add(btnLogE);
    
    JButton btnModulo = new JButton("mod");
    btnModulo.setToolTipText("Modulo");
    btnModulo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "mod";
      }
    });
    btnModulo.setFont(new Font("Cambria Math", Font.BOLD, 13));
    btnModulo.setBackground(Color.YELLOW);
    btnModulo.setBounds(252, 426, 65, 65);
    contentPane.add(btnModulo);
    
    JLabel lblKey1 = new JLabel("Multi-Operand");
    lblKey1.setFont(new Font("Tahoma", Font.BOLD, 11));
    lblKey1.setHorizontalAlignment(SwingConstants.CENTER);
    lblKey1.setForeground(Color.YELLOW);
    lblKey1.setBounds(363, 436, 140, 14);
    contentPane.add(lblKey1);
    
    JLabel lblKey2 = new JLabel("Single-Operand");
    lblKey2.setFont(new Font("Tahoma", Font.BOLD, 11));
    lblKey2.setHorizontalAlignment(SwingConstants.CENTER);
    lblKey2.setForeground(Color.GREEN);
    lblKey2.setBounds(363, 451, 140, 14);
    contentPane.add(lblKey2);
    
    JLabel lblKey3 = new JLabel("Modifier/Constant");
    lblKey3.setFont(new Font("Tahoma", Font.BOLD, 11));
    lblKey3.setHorizontalAlignment(SwingConstants.CENTER);
    lblKey3.setForeground(Color.LIGHT_GRAY);
    lblKey3.setBounds(363, 467, 140, 14);
    contentPane.add(lblKey3);
    
    JPanel panel = new JPanel();
    panel.setToolTipText("A particular button's behavior can be denoted by it's color");
    panel.setBackground(Color.DARK_GRAY);
    panel.setBounds(363, 426, 140, 65);
    contentPane.add(panel);
    
    JLabel lblOperationLabel = new JLabel("This text will display your operation chain...");
    lblOperationLabel.setToolTipText("Visual representation on your operation chain");
    lblOperationLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
    lblOperationLabel.setBounds(10, 24, 493, 22);
    contentPane.add(lblOperationLabel);
    
    JButton btnExponentE = new JButton("<html>e<sup>x</sup></html>");
    btnExponentE.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // e^x where x is firstOperand
        firstOperand = Double.parseDouble(textField.getText());
        result = Math.pow(Math.E, firstOperand);
        answer = String.format(decimalFormat, result);
        textField.setText(answer);
      }
    });
    btnExponentE.setToolTipText("Natural exponent");
    btnExponentE.setFont(new Font("Cambria Math", Font.BOLD, 17));
    btnExponentE.setBackground(Color.GREEN);
    btnExponentE.setBounds(438, 196, 65, 65);
    contentPane.add(btnExponentE);
  }
}
