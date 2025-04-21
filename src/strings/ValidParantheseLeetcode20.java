package strings;

import java.util.Stack;

public class ValidParantheseLeetcode20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);  // Push opening bracket
            } else {
                if (stack.isEmpty()) return false;  // If no matching opening bracket
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;  // Mismatched brackets
                }
            }
        }
        return stack.isEmpty();  // Valid if stack is empty
    }
//    public static boolean isValid(String s) {
//        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
//            s = s.replace("()", "").replace("{}", "").replace("[]", "");
//        }
//        return s.isEmpty();  // Check if all brackets are removed
//    }

//    public static boolean isValid(String s) {
//        while (true) {
//            if (s.contains("()")) {
//                s = s.replace("()", "");
//            } else if (s.contains("{}")) {
//                s.replace("{}","");
//            } else if (s.contains("[]")) {
//                s.replace("[]","");
//
//            }
//            else { return s.isEmpty();}
//        }
//    }
    public static void main(String[] args) {
        String s="()";
        System.out.println(isValid(s));
    }
}
