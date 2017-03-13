package com.github.arseniydubrovski.dev7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Reply our data is valid or not.
 */
public class Validator {

  private final int[] MONTHS_WITH_30_DAY = {4, 6, 9, 11};
  private final int MONTH_FEBRUARY = 2;
  private final int DAYS_IN_FEBRUARY_NORMAL = 28;
  private final int DAYS_IN_FEBRUARY_LEAP_YEAR = 29;


  public boolean checkDate(String inputData) {
    /**
     * check input date consist of valid numbers or not
     */
    Pattern date = Pattern.compile("^([0-2][1-9]|3[0-1])[/]([0][1-9]|[1][0-2])[/][0-9]{1,4}");
    Matcher m = date.matcher(inputData);
    return m.find();
  }

  public boolean checkTime(String inputData) {
    /**
     * check input time consist of valid numbers or not
     */
    Pattern time = Pattern.compile("([0-1][0-9]|[2][0-4])[:]([0-5][0-9])[:]([0-5][0-9])");
    Matcher m = time.matcher(inputData);
    return m.find();
  }

  public boolean isValidDayOfMonth(int day, int month) {
    /**
     * method checks number of days  which includes month
     */
    for (int curMonth : MONTHS_WITH_30_DAY) {
      if (month == curMonth) {
        if (day <= 30) {
          return true;
        } else {
          return false;
        }
      }
    }
    return true;
  }

  public boolean checkFebruary(int day, int month, int year) {
    /**
     * method check february is leap year or normal
     */
    if (month == MONTH_FEBRUARY) {
      if (day <= DAYS_IN_FEBRUARY_NORMAL) {
        return true;
      } else if (year % 4 == 0 && day <= DAYS_IN_FEBRUARY_LEAP_YEAR) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

}