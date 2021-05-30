package learning.gui.edu;

import java.util.*;

class Book {
	private String name;
	private double price;

	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
	class MyComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			Book book1 = (Book) o1;
			Book book2 = (Book) o2;
			if (book1.getPrice() < book2.getPrice())
				return (-1);
			else
				return (1);

		}

	
}

	 class Example {
		public static void main(String[] args) {
			Book b1, b2, b3;
			b1 = new Book("PHP", 300.00);
			b2 = new Book("Java", 500.00);
			b3 = new Book("C", 400.00);

			TreeSet t = new TreeSet(new MyComparator());
			t.add(b1);
			t.add(b2);
			t.add(b3);
			Book b;

			Iterator i = t.iterator();
			while (i.hasNext()) {
				b = (Book) i.next();
				System.out.println(b.getName() + " " + b.getPrice());

			}

		}
	}

