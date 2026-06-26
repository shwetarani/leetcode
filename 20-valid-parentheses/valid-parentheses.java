class Solution {
    public boolean isValid(String s) {
        Stack<Character> result = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                result.push(ch);
            } else {
                if (result.isEmpty())
                    return false;

                if (ch == ')' && result.pop() != '(')
                    return false;

                if (ch == '}' && result.pop() != '{')
                    return false;

                if (ch == ']' && result.pop() != '[')
                    return false;
            }
        }
        return result.isEmpty();
    }
}