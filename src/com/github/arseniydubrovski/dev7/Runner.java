package com.github.arseniydubrovski.dev7;

import java.util.Scanner;

/**
 * Reads day/month/year and hours/minutes/seconds from command line
 *  Reply our data is valid or not
 */
public class Runner {
  /**
   * Entry point of the program. Reads day/month/year and hours/minutes/seconds from command line
   *
   * @param args command line params
   */
  public static void main(String[] args) {
    while (true) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter data as:\"dd/MM/yyyy HH:mm:cc\"");
      String inputData = in.nextLine();
      CheckData checker = new CheckData();
      if (checker.checker(inputData)) {
        System.out.println("this data is valid");
        break;
      } else {
        System.out.println("this data is not valid, try again");
      }
    }
  }
}


