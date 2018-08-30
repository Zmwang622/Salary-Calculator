/***
 * 
 * @author ZMing Wang
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class SalaryCalculator {

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(300,300,500,250);
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(null);
		
		JButton btnCalc = new JButton("Calculate");
		btnCalc.setBounds(40,115,200,50);
		myFrame.add(btnCalc);
		
		JLabel lblRate = new JLabel("Hourly Rate:");
		lblRate.setBounds(40,0,100,50);
		myFrame.add(lblRate);
	
		JLabel lblWeek = new JLabel("Hours/Week: ");
		lblWeek.setBounds(40,40,100,50);
		myFrame.add(lblWeek);
		
		JLabel lblPay = new JLabel("Yearly Salary: ");
		lblPay.setBounds(275,90,125,125);
		myFrame.add(lblPay);
		
		JTextField txtRate = new JTextField();
		txtRate.setBounds(150,50,125,25);
		myFrame.add(txtRate);
		
		JTextField txtWeeks = new JTextField();
		txtWeeks.setBounds(150,15,125,25);
		myFrame.add(txtWeeks);
		
		JCheckBox chkTime = new JCheckBox("Full Time");
		chkTime.setBounds(40,80,125,25);
		myFrame.add(chkTime);
		
		JMenuBar mBar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem clear = new JMenuItem("Clear");
		JMenu sample1 = new JMenu("Sample1");
		JMenuItem sample2 = new JMenuItem("Sample2");
		JMenuItem sample3 = new JMenuItem("Sample3");
		JMenuItem sample4 = new JMenuItem("Sample4");
		
		sample1.add(sample2);sample1.add(sample3);sample1.add(sample4);
		
		file.add(clear); file.add(sample1);
		
		mBar.add(file);
		
		myFrame.setJMenuBar(mBar);
		
		myFrame.setTitle("Salary Calculator");
		
		clear.addActionListener(new ActionListener()
		{
			public void keyPressed(KeyEvent e) {
				clear.setEnabled(true);
			}
			public void actionPerformed(ActionEvent e)
			{
				txtRate.setText("");
				txtWeeks.setText("");
				chkTime.setSelected(false);
			}
		});
		btnCalc.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(chkTime.isSelected())
				{
					lblPay.setText("Yearly Salary: $" + Double.parseDouble(txtRate.getText())*40*52);
				}
				
				else
				{
					lblPay.setText("Yearly Salary: $" + Double.parseDouble(txtRate.getText())*52*Double.parseDouble(txtWeeks.getText()));
				}
			}
		});
		myFrame.setVisible(true);
		}

}
