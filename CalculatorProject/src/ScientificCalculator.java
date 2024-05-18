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

import javax.swing.JList;

public class ScientificCalculator extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTextField textField;

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
    setBounds(100, 100, 466, 545);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    setContentPane(contentPane);
    
    JButton btnOne = new JButton("1");
    btnOne.setBounds(10, 247, 65, 65);
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
    lblCalcLabel.setBounds(10, 481, 307, 14);
    contentPane.add(lblCalcLabel);
    
    JButton btnNine = new JButton("9");
    btnNine.setBounds(160, 95, 65, 65);
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
    btnEight.setBounds(85, 95, 65, 65);
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
    btnSeven.setBounds(10, 95, 65, 65);
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
    btnSix.setBounds(160, 171, 65, 65);
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
    btnFive.setBounds(85, 171, 65, 65);
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
    btnFour.setBounds(10, 171, 65, 65);
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
    btnThree.setBounds(160, 247, 65, 65);
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
    btnTwo.setBounds(84, 247, 66, 65);
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
    btnDecimal.setBounds(85, 323, 65, 65);
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
    btnEquals.setBounds(160, 323, 65, 143);
    btnEquals.setBackground(Color.GREEN);
    btnEquals.setForeground(Color.BLACK);
    btnEquals.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        secondOperand = Double.parseDouble(textField.getText());
        // if statement to check and perform operations
        if (operation == "+") {
          result = firstOperand + secondOperand;
          answer = String.format("%.2f", result);
          textField.setText(answer); 
        } else if (operation == "-") {
          result = firstOperand - secondOperand;
          answer = String.format("%.2f", result);
          textField.setText(answer); 
        }else if (operation == "x") {
          result = firstOperand * secondOperand;
          answer = String.format("%.2f", result);
          textField.setText(answer); 
        }else if (operation == "/") {
          result = firstOperand / secondOperand;
          answer = String.format("%.2f", result);
          textField.setText(answer); 
        }
        
      }
    });
    btnEquals.setFont(new Font("Tahoma", Font.BOLD, 22));
    contentPane.add(btnEquals);
    
    JButton btnClearEverything = new JButton("CE");
    btnClearEverything.setBounds(10, 401, 140, 65);
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
    btnZero.setBounds(10, 323, 65, 65);
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
    textField.setBounds(10, 11, 430, 73);
    textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
    textField.setBackground(Color.WHITE);
    contentPane.add(textField);
    textField.setColumns(10);
    
    JButton btnAdd = new JButton("+");
    btnAdd.setBounds(252, 95, 65, 65);
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
    btnSubtract.setBounds(252, 171, 65, 65);
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
    btnMultiply.setBounds(252, 247, 65, 65);
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
    btnDivide.setBounds(252, 323, 65, 65);
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
    btnBackspace.setBounds(252, 401, 65, 61);
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
    
    JButton btnPercent = new JButton("%");
    btnPercent.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnPercent.setBackground(Color.YELLOW);
    btnPercent.setBounds(363, 95, 65, 65);
    contentPane.add(btnPercent);
    
    JButton btnNegate = new JButton("+/-");
    btnNegate.setFont(new Font("Tahoma", Font.BOLD, 16));
    btnNegate.setBackground(new Color(255, 255, 0));
    btnNegate.setBounds(363, 171, 65, 65);
    contentPane.add(btnNegate);
    
    JButton btnPi = new JButton("π");
    btnPi.setFont(new Font("Cambria Math", Font.BOLD, 22));
    btnPi.setBackground(Color.YELLOW);
    btnPi.setBounds(363, 247, 65, 65);
    contentPane.add(btnPi);
    
    JButton btnE = new JButton("e");
    btnE.setFont(new Font("Cambria Math", Font.BOLD, 22));
    btnE.setBackground(Color.YELLOW);
    btnE.setBounds(363, 323, 65, 65);
    contentPane.add(btnE);
  }
}
