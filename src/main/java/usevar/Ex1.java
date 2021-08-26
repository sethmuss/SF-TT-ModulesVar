package usevar;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Ex1 {
  // NO ONLY for local variables
//  private var name = "Fred";

  public static String[] getNames() { return null; }

  public static void useArray(int [] ia) {}

  // GENERALLY can't use var for anything not immediately initialized
//  public static void doStuff(var x) {}
  public static void main(String[] args) {
    System.out.println("Hello world");

    final var x = 3_000_000_000L;
//    long bin = 0b1001_0000_...
//    long x = 3000;
//    x = "Hello";

//    var y;
//    y = "Hello";
    var y = "Hello";
//    int const = 99;
    var var = 99;

//    int [] ia = {1, 2, 3};
//    int [] ia = new int[]{1, 2, 3};
    var ia = new int[]{1, 2, 3};
//    var [] ia2 = new int[]{1, 2, 3};
    useArray(ia);
//    useArray({1, 2, 3});
    useArray(new int[]{1, 2, 3});

    var names = getNames();
//    var moreNames = {"Alice", "Bob"};
    var moreNames = new String[]{"Alice", "Bob"};

    List<String> ls = List.of("Fred", "Jim");
    for (var s : ls) { // works with C-style for loop too
      System.out.println(s);
    }

    try (var input = new FileReader("")) {

//    } catch (var ioe) {
    } catch (IOException ioe) {
      System.out.println("Bang!");
    }

    Map<String, List<Map.Entry<String, Long>>> stuff = new HashMap<>();

    var v = List.of("Fred", "Jim", "Sheila")
        .stream()
        .map(String::toUpperCase)
        .map(String::length)
        ;
    v.forEach(System.out::println);

    boolean b = true;
    var t = b ? "Hello" : 99;
//    t.compareTo(...)


//    Predicate<String> ps = (String s) -> {return true;};
//    Predicate<String> ps = (@Deprecated String s) -> true ;
    Predicate<String> ps = (@Deprecated var s) -> true ;
//    Predicate<String> ps = (var s) -> true ;

//    BiFunction<String, Integer, Object> bfsio = (s, i) -> null;
//    BiFunction<String, Integer, Object> bfsio = (String s, Integer i) -> null;
    BiFunction<String, Integer, Object> bfsio = (var s, var i) -> null;
  }
}

// NO!
//class var {}