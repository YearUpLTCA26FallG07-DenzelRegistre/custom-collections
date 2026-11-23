package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList( int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }
     public void add(List<T> item){
        if (items.size() < maxSize){
            items.add((T) item);
        } else if (items.size() >= maxSize){
            System.out.println("List is full");
        }

     }

    public List<T> getItems(){
        return items;
    }


}
