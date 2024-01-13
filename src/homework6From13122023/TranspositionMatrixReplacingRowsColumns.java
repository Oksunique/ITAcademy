package homework6From13122023;

public class TranspositionMatrixReplacingRowsColumns {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 3},
                {4, 1, 6},
                {7, 1, 9}
        };

        int[][] transposedMatrix = MatrixReplacingRowsColumns(matrix);

        System.out.println("The matrix:");
        printMatrix(matrix);

        System.out.println("The transposed matrix:");
        printMatrix(transposedMatrix);
    }
    //метод  для транспонирования матрицы, то есть обмена строк и столбцов
    public static int[][] MatrixReplacingRowsColumns(int[][] matrix) {
        //определяю количество строк и столбцов исходной матрицы, чтобы знать размеры новой транспонированной матрицы.
        int rows = matrix.length;
        int columns = matrix[0].length;
        //создаю новую матрицу с размерами, обратными исходной матрице
        // (количество строк равно количеству столбцов исходной матрицы, и наоборот)
        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                //Внутри вложенных циклов мы присваиваю каждому элементу транспонированной матрицы значение
                // соответствующего элемента исходной матрицы. При этом индексы элементов меняются местами
                // (i-ый элемент становится j-ым элементом)
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        //После завершения прохода по всем элементам исходной матрицы,
        // возвращаю полученную транспонированную матрицу.
        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
