public class ques1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            boolean x = true;
            
            if (num <= 1) {
                x = false;
            } else {
                for (int i = 2; i <= num/2 ; i++) {
                    if (num % i == 0) {
                        x = false;
                        break;
                    }
                }
            }           
            if (x) {
                System.out.println(num +" is a prime number");
            } else {
                System.out.println(num + " is a composite number");
            }
        }
    }
}
