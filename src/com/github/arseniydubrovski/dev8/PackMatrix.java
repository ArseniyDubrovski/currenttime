package com.github.arseniydubrovski.dev8;

import java.util.Scanner;

/**
 * Read matrix from console.
 */
public class PackMatrix {

  /**
   * Read matrix from console.
   *
   * @return matrix not empty matrix.
   */
  public double[][] packer() {

    int a, b;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of lines in matrix: ");
    a = Integer.parseInt(input.nextLine());
    System.out.print("Enter number of column in matrix: ");
    b = Integer.parseInt(input.nextLine());
    double[][] matrix = new double[a][b];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print("Enter element of the matrix" + "[" + i + "][" + j + "]: ");
        matrix[i][j] = Double.parseDouble(input.nextLine());
      }
    }
    return matrix;
  }
}