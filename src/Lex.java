import com.sun.deploy.util.StringUtils;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import sun.misc.Regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Lex {

    int status = 0; // 初始状态

    static int strPos = 0; // 下一个读入的字符


    static String str = "age >= 123;";

    // // 0: 初始状态   1： 数字  2：标识符  3：大于 4: 空格
    public static void main(String[] args) {

        List<Token> list = new ArrayList<>();

        String first = readNext();
        int initStatus = getFirstStatus(first);


        Token token = new Token();
        token.status = initStatus;
        token.text = token.text.concat(first);

        while (true) {
            String s = readNext();

            switch (initStatus) {
                case 0:

                    break;
                case 1:
                    if (isDigit(s)) {
                        token.text = token.text.concat(s);
                    } else if(isBlank(s)) {
                        initStatus = 4;
                    } else {
                        initStatus = 0;
                        list.add(token);
                    }
                    break;
                case 2:
                    if (isDigit(s) || isAlpha(s)) {
                        token.text = token.text.concat(s);
                    }else if (isBlank(s)) {
                        initStatus = 4;
                    }else{
                        initStatus = 0;
                        list.add(token);
                    }
                    break;
                case 3:
                    if (s.equals("=")) {
                        token.text = token.text.concat(s);
                    }else if (isBlank(s)) {
                        initStatus = 4;
                    }else {
                        initStatus = 0;
                        list.add(token);
                    }
                    break;
                case 4:
                    list.add(token);
                    token = new Token();
                    initStatus = getFirstStatus(s);
                    token.status = initStatus;
                    token.text = token.text.concat(s);
                    break;
            }
            if (initStatus == 0) {
                break;
            }
        }
        list.forEach(c -> System.out.println(c));
    }


    public static int getFirstStatus(String first) {
        int initStatus = 0;
        if (isDigit(first)) {
            initStatus = 1;
        } else if (isAlpha(first)) {
            initStatus = 2;
        } else if (isGe(first)) {
            initStatus = 3;
        }
        return initStatus;
    }


    public static Boolean isDigit(String character) {
        return Pattern.matches("[0-9]", character);
    }

    public static Boolean isAlpha(String str) {
        return Pattern.matches("[a-zA-Z]", str);
    }

    public static Boolean isGe(String str) {
        return str.equals(">");
    }

    public static Boolean isBlank(String str) {
        return str.equals(" ");
    }

    public static String readNext() {
        if (strPos < str.length()) {
            return String.valueOf(str.charAt(strPos++));
        }
        return "";
    }


}

class Token {
    String text = "";
    int status;

    @Override
    public String toString() {
        return status + "  " + text;
    }
}
