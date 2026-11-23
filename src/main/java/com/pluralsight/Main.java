package com.pluralsight;


public class Main {
    public static void main(String[] args) {
        try {
            FixedList<Integer> numbers = new FixedList<>(3);
            numbers.add(10);
            numbers.add(3);
            numbers.add(92);
            numbers.add(93); // this line should fai
            System.out.println(numbers.getItems().size());
        } catch (Exception e){
            System.out.println("There was a problem. The detail are  ");
            System.out.println( e.getMessage());
            System.out.println(e);
        }
    }
}