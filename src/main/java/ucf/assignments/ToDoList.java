package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Quinn Barber
 */

import java.util.ArrayList;

public class ToDoList {
    private String title;
    private int numitems = 0;
    private ArrayList<Item> item = new ArrayList<>(100);

    public ToDoList(String title) {
        this.title = title;
    }

    public void EditToDoList(Item item) {
        this.item.add(item);
        this.numitems++;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

}
