package _interface.student.admission;

import java.util.ArrayList;
import java.util.List;

public class SE implements Student {
	private String name;
	private double gpa;
	
	public SE(String name, double gpa) {
		super();
		this.name = name;
		if(gpa >=2.8 && gpa<=4.00) {
		
		
		this.gpa = gpa;
		System.out.println("Your GPA is "+this.gpa+",so you are eligible for admission ");
		}
		else {
			System.out.println("You are not eligible for admission");
			this.gpa=gpa;
		}
	}
	public String getName() {
		return name;
	}
	public double getGpa() {
		return gpa;
	}
	
	@Override
	public String toString() {
		return "SE [name=" + name + ", GPA=" + gpa + "]";
	}
	@Override
	public List<String> write() {
		ArrayList<String> values=new ArrayList<>();
		values.add(0,this.name);
		values.add(1,""+this.gpa);
		
		return values;
	}
	@Override
	public void read(List<String> savedData) {
		
			if(savedData != null && savedData.size()>0) {
				this.name=savedData.get(0);
				this.gpa=Double.parseDouble(savedData.get(1));
			}
		
	}
	
		
		
	
	
	

}
