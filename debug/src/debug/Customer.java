package debug;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private DonutsStore store;
	private List<Donut> donuts = new ArrayList<>();

	public void choice(Donut donut) {
		this.donuts.add(donut);
	}

	public void enter(DonutsStore store) {
		this.store = store;
		store.welcome();
	}

	public void buy() {
		store.order(donuts);
	}

	public void out() {
		store.bye();
	}

}
