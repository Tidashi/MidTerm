import java.util.Scanner;
public class MidtermQ7 {
    public static void main(String[] args){
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scrn.nextInt();
        if(isPrime(num)){
            System.out.println(num + " is not a composite number");
        }else{
            System.out.println(num + " is a composite number");
        }
    }
    public static boolean isPrime(int a){
        for(int j = 2; j < a; j++){
            if(a%j == 0){
                return false;
            }
        }
        return true;
    }
}
