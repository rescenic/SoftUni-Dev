import java.util.Scanner;

public class Animal_Type {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a=scanner.nextLine();
        switch(a){
            case "dog":
                System.out.println("mammal"); break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile"); break;
            default:
                System.out.println("unknown"); break;
        }
    }
}