package learning.gui.edu;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.JFrame;

public class Practice3 {

	public static void main(String[] args) {
		
    A a=new A();
   }

}

class A extends JFrame{
	public A(){
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e)
			{
				int x=e.getX();
				int y=e.getY();
				System.out.println(x+" : "+y);
				
			}
		});
		
		
		
		
		
		
	setLayout(new FlowLayout());
	setVisible(true);
	setSize(400,350);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}