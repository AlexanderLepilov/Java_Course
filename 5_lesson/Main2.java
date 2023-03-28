import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Objects;


public class Main2 {

    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("[()")); // false
        System.out.println(isCorrectParentheses("[()]")); // true
        System.out.println(isCorrectParentheses("{}()[]<>")); // true
        System.out.println(isCorrectParentheses("{(]])}{()}")); // false
        System.out.println(isCorrectParentheses("(()]")); // false
        System.out.println(isCorrectParentheses("](")); // false
        System.out.println(isCorrectParentheses("((((")); // false

    }

    static boolean isCorrectParentheses(String parentheses) {
        char[] chars = parentheses.toCharArray();
        if (chars.length % 2 != 0) {
            return false;
        }

        Map<Character, Character> dict = Map.of(
                '(', ')',
                '[', ']',
                '<', '>',
                '{', '}');

        Deque<Character> symbols = new ArrayDeque<>(); // queue FIFO
        for (char c : chars) {
            if (dict.containsKey(c)) { // c - открывающаяся скобка
                symbols.add(c); // сохраняем
            } else { // c - закрывающаяся
                if (symbols.isEmpty()) {
                    return false;
                }

                Character lastSymbol = symbols.pollLast(); // открывающая
                if (!Objects.equals(dict.get(lastSymbol), c)) { // Закрывающаяся для lastSymbol не совпадает с с
                    return false;
                }
            }
        }

        return symbols.isEmpty();
    }

}