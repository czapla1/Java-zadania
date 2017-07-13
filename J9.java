package Zadania;

/*Napisz program szyfrujący podaną wiadomość szyfrem Cezara*/
public class J9 {

	public static void main(String[] args) {
		String name = "yyy";
		String nowe = "";

		for (int i = 0; i < name.length(); i++) {
			char character = name.charAt(i);
			if (character == 120) {
				character = (char) (97);
				nowe += character;
			} else if (character == 121) {
				character = (char) (98);
				nowe += character;
			} else if (character == 122) {
				character = (char) (99);
				nowe += character;
			} else {
				character = (char) (character + 3);
				nowe += character;
			}

		}
		System.out.println("Wiadomość o treści: "+name+" po zaszyfrowaniu wygląda nastepująco: "+nowe);
	}

}
