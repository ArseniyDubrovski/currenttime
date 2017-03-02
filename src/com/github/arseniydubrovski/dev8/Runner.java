package com.github.arseniydubrovski.dev8;

public class Runner {
  /**
   * Entry point of the program. Pack matrices by console and then print result of multiplication
   *
   * @param args command line params
   */
  public static void main(String[] args) {

    PackMatrix curPaker = new PackMatrix();
    MatrixMultiplication multiplier = new MatrixMultiplication();
    System.out.println("First matrix");
    double[][] firstMatrix = curPaker.packer();
    System.out.println("Second matrix");
    double[][] secondMatrix = curPaker.packer();
    double[][] resultMatrix;
    resultMatrix = multiplier.multiply(firstMatrix, secondMatrix);

    System.out.println("Result matrix: ");
    for (int i = 0; i < resultMatrix.length; i++) {
      for (int j = 0; j < resultMatrix[i].length; j++) {
        System.out.print(resultMatrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}