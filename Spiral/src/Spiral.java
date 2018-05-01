public class Spiral {

    public static void main(String[] args) {
        int[][] spiral = createSpiral(5);
        System.out.println("-------------------------------");
        printSpiral(spiral);

    }

    private static int[][] createSpiral(int size) {
        int[][] spiral = new int[size][size];
        int content = size * size;
        int start = 0;
        int startSpiral = 0;
        int endSpiral = size - 1;

        while (start <= content) {

            for (int i = startSpiral; i <= endSpiral; i++) {
                spiral[startSpiral][endSpiral] = start++;
            }
            for (int i = startSpiral; i <= endSpiral; i++) {
                spiral[i][endSpiral] = start++;
            }
            for (int i = endSpiral - 1; i >= startSpiral; i--) {
                spiral[endSpiral][i] = start++;
            }
            for (int i = endSpiral - 1; i >= startSpiral; i--) {
                spiral[i][startSpiral] = start++;
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

    public static void printSpiral(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + ", ");
            }
        }
    }
}