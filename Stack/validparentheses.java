public class validparentheses {
    public static void main(String[] args) {
        String s = "{[()]}";
        boolean result = parentheses(s);
        System.out.println(result);
    }

    public static boolean parentheses(String s) {
        char stack[] = new char[s.length()];
        int stackPointer = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack[++stackPointer] = c;
            } else {
                if (stackPointer == -1) {
                    return false;
                }

                char top = stack[stackPointer--];
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stackPointer == -1;
    }
}
