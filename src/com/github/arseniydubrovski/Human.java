package dev3;

/**
 * describe human's  data
 */
public class Human {
  private String name;
  private String surname;
  private Gender gender;
  private Integer age;

  /**
   * Constructor
   * Create  object human, with his data
   *
   * @param name
   * @param surname
   * @param gender
   * @param age
   */
  public Human(String name, String surname, Gender gender, Integer age) {
    this.name = name;
    this.surname = surname;
    this.gender = gender;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Human{" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", gender=" + gender +
        ", age=" + age +
        '}';
  }
}
