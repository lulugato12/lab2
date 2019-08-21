import java.util.Scanner;
public class WordCapitalization {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String word = in.nextLine();
		
		char init = word.charAt(0);
		if(word.charAt(0)>90) {
			init = (char) (init-32);
			System.out.print(init);

			String nWord = "" + init;
			for (int i=1; i<word.length(); i++) {
				System.out.print(word.charAt(i));
			}
		} else {
			System.out.println(word);
		}
	}
}