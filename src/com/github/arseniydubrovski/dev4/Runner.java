package com.github.arseniydubrovski.dev4;

import java.util.Map;
import java.util.Scanner;


public class Runner {
  public static void main(String[] args) {
    Scanner consoleInput = new Scanner(System.in);

    int minNumbersOfInputs = 3;
    int currentIterate = 0;
    MapAdder addedoutput = new MapAdder();
    while (true) {
      currentIterate++;
      System.out.println("Enter  text");
      Map<String, Double> output = addedoutput.adder(consoleInput.nextLine());
      for (Map.Entry<String, Double> entry : output.entrySet()) {
        Double povt = entry.getValue();
        String digraph = entry.getKey();
        System.out.println("digraph:" + digraph + "-" + povt);
      }
      if (currentIterate >= minNumbersOfInputs) {
        System.out.println("Do you want to continue? y/n");
        if (consoleInput.nextLine().equals("n")) {
          break;
        }
      }
    }
  }
}
