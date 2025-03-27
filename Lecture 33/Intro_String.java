import java.util.Scanner;
public class Intro_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value: ");
        // String s = sc.nextLine();
        // System.out.println(s);

        String s = sc.next();
        System.out.println("before function call"+s); //abrar

        search(s);

        System.out.println("after fuction call" +s); //abrar
    }    

    public static void search(String s) {
        s = "aaa";
    }
}
