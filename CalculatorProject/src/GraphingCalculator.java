import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GraphingCalculator extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTextField functionG;
  private JTextField functionF;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          GraphingCalculator frame = new GraphingCalculator();
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
  public GraphingCalculator() {
    setTitle("Graphing Calculator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 642, 546);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    // graphics panel
    DrawingBoard graphicsPanel = new DrawingBoard();
    graphicsPanel.setBounds(100, 100, 400, 200);
    contentPane.add(graphicsPanel);
    
    JButton btnNewButton = new JButton("GRAPH");
    btnNewButton.setBackground(Color.GREEN);
    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnNewButton.setBounds(466, 423, 130, 49);
    contentPane.add(btnNewButton);
    
    JButton btnClear_1 = new JButton("CLEAR");
    btnClear_1.setForeground(Color.WHITE);
    btnClear_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
    btnClear_1.setBackground(Color.RED);
    btnClear_1.setBounds(466, 363, 130, 49);
    contentPane.add(btnClear_1);
    
    functionG = new JTextField();
    functionG.setFont(new Font("Cambria Math", Font.PLAIN, 20));
    functionG.setBounds(96, 423, 343, 49);
    contentPane.add(functionG);
    functionG.setColumns(10);
    
    functionF = new JTextField();
    functionF.setFont(new Font("Cambria Math", Font.PLAIN, 20));
    functionF.setColumns(10);
    functionF.setBounds(96, 363, 343, 49);
    contentPane.add(functionF);
    
    JLabel lblNewLabel = new JLabel("f(x) =");
    lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 22));
    lblNewLabel.setBounds(29, 362, 57, 49);
    contentPane.add(lblNewLabel);
    
    JLabel lblGx = new JLabel("g(x) =");
    lblGx.setFont(new Font("Cambria Math", Font.PLAIN, 22));
    lblGx.setBounds(29, 423, 70, 49);
    contentPane.add(lblGx);
    
    JLabel lblNewLabel_1 = new JLabel("Java GUI Graphing Calculator");
    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
    lblNewLabel_1.setBounds(29, 23, 410, 33);
    contentPane.add(lblNewLabel_1);
    
    JLabel lblNewLabel_1_1 = new JLabel("Version 1.0, developed by Gjin Rexhaj, github.com/GjinRexhaj");
    lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
    lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
    lblNewLabel_1_1.setBounds(41, 38, 314, 57);
    contentPane.add(lblNewLabel_1_1);
  }
  
  class DrawingBoard extends JPanel {
    
    public DrawingBoard() {
      setBorder(BorderFactory.createLineBorder(Color.black));
    }
    
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      // x-axis
      g.setColor(Color.GRAY);
      g.drawLine(0, 100, 400, 100);
      
      // y-axis
      g.drawLine(200, 0, 200, 400);
      
      // use polyline for curves: Needs Work
      
      
    }
  }
}
