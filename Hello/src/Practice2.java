import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;
public class Practice2 {

	public static void main(String[] args) {
		RadioButton r=new RadioButton();
		
	}

}

class RadioButton extends JFrame {
	JTextField t1;
	JButton b;
	JRadioButton r1,r2;
	JLabel l;
	JCheckBox c1,c2;
	
	public RadioButton() {
		t1=new JTextField(10);
		b=new JButton("OK");
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		l=new JLabel("Greeting");
		c1=new JCheckBox("SE");
		c2=new JCheckBox("CE");
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		add(t1);
		
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		add(b);
		add(l);
		
		c1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("SE Student");
			}
			
		});
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				if(r1.isSelected()) {
					name="Mr. "+name;
				}else {
					name="Mrs. "+name;
				}
				if(c1.isSelected()) {
					name=name+" SE Student";
				
				}
				if(c2.isSelected())
				{
					name=name+" CE Student";
				}
				l.setText(name);
				
			}
			
		});
		
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(400,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
