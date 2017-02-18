package dev3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Read actions
 * execute actions
 */
public class Runner {
  /**
   * Entry point of the program.Read actions and then execute it
   *
   * @param args command line params
   */
  public static void main(String[] args) {
    System.out.println("Available options:");
    Action[] actions = Action.values();
    for (Action option : actions) {
      System.out.println(option.getActionName());
    }
    List<Human> humans = new ArrayList<>();
    Scanner reader = new Scanner(System.in);
    while (true) {
      System.out.println("Chose option:");
      Action curAction = Action.getFromInput(reader.nextLine());
      if (curAction == null) {
        System.out.println("I dont know this action.");
        continue;
      }
      if (curAction == Action.EXIT) {
        break;
      }
      curAction.applyAction(humans);
    }

  }
}
