import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		int x=0,y=0,iz=0,a=0,p=0;
		for(int i=0; i < 5; i++)
		{
			for (int j = 0;j < 5;j++) 
			{
				matrix[a][iz]=scanner.nextInt();
				if(matrix[a][iz] == 1)
					x=iz+1;
				if(matrix[a][iz] == 1)
					y=a+1;
				
				iz++;
			}
			a++;
			iz=0;
		}
		p+=(x-3 > 0)?x-3:-(x-3);
		p+=(y-3 > 0)?y-3:-(y-3);
		System.out.println(p);
	}
}
