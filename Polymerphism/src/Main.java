public class Main{
	public static void main(String[] args){
		for(int i=0;i<10;i++) {
			Series series=randomSeries();
			System.out.println("Name: "+series.getName()+"\n"+"Plot: "+series.aboutSeries()+"\n");
		}
	}
	
	public static Series randomSeries() {
		int randomNumber=(int)(Math.random()*4)+1;
		System.out.println("Random Number: "+randomNumber);
		switch(randomNumber) {
		case 1:
			return new Asur();
		case 2:
			return new Stranger();
		case 3:
			return new Breaking();
		case 4:
			return new Forgetable();
			default:
				return null;
		}
	
				
	}
}


class Series{
	private String name;
	public Series(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public String aboutSeries() {
		return "Forgotten";
	}
}

class Asur extends Series{
	public Asur() {
		super("Asur");
	}
	@Override
	public String aboutSeries() {
		return "Mysterious";
	}
}
class Stranger extends Series{
	public Stranger() {
		super("Stranger Things");
	}
	
	@Override
	public String aboutSeries() {
		return "Science Fiction";
	}
}

class Breaking extends Series{
	public Breaking() {
		super("Breaking Bad");
	}
	
	public String aboutSeries() {
		return "Magic of chemistry";
	}
}

class Forgetable extends Series{
	public Forgetable() {
		super("Forgetable");
	}
}



