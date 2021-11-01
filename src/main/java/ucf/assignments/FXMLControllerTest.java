package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Quinn Barber
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FXMLControllerTest {

    @Test
    void addItems() {
        /*
            Call function and add item to list
            Set arraylist item to be equal to the list plus the new item
            Assert equals if they are the same, test passed
         */
    }

    @Test
    void addList() {
        /*
            Call function and add list to lists
            Set arraylist lists to be equal to the current lists plus the new list
            Assert equals if they are the same, test passed
         */
    }

    @Test
    void openList() {
        /*
            Call function to open list
            Set string equal to the name of the list
            Assert equals if the name of the label in GUI.fxml changes to the same name of the string, test passed
         */
    }

    @Test
    void editList() {
        /*
            Call function to change a selected list name to something else
            Set string equal to new list name
            Assert equals if the string is the same as the selected list name, test passed.
         */
    }

    @Test
    void delList() {
        /*
            Call the function to delete a list out of Lists available
            Set arraylist of lists equal to list with the list removed gone
            Assert equals if they are the same, test passed.
         */
    }

    @Test
    void delItem() {
        /*
            Call the function to delete an item out of Items available in an open list
            Set arraylist of items equal to the items in the list minus the one removed
            Assert equals if they are the same, test passed.
         */
    }

    @Test
    void displayAll() {
        /*
            Call the function to display all items in the list
            Set table variable equal to have all the items in the list
            Assert equals if the new table variable and global are the same, test passed.
         */
    }

    @Test
    void displayComplete() {
        /*
            Call the function to display all the complete items in the list
            Set table variable equal to have all the complete items in the list
            Assert equals if the new table variable and global are the same, test passed.
         */
    }

    @Test
    void displayIncomplete() {
        /*
            Call the function to display all the incomplete items in the list
            Set table variable equal to have all the incomplete items in the list
            Assert equals if the new table variable and global are the same, test passed.
         */
    }

    @Test
    void markComplete() {
        /*
            Call the function to mark a selected item that is originally incomplete to complete
            Set a new item variable equal to the item selected except have it as complete
            Assert equals if the new item and selected item are the same, test passed.
         */
    }

    @Test
    void saveList() {
        /*
            Call the function to save all the items in a list
            Set a file to read what it should display if all the items were saved
            Assert equals if the file that is saved is equal to the new file, test passed.
         */
    }

    @Test
    void saveLists() {
        /*
            Call the function to save all the lists available
            Set a file to read what it should display if all the lists were saved
            Assert equals iif the file that is saved is equal to the new file, test passed.
         */
    }

    @Test
    void loadList() {
        /*
            Call the function to load a set of items into a list
            Set a table variable to read the current list plus all the added items.
            Assert equals if the new table variable and global one are equal, test passed.
         */
    }

    @Test
    void loadLists() {
        /*
            Call the function to load a set of lists into the table
            Set a table variable to read the current lists plus all the added lists
            Assert equals if the new table variable and global one are equal, test passed.
         */
    }
}