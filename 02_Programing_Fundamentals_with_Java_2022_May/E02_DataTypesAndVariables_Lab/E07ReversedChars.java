package E02_DataTypesAndVariables_Lab;

import java.util.Scanner;

public class E07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);

        String result = "";

//        System.out.println(result + c + " " + b + " " + a);

        System.out.printf("%c %c %c",c, b, a);




    }
}