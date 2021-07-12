package zadanie2;

public class Recipe {
    private String name;
    private String ingredients;
    private int executionTime;
    private String description;

    public Recipe(String name, String ingredients, int executionTime, String description) {
        this.name = name;
        this.ingredients = ingredients;
        this.executionTime = executionTime;
        this.description = description;
    }

    public void dispalyRecipe() {
        System.out.println("nazwa: " + name);
        System.out.println("skladniki: " + ingredients);
        System.out.println("czas wykonania: " + executionTime);
        System.out.println("opis: " + description);
    }

}
