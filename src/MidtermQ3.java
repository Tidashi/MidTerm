import java.util.Scanner;
public class MidtermQ3 {
    public static void main(String[] args){
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter a number to check for palindrome: ");
        String number = scrn.nextLine();
        boolean isPalindrome = true;
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i)!= number.charAt(number.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println(number + " is a palindrome");

        }else{
            System.out.println(number + " is not a palindrome");
        }
    }
}
