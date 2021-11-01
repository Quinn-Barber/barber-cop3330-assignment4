package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Quinn Barber
 */

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class FXMLController {

    int count = 0;
    ArrayList<ToDoList> Lists = new ArrayList<>(100);

    @FXML
    private Button addButton;

    @FXML
    private TextField duedateText;

    @FXML
    private TextField descriptionText;

    @FXML
    private TableView<ToDoList> liststab;

    @FXML
    private TextField listnameText;

    @FXML
    private TableColumn<ToDoList, String> listnameColumn;

    @FXML
    private TableColumn<Item, String> descriptionColumn;

    @FXML
    private TableColumn<Item, String> duedateColumn;

    @FXML
    private TableColumn<Item, String> statusColumn;

    @FXML
    private TableView<Item> tab;

    @FXML
    private Label nameLabel;

    @FXML
    ArrayList<Item> addItems(ActionEvent event) {
        /*
        Used in GUI.fxml on Add button
        Add the description and due date entered in the text boxes
        clear the text boxes
        add the status of "Incomplete"
        clear the text boxes
         */
        ArrayList<Item> items = new ArrayList<>();
        return items;
    }

    @FXML
    ArrayList<ToDoList> addList(ActionEvent event){
        /*
        Used in ToDoLists.fxml on Add button
        Add to table the name that is in the text box
        Clear the textbox
         */
        return Lists;
    }

    @FXML
    ArrayList<ToDoList> openList(ActionEvent event) throws IOException {
        /*
        Used in ToDoLists.fxml on Open button
        If no list is selected in the table
        Load the error.fxml file and return
        Otherwise open the GUI.fxml file and have the todolist label to be named the list name selected
        load all the items of the selected list into the table in GUI.fxml
         */
        return Lists;
    }



    @FXML
    ArrayList<ToDoList> editList(ActionEvent event)
    {
        /*
            Used in ToDoLists.fxml on Edit button
            If no list selected in table open Error.fxml and return
            Otherwise make the selected list name editable
            Change Edit button to read Save
            Once Save is clicked it is no longer editable
         */
        return Lists;
    }

    @FXML
    ArrayList<ToDoList> delList(ActionEvent event)
    {
        /*
            Used in ToDoLists.fxml on Remove button
            Find selected list
            Remove it from the table
            Remove it from the arraylist of todolists
         */
        return Lists;
    }

    ArrayList<Item> delItem(Item item)
    {
        /*
        Used in GUI.fxml on Delete button
        Find selected item
        Remove it from the table
        Remove it from the arraylist of items in list that is open
         */
        ArrayList<Item> items = new ArrayList<>();
        return items;
    }

    @FXML
    ArrayList<Item> displayAll(ActionEvent event)
    {
        /*
        Used in GUI.fxml on Show All button
        Deletes all items in table
        Iterates through the entire arraylist of items in todolist open and adds to table
         */
        ArrayList<Item> items = new ArrayList<>();
        return items;
    }

    @FXML
    ArrayList<ToDoList> displayComplete(ActionEvent event)
    {
        /*
        Used in GUI.fxml on Show Complete button
        Deletes all items in a table
        Iterates through the entire arraylist of items in todolist open and adds ones marked "Complete" to table
         */
        return Lists;
    }

    @FXML
    ArrayList<ToDoList> displayIncomplete(ActionEvent event)
    {
        /*
        Used in GUI.fxml on Show Complete button
        Deletes all items in a table
        Iterates through the entire arraylist of items in todolist open and adds ones marked "Incomplete" to table
         */
        return Lists;
    }

    @FXML
    Item markComplete(ActionEvent event)
    {
        /*
        Used in GUI.fxml on Mark Complete button
        If no item is selected open Error.fxml and return
        Otherwise set selected item complete status to "Complete"
         */
        Item item = new Item("", "", "");
        return item;
    }

    @FXML
    ArrayList<ToDoList> saveList(ActionEvent event)
    {
        /*
            Used in GUI.fxml in File menu on Save As...
            loads all the items in the open list onto a file
            saves file onto users computer titled as the list title
         */
        return Lists;
    }

    @FXML
    ArrayList<ToDoList> saveLists(ActionEvent event)
    {
        /*
            Used in ToDoLists.fxml in File menu on Save All
            loads all the lists one by one in a file followed by their subsequent items
            saves file onto the user's computer titled as "ToDoLists"
         */
        return Lists;
    }

    @FXML
    ArrayList<ToDoList> loadList(ActionEvent event)
    {
        /*
             Used in GUI.fxml in File menu on Open
             Opens file selected and adds all the items in the file to table if they are in correct format
             being first a number, then followed with that numbers amount in lines with item description, duedate, and Complete or Incomplete
         */
        return Lists;
    }

    @FXML
    ArrayList<ToDoList> loadLists(ActionEvent event)
    {
        /*
            Used in ToDoLists.fxml in File menu on Open...
            Opens file selected and adds each todolist to the table while also saving their followed items into the program to be opened later
            Only if it is in the correct format, being first a number followed by that numbers amount in lists which have a number after their name
            which follows that number in amount of items in said list
         */
        return Lists;
    }


}

