import org.apache.commons.lang3.StringUtils;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String answer = scanner.nextLine();
        if (!StringUtils.isNumeric(answer)) {
            System.out.println(answer+" is not a number.");
        }
        System.out.println("Enter a phrase: ");
        String answer2 = scanner.nextLine();
        System.out.println(StringUtils.swapCase(answer2));
        System.out.println("Enter a phrase to reverse: ");
        String answer3 = scanner.nextLine();
        System.out.println(StringUtils.reverse(answer3));
    }
}
