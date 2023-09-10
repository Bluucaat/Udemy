package bluu.cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>(List.of("Orange", "Apple", "Mango"));

        while (true) {
            printOptions();
            Scanner input = new Scanner(System.in);
            String userChoice = input.nextLine();

            switch (userChoice) {
                case "0" -> System.exit(1);
                case "1" -> {
                    System.out.println("Input the item name you want to add");
                    userChoice = input.nextLine();
                    addItem(userChoice, groceryList);
                }
                case "2" -> {
                    System.out.println("Input the item name you want to remove");
                    userChoice = input.nextLine();
                    removeItem(userChoice, groceryList);
                }
                default -> System.out.println("Unknown input");
            }
        }
    }

    private static void printOptions() {
        System.out.printf("Welcome, please chose from the following:%n" +
                "0. Close the program%n" +
                "1. Add a product to the list%n" +
                "2. Remove a product from the list%n");
    }

    private static void addItem(String userChoice, ArrayList<String> groceryList) {
        if (!groceryList.contains(userChoice)) {
            groceryList.add(userChoice);
            System.out.printf("%s has been added to the item list.%n", userChoice);
            System.out.printf("The updated list is: %s%n", groceryList);
            return;
        }
        System.out.println("The item is already in the list.");
    }

    private static void removeItem(String userChoice, ArrayList<String> groceryList) {
        if (groceryList.contains(userChoice)) {
            groceryList.remove(userChoice);
            System.out.printf("%s has been removed from the item list.%n", userChoice);
            System.out.printf("The updated list is: %s%n", groceryList);
            return;
        }
        System.out.println("The item does not exist in the list.");
    }
}

