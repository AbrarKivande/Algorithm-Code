import java.util.Scanner;
public class Count_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string: ");
        String s = sc.nextLine();

        int len = Check_Len(s);

        System.out.println("length of string is : "+len);
    }

    public static int Check_Len(String s) {
        int i = 0;
        s = s + ";";
        while (s.charAt(i) != ';') {
            i++;
        }
        return i;
    }
}