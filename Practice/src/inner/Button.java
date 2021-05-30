package inner;

public class Button {
	private String title;
	private OnClickListener onCLickListener;
	public Button(String title) {
		super();
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setOnClickListener(OnClickListener on) {
		this.onCLickListener=on;
	}
	public void onClik() {
		this.onCLickListener.onClick(this.title);
	}
	//So button gonna sit on click listen to method that I just created that's used to assign
	//an object to button in order  to handle those clicks 
	
	public interface OnClickListener{
		void onClick(String title);
	}

}
//local classes are declared inside a block, such as a method or 
// an if statement, and their scope is restricted completely to particular block
