package hw.hw_5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class hw5 {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true
    }

    /**
     * Дана последовательность скобочек. Проверить, что она является корректной.
     */
    // TODO: 07.04.2023 Вписать решение!
    // Нужно завести маппинг скобочек либо ( -> ), либо ) -> ( и так для каждой пары
    // Нужно использовать Deque.
    // Открывающуюся скобку вносим в Deque (insertFirst)
    // Если встретилась закрывающаяся скобка, то (Deque#pollFirst) и сравниваем ее с
    // встретившейся

    static boolean isCorrectParentheses(String parentheses) {
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put('(', ')');
        mapping.put('{', '}');
        mapping.put('[', ']');
        mapping.put('<', '>');

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : parentheses.toCharArray()) {
            if (mapping.containsKey(c)) {
                stack.addFirst(c);
            } else if (mapping.containsValue(c)) {
                if (stack.isEmpty() || mapping.get(stack.pollFirst()) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
