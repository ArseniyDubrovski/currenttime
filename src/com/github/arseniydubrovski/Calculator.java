package com.github.arseniydubrovski;

import java.util.Scanner;

/**
 * Read math expression, then solve it and print solution.
 */
public class Calculator {
  /**
   * Entry point of the program. Read math expression, then solve it and print solution.
   *
   * @param args command line params
   */
  public static void main(String[] args) {
    char[] inputString;
    if (args.length != 0) {
      inputString = args[0].toCharArray();
    } else {
      Scanner input = new Scanner(System.in);
      inputString = input.nextLine().toCharArray();
    }
    SolverOfMathematicalSequences result = new SolverOfMathematicalSequences(inputString);
    System.out.println("result: " + result.solver());
  }
}



