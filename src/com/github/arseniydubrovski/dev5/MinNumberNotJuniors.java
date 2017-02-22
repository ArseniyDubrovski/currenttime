package github.arseniydubrovski.dev5;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculate  team with min ( Lead, Senior, Middle), so min(positive integer) = 0 -> we calculate
 * team just for junior
 */
public class MinNumberNotJuniors {

  private Integer productivity;

  /**
   * Constructor
   *
   * @param productivity value at which we calculate min Cost of team
   */
  public MinNumberNotJuniors() {
    this.productivity = productivity;
  }

  public Integer calculator() {
    int count = 0;
    Integer curValue = 0;
    List<Integer> variations = new ArrayList<>();
    List<List<String>> nameOfQualification = new ArrayList<>();
    variations.add(0);
    for (int i = 0; i <= productivity; i++) {
        if (Qualification.JUNIOR.getProductivity() <= i) {
          Integer valueOfMoney = Qualification.JUNIOR.getSalaries() + variations.get(i - Qualification.JUNIOR.getProductivity());
          if (curValue < valueOfMoney) {
            curValue = valueOfMoney;
            count++;
          }
        }
      }
    return count;
  }
}
