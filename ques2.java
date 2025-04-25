import java.util.Scanner;

public class ques2{
    public static void main(String[] args) {
       try(Scanner a =new Scanner(System.in)){
        System.out.println("Enter a number: ");
        int num=a.nextInt();
        for(int i=num; i>=1; i--)
            System.out.println(i*i);
        }
    }
}
