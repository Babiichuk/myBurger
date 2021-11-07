package myBurger;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Burger burger = new Burger("Классический", 50);

        ArrayList<Ingredient> additionalIngredients = new ArrayList<>();

        additionalIngredients.add(new Ingredient("Соус", 10));
        additionalIngredients.add(new Ingredient("Сыр", 20));
        additionalIngredients.add(new Ingredient("Котлета", 30));

        Interaction interaction = new Interaction();

        interaction.welcome();
        interaction.wantBurger();
        interaction.yesNo();

        String answer = scanner.nextLine();


        if (answer.equalsIgnoreCase("yes")) {
            burger.showBurger();
            interaction.wantIngredients();
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")){
                for(int i=0; i<additionalIngredients.size(); i++){
                    System.out.println(i + " - " + additionalIngredients.get(i).getIngredientName() + " - " + additionalIngredients.get(i).getIngredientPrice());
                }

                burger.ingredients.add(additionalIngredients.get(interaction.getUserNumber()));

                interaction.summary();
                burger.showBurger();

            }else if (answer.equalsIgnoreCase("no")){
                interaction.summary();
                burger.showBurger();
            }

        } else if (answer.equalsIgnoreCase("no")) {
            interaction.bye();
        }
    }
}

