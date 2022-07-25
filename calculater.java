import java.util.Scanner;
public class calculater {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("  ");
        int first = input.nextInt();
        System.out.print("+ ");
        int second = input.nextInt();
        int result = first + second;
        System.out.println(" -----");
        System.out.println("  " + result);
        input.close();
    }
}
