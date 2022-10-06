import java.util.*;
public class MidtermQ2 {
    public static void main(String[] args){
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter a number to be revered: ");
        String number = scrn.nextLine();
        for(int i = number.length()-1; i >= 0; i--){
            System.out.print(number.charAt(i));
        }
    }
}
