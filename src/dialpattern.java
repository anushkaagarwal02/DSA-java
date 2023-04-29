import java.util.ArrayList;
public class dialpattern {
    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }

    public static ArrayList<String> letterCombinations(String digits) {
        return fun("", digits);
    }

    public static ArrayList<String> fun(String p, String digits) {
        ArrayList<String> list = new ArrayList<>();
        if (digits.isEmpty()) {
            list.add(p);
            return list;
        }
        int ch = digits.charAt(0) - '1';
        for (int i = (ch - 1) * 3; i < ch * 3; i++) {
            char c = (char) ('a' + i);

            list.addAll(fun(p + c, digits.substring(1)));
        }
        if (list.isEmpty()) {
            return list;
        }
        return list;
    }
}

