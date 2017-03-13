package com.github.arseniydubrovski.dev7;

/**
 * cheack data is valid or not
 */
public class CheckData {

  /**
   * Reply our data is valid or not
   *
   * @param inputData day/month/year and hours/minutes/seconds from command line
   * @return data is valid or not
   */
  public boolean checker(String inputData) {
    Validator validator = new Validator();
    DateSeparator dateSeparator = new DateSeparator();
    if (validator.checkDate(inputData) && validator.checkTime(inputData)) {
      dateSeparator.setDateAndTime(inputData);
    } else {
      return false;
    }
    int day = dateSeparator.getDateList().get(0);
    int month = dateSeparator.getDateList().get(1);
    int year = dateSeparator.getDateList().get(2);
    if (!validator.checkFebruary(day, month, year) || !validator.isValidDayOfMonth(day, month)) {
      return false;
    }
    return true;
  }
}