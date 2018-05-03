public class Spiral {

    public static void main(String[] args) {
        int a = 27;
        int b = (int) Math.sqrt(a);
        int d = b * b;
        if (a == d) {
            int[][] spiral = createSpiral(b, a);
        } else {
            int[][] spiral = createSpiral(b + 1, a);
        }


    }

    private static int[][] createSpiral(int size, int count) {
        int[][] spiral = new int[size][size];
        int content = count;
        int start = 0;
        int startSpiral = 0;
        int endSpiral = size - 1;

        while (0 <= content) {

            for (int i = startSpiral; i <= endSpiral; i++) {
                spiral[startSpiral][i] = content--;
            }
            for (int j = startSpiral; j <= endSpiral; j++) {
                spiral[j][endSpiral] = content--;
            }
            for (int i = endSpiral - 1; i >= startSpiral; i--) {
                spiral[endSpiral][i] = content--;
            }
            for (int j = endSpiral - 1; j >= startSpiral + 1; j--) {
                spiral[j][startSpiral] = content--;
            }

            startSpiral++;
            endSpiral--;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
        return spiral;
    }

//    public static void printSpiral(int[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(array[i][j] + ", ");
//            }
//        }
//    }
}
