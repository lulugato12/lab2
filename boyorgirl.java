import java.util.*;
public class boyorgirl{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scanner.next();
 
        int count = 0;
 
        ArrayList reference = new ArrayList();
        for(char i='a'; i<='z'; i++){
            reference.add(i);
        }
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<reference.size(); j++){
                if(s.charAt(i) == (char)reference.get(j)){
                    count++;
                    reference.remove(j);
                    break;
                }
            }
        }
 
        if(count % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
