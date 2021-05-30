import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Caller {

	public static void main(String[] args) {
		
 X x=new X();
 }

}
class X extends JFrame implements ActionListener{
	int i;
	JProgressBar p;
	public X() {
		JButton b=new JButton("Are you ready?");
		p=new JProgressBar(0,20);
		
		
		Timer t=new Timer(20,this);
		
		b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//new A();
			//dispose();
			t.start();
		}
		});
		add(b);	
		add(p);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if(i==20) {
			new A();
			dispose();
		}
		i++;
		p.setValue(i);
		
		
	}
	}