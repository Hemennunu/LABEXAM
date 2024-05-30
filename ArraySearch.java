import java.util.Scanner;
public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER A SEQUENCE OF NUMBERS ");
        String inputnum = scanner.nextLine();

        String[] num = inputnum.split(" ");
        int[] numArray = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            numArray[i] = Integer.parseInt(num[i]);
        }
        System.out.print("ENTER THE NUMBER YOU WANT TO SEARCH : ");
        int searchNum = scanner.nextInt();
        int c = 0;
        for (int number : numArray) {
            if (number == searchNum) {
                c++;
            }
        }
        if (c > num.length) {
            System.out.printf("%d appears %d times", searchNum, c);
        } else {
            System.out.printf("%d is not present", searchNum);
        }
       // scanner.close();
    }
}