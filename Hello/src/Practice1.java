import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Practice1 {
	public static void main(String[] args) {
		A a = new A();

	}

}

class A extends JFrame {
	
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3;
	JButton b1,b2;
	
	public A() {
	l1=new JLabel("Addtion of two numbers");
	l2=new JLabel("1st NUmber:");
	t1=new JTextField(20);
	l3=new JLabel("2nd NUmber:");
	t2=new JTextField(20);
	b1=new JButton("+");
	b2=new JButton("-");
	l4=new JLabel("");
	
	
	add(l1);
	add(l2);
	add(t1);
	add(l3);
	add(t2);
	add(b1);
	add(b2);
	add(l4);
	l1.setBounds(10,10,200,20);
	l2.setBounds(20,40,100,20);
	t1.setBounds(100,40,100,20);
	l3.setBounds(20,100,100,20);
	t2.setBounds(100,100,100,20);
	b1.setBounds(30,150,50,20);
	b2.setBounds(250,150,50,20);
	
	ActionListener al= new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			int a,b;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			int c=0;
			if(e.getSource()==b1) 
				c=a+b;
			else 
			c=a-b;
			l4.setText("your answer is:"+c);
			
			
			
		}
		
	};
	b1.addActionListener(al);
	b2.addActionListener(al);
	
	l4.setBounds(50,200,150,20);
		
		
		

		
		setLayout(null);
		setVisible(true);
		setSize(400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
//	public void actionPerformed(ActionEvent e) {
//		int a,b;
//		a=Integer.parseInt(t1.getText());
//		b=Integer.parseInt(t2.getText());
//		int c=0;
//		if(e.getSource()==b1) 
//			c=a+b;
//		else 
//		c=a-b;
//		l4.setText("your answer is:"+c);
//		
//		
//		
//		
//		
//		
//		
//	}
}