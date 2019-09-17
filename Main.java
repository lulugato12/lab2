import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.nextLine());
		int cont = 0;

		for(int i = 0; i < a; i++){
			String b = scan.nextLine();
			int c = 0;
			for(int j = 0; j < b.length(); j++){
				if(b.charAt(j) == '1'){
					c++;
				}
			}
			if(c >= 2){
				cont++;
			}
		}

		System.out.println(cont);
	}
}