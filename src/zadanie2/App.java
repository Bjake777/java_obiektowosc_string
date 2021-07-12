package zadanie2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int quantity;
        System.out.println("ile przepisów chcesz przechowywac?");
        Scanner scanner = new Scanner(System.in);
        quantity = scanner.nextInt();

        Cookbook cookbook = new Cookbook(quantity);

        int decision = 0;

        do {
            System.out.println("Jaką czynnosc chcesz wykonac?");
            System.out.println("Dodać przepis wcisnij 1");
            System.out.println("wyswietlic przepis wcisnij 2");
            System.out.println("zakonczyc dzialanie programu wcisnij 3");
            decision = scanner.nextInt();

            switch (decision) {
                case 1:
                    String name;
                    String ingredients;
                    int executionTime;
                    String description;

                    System.out.println("podaj nazwę przepisu");
                    name = scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("podaj skladniki");
                    ingredients = scanner.nextLine();
                    System.out.println("podaj czas przygotowania");
                    executionTime = scanner.nextInt();
                    System.out.println("podaj opis");
                    description = scanner.nextLine();
                    description = scanner.nextLine();
                    Recipe recipe = new Recipe(name, ingredients, executionTime, description);
                    cookbook.addRecipe(recipe);
                    break;

                case 2:
                    int index;
                    System.out.println("podaj id przepisu");
                    index = scanner.nextInt();
                    cookbook.displayRecipe(index);

            }
        } while (decision != 3);

    }
}
