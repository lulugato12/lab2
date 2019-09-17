import java.util.Scanner;
public class gravityflip{
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[ ] numeros = new int[x];
 
		for (int i=0;i<x;i++) {
			numeros[i]=sc.nextInt();
		}
		numeros=		ordenarBurbuja(numeros);
		for (int j=0;j<x;j++) {
			System.out.print(numeros[j] + " ");
		}
	}
	public static int[] ordenarBurbuja(int[] n){
		int temp;
		int t = n.length;
		for (int i = 1; i < t; i++) 
 
		{
			for (int k = t- 1; k >= i; k--) 
 
			{
				if(n[k] < n[k-1])
 
				{
					temp = n[k];
					n[k] = n[k-1];
					n[k-1]=  temp;
				}
			}
		}
		return n;
	}
}