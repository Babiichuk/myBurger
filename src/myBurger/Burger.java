package myBurger;

import java.util.ArrayList;

public class Burger {

    String burgerName;
    int burgerPrice;
    ArrayList<Ingredient> ingredients = new ArrayList<>();

    public Burger(String name, int price){
        burgerName = name;
        burgerPrice = price;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public int getBurgerPrice() {
        return burgerPrice;
    }

    public void showBurger() {
        int commonPrice = burgerPrice;
        int priceOfIngredients = 0;
        System.out.println("Бургер: " + burgerName);
        if (ingredients.isEmpty() != true){
            System.out.println("Дополнительные ингридиенты: ");
            for (int i=0; i<ingredients.size(); i++){
                System.out.println(ingredients.get(i).getIngredientName());
                priceOfIngredients = priceOfIngredients + ingredients.get(i).getIngredientPrice();
            }
            commonPrice = burgerPrice + priceOfIngredients;
        };

        System.out.println("Цена - " + commonPrice);
    }


}
