import java.util.*;
public class MidtermQ1 {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scnr.nextInt();
        System.out.println("There are " + (int)(Math.log(number)-1) + " numbers.");
    }
}
