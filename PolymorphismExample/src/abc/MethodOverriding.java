package abc;

public class MethodOverriding {

	public static void main(String[] args) {
		Honda hh = new Honda();
		hh.color();
		hh.speed();
		Pulsar pu = new Pulsar();
		pu.color(10);
		pu.speed();

	}

}
