import java.util.Scanner;
public class PoliceRecruits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int ev = 0, pol = 0, unat = 0;
		for (int i=0; i<n; i++) {
			ev = in.nextInt();

			if(ev < 0)
				if(pol > 0)
					pol--;
				else
					unat++;
			else
				pol += ev;
		}

		System.out.println(unat);	
	}	
}