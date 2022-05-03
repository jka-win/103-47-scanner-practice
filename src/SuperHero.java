import java.util.Scanner;

public class SuperHero {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("Let's write a story about a superhero.");
      System.out.println("Who is the hero of our story?");
      String hero = scanner.nextLine();
      System.out.println("What is their superpower?");
      String power = scanner.nextLine();

      System.out.println("Here is the story:");
      System.out.println("""
        There once was a superhero named %1$s, who had the power of %2$s.
        As they grew older, %1$s saw that the world needed them.
        %1$s used their ability to %2$s to save the world.
        """.formatted(hero, power));
    }
  }
}
