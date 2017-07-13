package Zadania;

/*Napisz program deszyfrujący podaną wiadomość zakodowaną szyfrem Cezara*/
public class J10 {

	public static void main(String[] args) {
		String name = "ccc";
		String nowe = "";

		for (int i = 0; i < name.length(); i++) {
			char character = name.charAt(i);
			if (character == 97) {
				character = (char) (120);
				nowe += character;
			} else if (character == 98) {
				character = (char) (121);
				nowe += character;
			} else if (character == 99) {
				character = (char) (122);
				nowe += character;
			} else {
				character = (char) (character + 3);
				nowe += character;
			}

		}
		System.out
				.println("Zaszyfrowana wiadomość o treści: " + name + " po odszyfrowaniu wygląda nastepująco: " + nowe);

	}

}
