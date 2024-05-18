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

public class StandardCalculator extends JFrame {

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
          StandardCalculator frame = new StandardCalculator();
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
  public StandardCalculator() {
    setTitle(" Standard Calculator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 346, 545);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    setContentPane(contentPane);
    
    JButton btnOne = new JButton("1");
    btnOne.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnOne.setBackground(Color.WHITE);
    btnOne.setBounds(10, 247, 65, 65);
    btnOne.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnOne.getText();
        textField.setText(number);
      }
    });
    contentPane.setLayout(null);
    
    JLabel lblCalcLabel = new JLabel("Version 1.2    https://github.com/gjinrexhaj");
    lblCalcLabel.setBounds(10, 481, 307, 14);
    contentPane.add(lblCalcLabel);
    
    JButton btnNine = new JButton("9");
    btnNine.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnNine.setBackground(Color.WHITE);
    btnNine.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnNine.getText();
        textField.setText(number);
      }
    });
    btnNine.setBounds(160, 95, 65, 65);
    contentPane.add(btnNine);
    
    JButton btnEight = new JButton("8");
    btnEight.setBackground(Color.WHITE);
    btnEight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnEight.getText();
        textField.setText(number);
      }
    });
    btnEight.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnEight.setBounds(85, 95, 65, 65);
    contentPane.add(btnEight);
    
    JButton btnSeven = new JButton("7");
    btnSeven.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnSeven.setBackground(Color.WHITE);
    btnSeven.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnSeven.getText();
        textField.setText(number);
      }
    });
    btnSeven.setBounds(10, 95, 65, 65);
    contentPane.add(btnSeven);
    
    JButton btnSix = new JButton("6");
    btnSix.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnSix.setBackground(Color.WHITE);
    btnSix.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnSix.getText();
        textField.setText(number);
      }
    });
    btnSix.setBounds(160, 171, 65, 65);
    contentPane.add(btnSix);
    
    JButton btnFive = new JButton("5");
    btnFive.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnFive.setBackground(Color.WHITE);
    btnFive.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnFive.getText();
        textField.setText(number);
      }
    });
    btnFive.setBounds(85, 171, 65, 65);
    contentPane.add(btnFive);
    
    JButton btnFour = new JButton("4");
    btnFour.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnFour.setBackground(Color.WHITE);
    btnFour.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnFour.getText();
        textField.setText(number);
      }
    });
    btnFour.setBounds(10, 171, 65, 65);
    contentPane.add(btnFour);
    
    JButton btnThree = new JButton("3");
    btnThree.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnThree.setBackground(Color.WHITE);
    btnThree.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnThree.getText();
        textField.setText(number);
      }
    });
    btnThree.setBounds(160, 247, 65, 65);
    contentPane.add(btnThree);
    
    JButton btnTwo = new JButton("2");
    btnTwo.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnTwo.setBackground(Color.WHITE);
    btnTwo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnTwo.getText();
        textField.setText(number);
      }
    });
    btnTwo.setBounds(84, 247, 66, 65);
    contentPane.add(btnTwo);
    contentPane.add(btnOne);
    
    JButton btnDecimal = new JButton(".");
    btnDecimal.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnDecimal.setBackground(Color.WHITE);
    btnDecimal.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnDecimal.getText();
        textField.setText(number);
      }
    });
    btnDecimal.setBounds(85, 323, 65, 65);
    contentPane.add(btnDecimal);
    
    JButton btnEquals = new JButton("=");
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
    btnEquals.setBounds(160, 323, 65, 143);
    contentPane.add(btnEquals);
    
    JButton btnClearEverything = new JButton("CE");
    btnClearEverything.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnClearEverything.setForeground(new Color(255, 255, 255));
    btnClearEverything.setBackground(new Color(255, 0, 0));
    btnClearEverything.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(null);
      }
    });
    btnClearEverything.setBounds(10, 401, 140, 65);
    contentPane.add(btnClearEverything);
    
    JButton btnZero = new JButton("0");
    btnZero.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnZero.setBackground(Color.WHITE);
    btnZero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + btnZero.getText();
        textField.setText(number);
      }
    });
    btnZero.setBounds(10, 323, 65, 65);
    contentPane.add(btnZero);
    
    textField = new JTextField();
    textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
    textField.setBackground(Color.WHITE);
    textField.setBounds(10, 11, 307, 73);
    contentPane.add(textField);
    textField.setColumns(10);
    
    JButton btnAdd = new JButton("+");
    btnAdd.setBackground(Color.YELLOW);
    btnAdd.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "+";
      }
    });
    btnAdd.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnAdd.setBounds(252, 95, 65, 65);
    contentPane.add(btnAdd);
    
    JButton btnSubtract = new JButton("-");
    btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnSubtract.setBackground(Color.YELLOW);
    btnSubtract.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "-";
      }
    });
    btnSubtract.setBounds(252, 171, 65, 65);
    contentPane.add(btnSubtract);
    
    JButton btnMultiply = new JButton("x");
    btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnMultiply.setBackground(Color.YELLOW);
    btnMultiply.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "x";
      }
    });
    btnMultiply.setBounds(252, 247, 65, 65);
    contentPane.add(btnMultiply);
    
    JButton btnDivide = new JButton("/");
    btnDivide.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnDivide.setBackground(Color.YELLOW);
    btnDivide.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "/";
      }
    });
    btnDivide.setBounds(252, 323, 65, 65);
    contentPane.add(btnDivide);
    
    JButton btnBackspace = new JButton("<");
    btnBackspace.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // acts as a backspace key
        String RevisedTextField = textField.getText().substring(0, textField.getText().length() - 1);
        textField.setText(RevisedTextField);
      }
    });
    btnBackspace.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnBackspace.setBackground(Color.CYAN);
    btnBackspace.setBounds(252, 401, 65, 61);
    contentPane.add(btnBackspace);
  }
}
