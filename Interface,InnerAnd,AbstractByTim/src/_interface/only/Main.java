package _interface.only;

public class Main{
	public static void main(String[] args) {
		Telephone myPhone=new DeskPhone(98037);
		//myPhone.powerOn();
		myPhone.callPhone(123456);
		myPhone.answer();
		myPhone.dial(145);
		
		MobilePhone myMobile=new MobilePhone(123654);
		myMobile.powerOn();
		myMobile.callPhone(455);
		myMobile.answer();
		
	}
}
//list-generic term
//LinkedList-hardcoded
//java libraries use interfaces extensively

