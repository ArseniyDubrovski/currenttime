package dev3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * all available actions
 */
public enum Action {
  ADD("Add person") {
    /**
     * pack data fields of human
     *
     * @param humans all registred humans
     */
    @Override
    public void applyAction(List<Human> humans) {
      System.out.println("write name as alpha character"); //TODO: remove terms and make tests
      Scanner input = new Scanner(System.in);
      String name = input.nextLine();
      System.out.println("write surname as characters");
      String surname = input.nextLine();
      System.out.println("write gender as M for man or F for female");
      Gender gender = Gender.getFromInput(input.nextLine());
      System.out.println("write age as number");
      Integer age = Integer.valueOf(input.nextLine());
      Human human = new Human(name, surname, gender, age);
      humans.add(human);
    }
  },

  GET_MOST_POPULAR("Get popular name") {
    /**
     * search most frequent name
     *
     * @param humans all registred humans
     */
    @Override
    public void applyAction(List<Human> humans) {
      Map<String, List<Human>> females = humans.stream().filter(human -> human.getGender() == Gender.FEMALE).collect(Collectors.groupingBy(Human::getName));
      int maxElement = 0;
      String popName = null;
      for (Map.Entry<String, List<Human>> entry : females.entrySet()) {
        if (entry.getValue().size() > maxElement) {
          maxElement = entry.getValue().size();
          popName = entry.getKey();
        }
        System.out.println("Most popular name:" + popName);


      }
    }
  },

  GET_ELDEST("Get eldest") {
    /**
     * serach max age
     *
     * @param human all registred humans
     */
    @Override
    public void applyAction(List<Human> human) {
      Optional<Human> eldest = human.stream().max((first, second) -> first.getAge().compareTo(second.getAge()));
      if (eldest.isPresent()) {
        System.out.println("Eldest human:" + eldest.get());
      }
    }
  },

  GET_AVERAGE_AGE("Get average age") {
    @Override
    /**
     * calculate average age
     */
    public void applyAction(List<Human> human) {
      OptionalDouble averageAge = human.stream().mapToInt(Human::getAge).average();
      if (averageAge.isPresent()) {
        System.out.println("Average age: " + averageAge.getAsDouble());
      } else {
        System.out.println("no persons");
      }
    }
  },

  GET_ALL_NAMESAKES("Get all namesakes") {
    @Override
    /**
     * serach namesakes
     */
    public void applyAction(List<Human> humans) {
      Map<String, List<Human>> surname = humans.stream().collect(Collectors.groupingBy(Human::getSurname));
      for (List<Human> sameSurnames : surname.values()) {
        if (sameSurnames.size() > 1) {
          sameSurnames.forEach(System.out::println);
        }

      }
    }
  },

  EXIT("Exit") {
    @Override
    public void applyAction(List<Human> humans) {

    }
  };

  private final String name;

  public String getActionName() {
    return name;
  }

  abstract public void applyAction(List<Human> humans);

  Action(String name) {
    this.name = name;
  }

  public static Action getFromInput(String input) {
    for (Action option : Action.values()) {
      if (option.name.equals(input)) {
        return option;
      }
    }
    return null;
  }
}
