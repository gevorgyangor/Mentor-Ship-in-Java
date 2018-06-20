package braceChecker;

public class BraceChecker {

    private static StackImplementation stack = new StackImplementation();

    void check(String text) {
        char a = '{';
        char b = '(';
        char c = '[';
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stack.push(text.charAt(i));
                    break;
                case ')':
                    stack.pop();
                    if (text.charAt(i) == b) {

                        System.out.println("ok");
                    } else {
                        System.out.println("voch ok");
                    }
                    break;
                case '}':
                    stack.pop();
                    if (text.charAt(i) == a) {
                        System.out.println("is ok");
                    } else {
                        System.out.println("not is ok");
                    }
                    break;
                case ']':
                   c = (char) stack.pop();
                    if (c == '[') {
                        System.out.println("is ok");
                    } else {
                        System.out.println("not is ok");
                    }
                    break;

            }

        }
    }
}
