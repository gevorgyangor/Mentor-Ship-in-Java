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

//        int[][] spiral = createSpiral(3);
//        printSpiral(spiral);
        createMatrix(5);
    }

    public static int[][] createMatrix(int size){
        int[][] matrix = new int[size][size];
        int biggestNumber = size * size;
        int length = size - 1;
        int currentLength = length;
        int startIndex = 0;
        for (int i = biggestNumber; i > 1;) {
            for (int j = startIndex; j < currentLength + startIndex; j++) {
                matrix[startIndex][j] = i;
                matrix[j][length - startIndex] = i - currentLength;
                matrix[length - startIndex][length - j] = i - currentLength * 2;
                matrix[length - j][startIndex] = i - currentLength * 3;
                i--;
            }
            i = i - currentLength * 3;
            currentLength -= 2;
            startIndex++;
        }
        if (size % 2 != 0){
            int center = size / 2;
            matrix[center][center] = 1;
        }
        return matrix;
    }

    private static int[][] createSpiral(int size,int n) {
        int[][] spiral = new int[size][size];
        int content = size * size;
        int row = 0;
        int column = size - 1;

        while (content >= 1) {

            for (int i = row; i <= column; i++) {
                spiral[row][i] = content--;
            }
            for (int j = row + 1; j <= column; j++) {
                spiral[j][column] = content--;
            }
            for (int i = column - 1; i >= row; i--) {
                spiral[column][i] = content--;
            }
            for (int j = column - 1; j >= row + 1; j--) {
                spiral[j][row] = content--;
            }

            row++;
            column--;
        }
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
