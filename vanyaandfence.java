import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = 0,a, f,h, i = 0;
		f = scanner.nextInt();
		h = scanner.nextInt();	
		while(i < f)
		{
			a = scanner.nextInt(); 
			w+=(a <= h)?1:2;
			i++;
		}
		System.out.println(w);
	}
}
