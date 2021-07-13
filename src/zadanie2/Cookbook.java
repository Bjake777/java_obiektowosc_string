package zadanie2;

public class Cookbook {
    private Recipe recipes[];
    private int index;

    public Cookbook(int quantity) {
        recipes = new Recipe[quantity];
        index = 0;
    }

    public void addRecipe(Recipe recipe) {
        recipes[index] = recipe;
        index++;
    }

    public void displayRecipe(int index) {
        recipes[index].dispalyRecipe();
    }
    public void formatRecipe(int index) {
        recipes[index].formatRecipe();
    }


}
