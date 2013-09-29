package debug;

import java.util.List;

public class DonutsStore {

	public static void main(String[] args) {
		DonutsStore store = new DonutsStore();
		Customer customer = new Customer();
		customer.enter(store);
		Donut chocolateDonut = new Donut(DonutType.CHOCOLATE);
		customer.choice(chocolateDonut);
		customer.buy();
		customer.out();
	}
	
	public void welcome() {
		System.out.println("Welcome to Donut store");
	}
	
	public void bye() {
		System.out.println("Thank you, bye!");
	}

	public void order(List<Donut> donuts) {
		int sum = 0;
		for (Donut donut : donuts) {
			sum += donut.value;
		}
		System.out.println("sum : " + sum);
	}
	
}
