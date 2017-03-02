package github.arseniydubrovski.dev5;

import java.util.ArrayList;
import java.util.List;

/**
 * calculate min cost of team, with const productivity
 * can be not best choose, you can try to find better method here  https://en.wikipedia.org/wiki/Knapsack_problem
 *
 */
public class MinimalPrice {

  private Integer productivity;

  /**
   * Constructor
   *
   * @param productivity value at which we calculate min Cost of team
   */

  public MinimalPrice(Integer productivity) {
    this.productivity = productivity;
  }

  /**
   * calculate minimal cost of team with const Productivity
   * calculate List of cheapest team with const Productivity
   *
   * @return minimal cost of team with const Productivity
   */

  public List<String> calculator() {
    List<Integer> variations = new ArrayList<>();
    List<List<String>> nameOfQualification = new ArrayList<>();
    variations.add(0);
    for (int i = 0; i <= productivity; i++) {
      Integer curValue = 0;
      Qualification curNameOfQualification = null;
      for (Qualification curQualification : Qualification.values()) {
        Integer curProductivity = curQualification.getProductivity();
        if (curProductivity <= i) {
          Integer valueOfMoney = curQualification.getSalaries() + variations.get(i - curProductivity);
          if (curValue < valueOfMoney) {
            curValue = valueOfMoney;
            curNameOfQualification = curQualification;
          }
        }
      }
      variations.add(curValue);
      if (curNameOfQualification != null) {
        List<String> cur = new ArrayList<>(nameOfQualification.get(i - curNameOfQualification.getProductivity()));
        cur.add(curNameOfQualification.toString());
        nameOfQualification.add(cur);
      } else {
        nameOfQualification.add(new ArrayList<>());
      }
    }

    //return variations.get(productivity);
    return nameOfQualification.get(productivity);

  }
}
