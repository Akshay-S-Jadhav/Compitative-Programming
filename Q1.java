import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        while(n>1)
            if (n%2 == 0){
                int answer1 = n/2;
                System.out.println("The number is even and the answer will be : "+answer1);
                n = answer1;
            }else{
                int answer2 = 3*n+1;  
                System.out.println("The number is odd and the answer will be : "+answer2);
                n = answer2;
            }
        
        System.out.println("End of the program");
        sc.close();
    }
}
