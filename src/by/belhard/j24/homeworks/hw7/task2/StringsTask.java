package by.belhard.j24.homeworks.hw7.task2;

import java.util.Arrays;
import java.util.List;

public class StringsTask {

    private static final int STRING_LENGTH_BORDER = 5;

    public static void main(String[] args) {

        List<String> list = Arrays.asList("aaa", "1", "bbbbbb", "cc", "qwe",
                "2r32rf23", "", "f23", "f23f23r");

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            if (s.length() < STRING_LENGTH_BORDER)
                sb.append(s).append(" ");
        }

        System.out.println(sb);
    }
}
