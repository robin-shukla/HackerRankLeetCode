package WeekOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CamelCase4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        while (scanner.hasNext()) {
            strings.add(scanner.nextLine());
        }
        for (String s : strings) {
            String[] tokens = s.split(";");
            StringBuilder res = new StringBuilder();
            if (s.charAt(0) == 'S') {
                for (int i = 0; i < tokens[2].length(); i++) {
                    if (tokens[2].charAt(i) == '(')
                        break;
                    else {
                        if (Character.isUpperCase(tokens[2].charAt(i))) {
                            res.append(" ").append(Character.toLowerCase(tokens[2].charAt(i)));
                        } else {
                            res.append(tokens[2].charAt(i));
                        }
                    }
                }
            } else {
                for (int i = 0; i < tokens[2].length(); i++) {
                    if (tokens[2].charAt(i) == ' ') {
                        res.append(Character.toUpperCase(tokens[2].charAt(i + 1)));
                        i++;
                    } else {
                        res.append(tokens[2].charAt(i));
                    }
                }
                if (s.charAt(2) == 'M')
                    res.append("()");
                if (s.charAt(2) == 'C')
                    res = new StringBuilder(Character.toUpperCase(res.charAt(0)) + res.substring(1));
            }
            System.out.println(res.toString().trim());
        }
    }
}
