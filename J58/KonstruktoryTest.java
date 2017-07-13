package J58;

public class KonstruktoryTest {

	public static void main(String[] args) {
		Konstruktory k1 = new Konstruktory(12.3);
		System.out.println(k1);

		Konstruktory k2 = new Konstruktory('a');
		System.out.println(k2);

		Konstruktory k3 = new Konstruktory(11.23, 'b');
		System.out.println(k3);

		Konstruktory k4 = new Konstruktory('v', 34.56);
		System.out.println(k4);

	}

}
