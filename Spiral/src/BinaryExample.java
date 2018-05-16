public class BinaryExample {
    public static void main(String[] args) {
        binary(-3);
        byte b = -100;
        String[] str = byteToBits(b);
        for (int i = 0; i < str.length; i++) {
            String bs = str[i];
            System.out.print(bs);
        }
        System.out.println();
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

    private static String[] byteToBits(byte b) {
        String[] str = new String[8];
        if (b <= 0) {
            b = (byte) ((byte) ~b + 1);
            str = byteToBiteOldNumber(b);
            return str;
        } else {
            for (int i = 0; i < str.length; i++) {
                str[(str.length - 1) - i] = "" + (b >> i) % 2;
            }
        }
        return str;
    }

    private static String[] byteToBiteOldNumber(byte old) {
        String[] str = new String[8];
        for (int i = 0; i < str.length; i++) {
            str[(str.length - 1) - i] = "" + (old >> i) % 2;
        }
        return str;
    }
}
