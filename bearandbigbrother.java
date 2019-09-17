import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = 0;
 
		while(a <= b){
			a = a*3;
			b = b*2;
			c++;
		}
		System.out.println(c);
	}
}
