import java.util.Stack;

/**
 * @Description: 有效括号
 * @Author: Awei
 * @Create: 2021-04-27 14:03
 **/
public class Main {
    public static void main(String[] args) {
        String brackets = "[}";
        System.out.println(isValidBracket(brackets));
    }


    /**
     * 是否有效括号  方法
     * @param brackets
     * @return
     */
    private static boolean isValidBracket(String brackets) {
        boolean isMached = true;
        Stack<Character> stack = new Stack<>();
        if (null == brackets || "".equals(brackets))
            return true;
        // bracket must not be "" or null
        int index = 0;
        while (isMached && index < brackets.length()) {
            char ch = brackets.charAt(index++);
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else {
                if (stack.isEmpty())
                    return false;
                char pop = stack.pop();
                isMached = (pop + 1 == ch || pop + 2 == ch);
            }
        }
        return stack.isEmpty() && isMached;
    }
}
