package github.arseniydubrovski.dev5;

/**
 * all aviable qualifications with their productivity and salarys
 */
public enum Qualification {
  JUNIOR(1, 700), MIDDLE(2, 1200), SENIOR(3, 2000), LEAD(4, 2600);

  private final Integer productivity;
  private final Integer salaries;

  Qualification(Integer productivity, Integer salaries) {
    this.productivity = productivity;
    this.salaries = salaries;
  }

  public Integer getProductivity() {
    return productivity;
  }

  public Integer getSalaries() {
    return salaries;
  }

}

