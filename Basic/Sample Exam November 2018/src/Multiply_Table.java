import java.util.Scanner;

public class Multiply_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int first =number%10;
        number/=10;
        int second=number%10;
        number/=10;
        for (int i = 1; i <=first; i++) {
            for (int j = 1; j <=second; j++) {
                for (int k = 1; k <=number; k++) {
                    System.out.printf("%d * %d * %d = %d;\n",i,j,k,i*j*k);
                }
            }
        }
    }
}