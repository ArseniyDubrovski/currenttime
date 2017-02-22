package github.arseniydubrovski.dev5;

import java.util.ArrayList;
import java.util.List;

/**
 * calculate optimal composition of team you can find information about this method (Dynamic
 * programming in-advance algorithm) here  https://en.wikipedia.org/wiki/Knapsack_problem
 */
public class MaximalProductivity {

  private Integer amountOfMoney;

  /**
   * Constructor
   *
   * @param amountOfMoney sum of money at which we calculate optimal composition of team
   */

  public MaximalProductivity(Integer amountOfMoney) {
    this.amountOfMoney = amountOfMoney;
  }

  /**
   * calculate List optimal qualifications of team
   * calculate maxProductivity
   *
   * @return List optimal qualifications of team
   */
  public List<String> calculator() {
    List<Integer> variations = new ArrayList<>();
    List<List<String>> nameOfQualification = new ArrayList<>();
    variations.add(0);
    for (int i = 0; i <= amountOfMoney; i++) {
      Integer curValue = 0;
      Qualification curNameOfQualification = null;
      for (Qualification curQualification : Qualification.values()) {
        Integer salary = curQualification.getSalaries();
        if (salary <= i) {
          Integer valueOfProductivity =
              curQualification.getProductivity() + variations.get(i - salary);
          if (curValue < valueOfProductivity) {
            curValue = valueOfProductivity;
            curNameOfQualification = curQualification;
          }
        }
      }
      variations.add(curValue);
      if (curNameOfQualification != null) {
        List<String> cur = new ArrayList<>(
            nameOfQualification.get(i - curNameOfQualification.getSalaries()));
        cur.add(curNameOfQualification.toString());
        nameOfQualification.add(cur);
      } else {
        nameOfQualification.add(new ArrayList<>());
      }
    }

    return nameOfQualification.get(amountOfMoney);
  }
}
