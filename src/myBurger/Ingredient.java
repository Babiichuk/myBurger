package myBurger;

public class Ingredient {
    private String ingredientName;
    private int ingredientPrice;

    public Ingredient(String name, int price){
        ingredientName = name;
        ingredientPrice = price;
    }

    public String getIngredientName() {
        return ingredientName;
    }
    public int getIngredientPrice() {
        return ingredientPrice;
    }


}
