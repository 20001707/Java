import java.util.Scanner;
public class LengthStr {
    public static void main(String args[]) {
        String text;
        Scanner SC=new Scanner(System.in);
        System.out.print("enter the string:");
        text=SC.nextLine();
        int length=text.length();
        System.out.println("Length of the given string:" + text + " "+ "is :" +length);
}
}
