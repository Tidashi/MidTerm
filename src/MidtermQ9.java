import java.util.Scanner;
//don't know if include 10 or not
public class MidtermQ9 {
        public static void main(String[] args){
            Scanner scrn = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = scrn.nextInt();
            int total  = 0;
            for(int i = 1; i <= number; i++){
                if(!isPrime(i)){
                    total += i;
                }
            }
            System.out.println("The total of all composite numbers between 1 and " + number + " is " + total);
        }
        public static boolean isPrime(int a){
            for(int j = 2; j < a; j++){
                if(a == 1){
                    return true;
                }
                if(a%j == 0){
                    return false;
                }
            }
            return true;
        }
    }