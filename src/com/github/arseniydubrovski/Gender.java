package dev3;

/**
 * enum for representing gender
 */
public enum Gender {
  MALE("M"), FEMALE("F");

  private final String inputString;

  private Gender(String inputString) {
    this.inputString = inputString;
  }

  public static Gender getFromInput(String input) {
    for (Gender option : Gender.values()) {
      if (option.inputString.equals(input)) {
        return option;
      }
    }
    return null;
  }
}
