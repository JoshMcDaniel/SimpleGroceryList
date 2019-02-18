package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceyList() {
        if (groceryList.size() == 1) {
            System.out.println("You have " + groceryList.size() + " item in your grocery list.");

        } else {
            System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        }

        for (int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery list item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Grocery list item " + (position+1) + " has been removed.");
    }

    public String findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }

}
