public class Spiral {

    public static void main(String[] args) {
//        int a = 27;
//        int b = (int) Math.sqrt(a);
//        int d = b * b;
//        if (a == d) {
//            int[][] spiral = createSpiral(b, a);
//        } else {
//            int[][] spiral = createSpiral(b + 1, a);
//        }

        int[][] spiral = createSpiral(3);
        printSpiral(spiral);
    }

    private static int[][] createSpiral(int size) {
        int[][] spiral = new int[size][size];
        int content = size * size;
        int row = 0;
        int column = size - 1;

        while (content >= 1) {

            for (int i = row; i <= column; i++) {
                spiral[row][i] = content--;
                System.out.print(spiral[row][i]);
            }
            for (int j = row; j <= column - 1; j++) {
                spiral[j][column] = content--;
                System.out.print(spiral[j][column]);
            }
            for (int i = column - 1; i >= row; i--) {
                spiral[column][i] = content--;
                System.out.print(spiral[column][i]);
            }
            for (int j = column - 1; j >= row + 1; j--) {
                spiral[j][row] = content--;
                System.out.print(spiral[j][row]);
            }

            row++;
            column--;
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
        return spiral;
    }

    private static void printSpiral(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + ", ");
            }
        }
    }
}
