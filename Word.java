import java.util.Scanner;
public class Word{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String palabra = sc.nextLine();
		int counterLower=0;
		int counterUpper=0;
		for (int i=0;i<palabra.length();i++ ) {
			if (palabra.codePointAt(i) < 95) {
				counterLower++;
			}
			else{
				counterUpper++;
			}
		}
		if (counterUpper<counterLower) {
			System.out.println(palabra.toUpperCase());
		}
		else{
			System.out.println(palabra.toLowerCase());
		}
	}
}