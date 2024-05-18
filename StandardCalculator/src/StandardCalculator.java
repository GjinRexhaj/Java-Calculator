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
    setTitle("Calculator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 346, 545);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    setContentPane(contentPane);
    
    JButton one = new JButton("1");
    one.setFont(new Font("Tahoma", Font.PLAIN, 22));
    one.setBackground(Color.WHITE);
    one.setBounds(10, 247, 65, 65);
    one.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + one.getText();
        textField.setText(number);
      }
    });
    contentPane.setLayout(null);
    
    JLabel lblCalcLabel = new JLabel("Version 1.1");
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
    
    JButton eight = new JButton("8");
    eight.setBackground(Color.WHITE);
    eight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + eight.getText();
        textField.setText(number);
      }
    });
    eight.setFont(new Font("Tahoma", Font.PLAIN, 22));
    eight.setBounds(85, 95, 65, 65);
    contentPane.add(eight);
    
    JButton seven = new JButton("7");
    seven.setFont(new Font("Tahoma", Font.PLAIN, 22));
    seven.setBackground(Color.WHITE);
    seven.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + seven.getText();
        textField.setText(number);
      }
    });
    seven.setBounds(10, 95, 65, 65);
    contentPane.add(seven);
    
    JButton six = new JButton("6");
    six.setFont(new Font("Tahoma", Font.PLAIN, 22));
    six.setBackground(Color.WHITE);
    six.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + six.getText();
        textField.setText(number);
      }
    });
    six.setBounds(160, 171, 65, 65);
    contentPane.add(six);
    
    JButton five = new JButton("5");
    five.setFont(new Font("Tahoma", Font.PLAIN, 22));
    five.setBackground(Color.WHITE);
    five.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + five.getText();
        textField.setText(number);
      }
    });
    five.setBounds(85, 171, 65, 65);
    contentPane.add(five);
    
    JButton four = new JButton("4");
    four.setFont(new Font("Tahoma", Font.PLAIN, 22));
    four.setBackground(Color.WHITE);
    four.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + four.getText();
        textField.setText(number);
      }
    });
    four.setBounds(10, 171, 65, 65);
    contentPane.add(four);
    
    JButton three = new JButton("3");
    three.setFont(new Font("Tahoma", Font.PLAIN, 22));
    three.setBackground(Color.WHITE);
    three.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + three.getText();
        textField.setText(number);
      }
    });
    three.setBounds(160, 247, 65, 65);
    contentPane.add(three);
    
    JButton two = new JButton("2");
    two.setFont(new Font("Tahoma", Font.PLAIN, 22));
    two.setBackground(Color.WHITE);
    two.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + two.getText();
        textField.setText(number);
      }
    });
    two.setBounds(84, 247, 66, 65);
    contentPane.add(two);
    contentPane.add(one);
    
    JButton decimal = new JButton(".");
    decimal.setFont(new Font("Tahoma", Font.PLAIN, 22));
    decimal.setBackground(Color.WHITE);
    decimal.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + decimal.getText();
        textField.setText(number);
      }
    });
    decimal.setBounds(85, 323, 65, 65);
    contentPane.add(decimal);
    
    JButton equals = new JButton("=");
    equals.setBackground(Color.GREEN);
    equals.setForeground(Color.BLACK);
    equals.addActionListener(new ActionListener() {
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
    equals.setFont(new Font("Tahoma", Font.BOLD, 22));
    equals.setBounds(160, 323, 65, 143);
    contentPane.add(equals);
    
    JButton clearEverything = new JButton("CE");
    clearEverything.setFont(new Font("Tahoma", Font.BOLD, 22));
    clearEverything.setForeground(new Color(255, 255, 255));
    clearEverything.setBackground(new Color(255, 0, 0));
    clearEverything.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(null);
      }
    });
    clearEverything.setBounds(10, 401, 140, 65);
    contentPane.add(clearEverything);
    
    JButton zero = new JButton("0");
    zero.setFont(new Font("Tahoma", Font.PLAIN, 22));
    zero.setBackground(Color.WHITE);
    zero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number = textField.getText() + zero.getText();
        textField.setText(number);
      }
    });
    zero.setBounds(10, 323, 65, 65);
    contentPane.add(zero);
    
    textField = new JTextField();
    textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
    textField.setBackground(Color.WHITE);
    textField.setBounds(10, 11, 307, 73);
    contentPane.add(textField);
    textField.setColumns(10);
    
    JButton add = new JButton("+");
    add.setBackground(Color.YELLOW);
    add.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "+";
      }
    });
    add.setFont(new Font("Tahoma", Font.BOLD, 22));
    add.setBounds(252, 95, 65, 65);
    contentPane.add(add);
    
    JButton subtract = new JButton("-");
    subtract.setFont(new Font("Tahoma", Font.BOLD, 22));
    subtract.setBackground(Color.YELLOW);
    subtract.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "-";
      }
    });
    subtract.setBounds(252, 171, 65, 65);
    contentPane.add(subtract);
    
    JButton multiply = new JButton("x");
    multiply.setFont(new Font("Tahoma", Font.BOLD, 22));
    multiply.setBackground(Color.YELLOW);
    multiply.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "x";
      }
    });
    multiply.setBounds(252, 247, 65, 65);
    contentPane.add(multiply);
    
    JButton divide = new JButton("/");
    divide.setFont(new Font("Tahoma", Font.BOLD, 22));
    divide.setBackground(Color.YELLOW);
    divide.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstOperand = Double.parseDouble(textField.getText());
        textField.setText("");
        operation = "/";
      }
    });
    divide.setBounds(252, 323, 65, 65);
    contentPane.add(divide);
    
    JButton information = new JButton("?");
    information.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        InformationWindow info = new InformationWindow();
        info.setVisible(true);
        
      }
    });
    information.setFont(new Font("Tahoma", Font.PLAIN, 22));
    information.setBackground(Color.CYAN);
    information.setBounds(252, 401, 65, 61);
    contentPane.add(information);
    
    JList list = new JList();
    list.setBounds(121, 213, 1, 1);
    contentPane.add(list);
  }
}
