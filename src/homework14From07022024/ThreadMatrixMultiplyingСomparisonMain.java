package homework14From07022024;
import java.util.Random;

/*Создайте матрицу размера n*m. Создайте два потока, один из которых перемножает все значения в столбцах и
потом находит сумму, а другой поток перемножает все значения в строках и тоже потом находит сумму.
Определите, какое число больше.*/

public class ThreadMatrixMultiplyingСomparisonMain {
    private static int n = 3;
    private static int m = 4;
    private static int[][] matrix = new int[n][m];
    private static int columnResult;
    private static int rowResult;

    public static void main(String[] args) {
        fillMatrix();

        Thread columnThread = new Thread(() -> {
            synchronized (ThreadMatrixMultiplyingСomparisonMain.class) {
                columnResult = multiplyColumns();
                int columnSum = sumColumns();
                System.out.println("columnThread: the product of values in columns: " + columnResult);
                System.out.println("columnThread: the sum of all values in the columns: " + columnSum);
            }
        });

        Thread rowThread = new Thread(() -> {
            synchronized (ThreadMatrixMultiplyingСomparisonMain.class) {
                rowResult = multiplyRows();
                int rowSum = sumRows();
                System.out.println("rowThread: the product of the values in the rows: " + rowResult);
                System.out.println("rowThread:the sum of all values in the rows: " + rowSum);
            }
        });

        columnThread.start();
        rowThread.start();

        try {
            columnThread.join();
            rowThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        compareResults(columnResult, rowResult);
    }

    private static void fillMatrix() {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }
        }
    }

    private static int multiplyColumns() {
        int product = 1;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                product *= matrix[i][j];
            }
        }
        return product;
    }

    private static int multiplyRows() {
        int product = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                product *= matrix[i][j];
            }
        }
        return product;
    }

    private static int sumColumns() {
        int sum = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static int sumRows() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static void compareResults(int columnResult, int rowResult) {
        if (columnResult > rowResult) {
            System.out.println("The product of the values in the columns is greater than in the rows.");
        } else if (columnResult < rowResult) {
            System.out.println("The product of the values in the rows is greater than the values in the columns.");
        } else {
            System.out.println("The products of the values in columns and rows are equal to to each other.");
        }
    }
}
