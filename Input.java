import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter your rollno: ");
        int rollno = input.nextInt();
        System.out.print("Enter your Name: ");
        String name = input.next();
         System.out.print("Enter your  percentage: ");
        float percent = input.nextFloat();
        System.out.println("Your Name is " + name);
        System.out.println("Your RollNo is:"+rollno);
        System.out.println("Your percentage is " + percent);
    }
}
