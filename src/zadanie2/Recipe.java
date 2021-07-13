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
        System.out.println();
    }

    public void formatRecipe() {
        String[] splitDescription = description.split("\\.");
        description = "";
        for (int i = 0; i < splitDescription.length; i++) {
            if (i % 2 != 0 || i == 0) {
                description += splitDescription[i];
                description += ".";
            } else {
                description += "\n";
                description += splitDescription[i];
                description += ".";
            }

        }
        description += "\n Zachęcam do zapoznania się z innymi przepisami";
        System.out.println("sformatowano poprawnie");
        System.out.println();
    }
}
