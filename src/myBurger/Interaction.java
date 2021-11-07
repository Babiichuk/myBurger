package myBurger;

import java.util.Scanner;


public  class Interaction {
    private String welcomePhrase = "Добро пожаловать в Super Burger Cafe!";
    private String questionForOrderPhrase = "Вы хотите заказать бургер?";
    private String yesNoPhrase = "Введите Yes если да и No если нет.";
    private String moreChoicePhrase = "Хотите добавить дополнительный ингридиент?";
    private String additionalIngredientsPhrase = "Введите номер ингридиента.";
    private String summaryPhrase = "Ваш заказ:";
    private String byePhrase = "До свидания! Заходите к нам еще!";


    public void welcome (){
        System.out.println(welcomePhrase);
    }

    public void wantBurger (){
        System.out.println(questionForOrderPhrase);
    }

    public void yesNo (){
        System.out.println(yesNoPhrase);
    }

    public void bye (){
        System.out.println(byePhrase);
    }
    public void wantIngredients (){
        System.out.println(moreChoicePhrase);
    }
    public void summary (){
        System.out.println(summaryPhrase);
    }

    public void whatIngredient (){
        System.out.println(additionalIngredientsPhrase);
    }

    public int getUserNumber(){
        whatIngredient();
        Scanner scannerInt = new Scanner(System.in);
        int userNumber = scannerInt.nextInt();
        return userNumber;
    }
}