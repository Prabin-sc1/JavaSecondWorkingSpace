
public class Bus {
	public static void main(String[] args) {
		Bus.calculateBusTickets();
	}

	private static void calculateBusTickets() {
		for(int tickets=0;tickets<46;tickets++) {
			int totalMoney=4*tickets+6*(45-tickets);
			if(totalMoney==230) {

				System.out.println(tickets+" $4.00 tickets are sold");
				break;
			}
		}
	}
}
