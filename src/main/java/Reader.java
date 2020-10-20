import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (!StringUtils.isNumeric(answer)) {
            System.out.println(answer+" is not a number.");
        }
        String answer2 = scanner.nextLine();
        String[] split = StringUtils.split(answer2, " ");
        String[] toJoin = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            String word = split[i];
            String cappedFirst = word.substring(0, 1).toUpperCase() + word.substring(1);
            toJoin[i] = cappedFirst;
        }

        System.out.println(StringUtils.isNumeric(scanner.nextLine()));
        System.out.println(StringUtils.isNumeric(scanner.nextLine()));
    }
}
