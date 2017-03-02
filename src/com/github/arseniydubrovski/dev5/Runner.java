package github.arseniydubrovski.dev5;

import java.util.List;
import java.util.Scanner;

/**
 * Read money supply, require productivity and criterion from console
 * execute program
 */
public class Runner {

  /**
   * Entry point of the program
   *
   * @param args command line params
   */
  public static void main(String[] args) {
    System.out.println("Choose specification");
    System.out.println("1 for maxProuctivity");
    System.out.println("2 for minCost");
    System.out.println("3 for minQualification more then junior");
    Scanner input = new Scanner(System.in);
    Integer choose = input.nextInt();
    if (choose == 1) {
      System.out.println("Enter Amount of money");
      Integer amountOfMoney = input.nextInt();
      MaximalProductivity curMaxProductivity = new MaximalProductivity(amountOfMoney);
      List<String> Output = curMaxProductivity.calculator();
      System.out.println(Output);
    }
    if (choose == 2) {
      System.out.println("Enter Productivity");
      Integer productivity = input.nextInt();
      MinimalPrice curMinPrice = new MinimalPrice(productivity); //(TODO: +return
      List<String> Output = curMinPrice.calculator();
      System.out.println(Output);
    }
    if (choose == 3) {
      System.out.println("Enter Productivity");
      Integer productivity = input.nextInt();
      MinNumberNotJuniors curMinNumberOfJuniors = new MinNumberNotJuniors(productivity);
      Integer Output = curMinNumberOfJuniors.calculator();
      System.out.println("Juniors -" + Output + "Middle-0, Senior-0, Lead-0");
    }
  }
}
