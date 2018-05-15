public class BinaryExample {
    public static void main(String[] args) {
        System.out.println(binary(1));
    }

    private static String binary(int n) {
        String binaryNumber = "";
        while (n > 0) {
            binaryNumber = ((n % 2) == 0 ? "0" : "1") + binaryNumber;
            n = n / 2;
        }
        return binaryNumber;
    }

}
