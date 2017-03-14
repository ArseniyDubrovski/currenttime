package com.github.arseniydubrovski.dev8;

/**
 * multiply matrices
 */
public class MatrixMultiplication {

  /**
   * Multiply matrices
   *
   * @param firstMatrix  arrays which contains elements of first matrix.
   * @param secondMatrix arrays which contains elements of second matrix .
   * @return resultMatrix result of multiplication
   */
  public double[][] multiply(double[][] firstMatrix, double[][] secondMatrix) {

    int rowsOfFirstMatrix = firstMatrix.length;
    int columnsOfFirstMatrix = firstMatrix[0].length;
    int rowsOfSecondMatrix = secondMatrix.length;
    int columnsOfSecondMatrix = secondMatrix[0].length;

    if (columnsOfFirstMatrix != rowsOfSecondMatrix) {
      System.out.println("can not multiply matrix");
    }

    double[][] resultMatrix = new double[rowsOfFirstMatrix][columnsOfSecondMatrix];
    for (int i = 0; i < rowsOfFirstMatrix; i++) {
      for (int j = 0; j < columnsOfSecondMatrix; j++) {
        resultMatrix[i][j] = 0;
        for (int k = 0; k < columnsOfFirstMatrix; k++) {
          resultMatrix[i][j] = resultMatrix[i][j] + firstMatrix[i][k] * secondMatrix[k][j];
        }
      }
    }
    return resultMatrix;
  }
}