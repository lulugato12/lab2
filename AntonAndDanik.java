import java.util.Scanner;
public class AntonAndDanik {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 0, d = 0;
		char c;
		
		int n = Integer.parseInt(in.nextLine());
		String s = in.nextLine();

		for (int i=0; i<n; i++) {
			c =  s.charAt(i);

			if (c == 'A'){
				a++;
			}
		}

		d = n - a;

		if(a == d){
			System.out.println("Friendship");
		} else {
			if (a > d) {
				System.out.println("Anton");
			} else {
				System.out.println("Danik");
			}
		}
	}
}