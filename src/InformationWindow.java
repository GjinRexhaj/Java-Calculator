import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InformationWindow extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          InformationWindow frame = new InformationWindow();
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
  public InformationWindow() {
    setTitle("Additional Information");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setBounds(100, 100, 449, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel titleLabel = new JLabel("JAVA CALCULATOR");
    titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
    titleLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
    titleLabel.setBounds(10, 11, 413, 56);
    contentPane.add(titleLabel);
    
    JLabel lblVersion = new JLabel("Version 1.0, developed by Gjin Rexhaj");
    lblVersion.setHorizontalAlignment(SwingConstants.CENTER);
    lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 11));
    lblVersion.setBounds(10, 64, 413, 56);
    contentPane.add(lblVersion);
    
    JLabel lblHttpsgithubcomgjinrexhaj = new JLabel("https://github.com/GjinRexhaj");
    lblHttpsgithubcomgjinrexhaj.setForeground(Color.RED);
    lblHttpsgithubcomgjinrexhaj.setHorizontalAlignment(SwingConstants.CENTER);
    lblHttpsgithubcomgjinrexhaj.setFont(new Font("Tahoma", Font.PLAIN, 11));
    lblHttpsgithubcomgjinrexhaj.setBounds(10, 127, 413, 56);
    contentPane.add(lblHttpsgithubcomgjinrexhaj);
    
    JLabel lblTheCalculatorWill = new JLabel("The calculator will remain open after you close this window...");
    lblTheCalculatorWill.setHorizontalAlignment(SwingConstants.CENTER);
    lblTheCalculatorWill.setFont(new Font("Tahoma", Font.PLAIN, 12));
    lblTheCalculatorWill.setBounds(10, 194, 413, 56);
    contentPane.add(lblTheCalculatorWill);
    
    JLabel lblAStandard = new JLabel("A standard 4-function calculator implemented with AWT and Java Swing");
    lblAStandard.setHorizontalAlignment(SwingConstants.CENTER);
    lblAStandard.setFont(new Font("Tahoma", Font.PLAIN, 11));
    lblAStandard.setBounds(10, 47, 413, 56);
    contentPane.add(lblAStandard);
  }
}
