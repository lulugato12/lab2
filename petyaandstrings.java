import java.util.Scanner;
 
public class petyaandstrings{
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String str1=sc.nextLine().toLowerCase();
        String str2=sc.nextLine().toLowerCase();
        int diff=0;
        
        diff=str1.compareTo(str2);
        
        if(diff>0)
        System.out.println("1");
        else if(diff<-1)
            System.out.println("-1");
        else
            System.out.println("0");
    }
        
}
