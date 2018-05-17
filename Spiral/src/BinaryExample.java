public class BinaryExample {
    public static void main(String[] args) {
//        binary(-3);
        printAsBinary(-2);

    }

    private static void binary(int n) {
        String str;
        if (n <= 0) {
            n *= -1;
            str = binaryOperation(n);
            str += 1;
            System.out.println(str);
        } else {
            str = binaryOperation(n);
            System.out.println(str);
        }
    }

    private static String binaryOperation(int n) {
        String binaryNumber = "";
        while (n > 0) {
            binaryNumber = ((n % 2) == 0 ? "0" : "1") + binaryNumber;
            n = n / 2;
        }
        return binaryNumber;
    }

    private static void printAsBinary(int a) {
        for (int i = 31; i >= 0; i--) {
            if ((a >> i & 1) == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
        System.out.println();
    }
}
