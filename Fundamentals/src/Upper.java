import java.util.Scanner;

public class Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um texto:");
        String inputText = sc.nextLine();

        String upperCaseText = makeUpperCase(inputText);
        System.out.println(upperCaseText);
    }
    public static String makeUpperCase(String str) {
        return str.toUpperCase();
    }
}
