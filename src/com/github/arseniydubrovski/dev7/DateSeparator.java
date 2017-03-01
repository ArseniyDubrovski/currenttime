package com.github.arseniydubrovski.dev7;

import java.util.ArrayList;
import java.util.List;

/**
 * separate date and time from inputData
 */
public class DateSeparator {

  private List<Integer> dateList = new ArrayList<>();

  public List<Integer> getDateList() {
    return dateList;
  }

  public void setDateAndTime(String inputData) {
    /**
     * divide list at time and date
     */
    String date = inputData.split(" ")[0];
    setDateList(date);
  }

  private void setDateList(String date) {
    /**
     * fill list of date
     */
    for (String variable : (date.split("[/]+"))) {
      dateList.add(Integer.parseInt(variable));
    }
  }

}