package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Quinn Barber
 */

public class Item {
    private String complete;
    private String description;
    private String duedate;

    public Item(String description, String duedate, String complete) {
        this.description = description;
        this.duedate = duedate;
        this.complete = complete;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    public String getDescription() {
        return description;
    }

    public String getDuedate() {
        return duedate;
    }

    public String getComplete() {
        return complete;
    }

}
