package com.company;

import java.util.ArrayList;

public class GroceryList {

    //  This is the array list that holds all of the grocery items.
    private ArrayList<String> groceryList = new ArrayList<String>();

    //  This method adds the user input to the next element in the array list.
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    //  This method is for printing the content of the array list and showing how many items are in the list.
    public void printGroceyList() {
        //  This if statement is just for making 'item' plural depending on the number of items in the list.
        if (groceryList.size() == 1) {
            System.out.println("You have " + groceryList.size() + " item in your grocery list.");

        } else {
            System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        }

        for (int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //  This method changes the string value of the element defined by the user.
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        //  Position+1 to offset the array 0-index. Helps with human readability.
        System.out.println("Grocery list item " + (position+1) + " has been modified.");
    }

    //  Removes an element from the array list.
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        //  Position+1 to offset the array 0-index. Helps with human readability.
        System.out.println("Grocery list item " + (position+1) + " has been removed.");
    }

    //  This method queries the array list for the string value input from the user.
    public String findItem(String searchItem) {
        //  indexOf will return the index of the element if the value is in the list or -1 if it is not.
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }

}
