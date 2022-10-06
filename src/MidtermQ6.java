import java.util.*;
public class MidtermQ6 {
    public static void main(String[] args){
        Scanner scrn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scrn.nextInt();
        for(int i =10; i < number; i++ ){
            if(isPalindrome(Integer.toString(i))){
                System.out.println(i);
            }
        }



    }
    public static boolean isPalindrome(String a) {

        int l = a.length()-1;
        for(int g = 0; g < a.length(); g++){


            if(a.charAt(g) != a.charAt(l)){


                return false;
            }
            l--;
        }
        return true;
    }
}
