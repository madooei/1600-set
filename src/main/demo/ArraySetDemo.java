package demo;

import set.ArraySet;
import set.Set;

/** A demo of ArraySet: a website keeping track of the usernames that are taken. */
public final class ArraySetDemo {

  private ArraySetDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    Set<String> taken = new ArraySet<>();

    // Both names are free, so both adds return true.
    System.out.println("register alice: " + taken.add("alice"));
    System.out.println("register bob: " + taken.add("bob"));

    // alice is already taken, so this add returns false and the size stays 2.
    System.out.println("register alice again: " + taken.add("alice"));
    System.out.println("names taken: " + taken.size());

    // bob is taken and carol is not. Expect true, then false.
    System.out.println("is bob taken? " + taken.contains("bob"));
    System.out.println("is carol taken? " + taken.contains("carol"));

    // Once bob deletes the account, the name is free again. Expect true, false, true.
    System.out.println("bob deletes the account: " + taken.remove("bob"));
    System.out.println("is bob taken? " + taken.contains("bob"));
    System.out.println("register bob: " + taken.add("bob"));
  }
}
