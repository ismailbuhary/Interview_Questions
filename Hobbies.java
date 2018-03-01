package com.company ;
import java.util.*;


public class Hobbies {

    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }

    public List<String> findHobbyists(String hobby) {


        List<String> lst =new ArrayList<String>();
        for (Map.Entry<String, String[]> entry : hobbies.entrySet()) {


         if(hobby.equals(entry.getValue()[2])) {
                lst.add(entry.getKey().toString());
                System.out.println("Name: " + entry.getKey() + " hobbies: " + entry.getValue()[2]);
          }

        }
        return lst;
    }

    public static void main(String[] args ) {
        Hobbies hobbies = new Hobbies();
        hobbies.add("John", "Piano", "Puzzles", "Yoga");
        hobbies.add("Adam", "Drama", "Fashion", "Pets");
        hobbies.add("Mary", "Magic", "Pets", "Reading");
        System.out.println(Arrays.toString(hobbies.findHobbyists("Pets").toArray()));
    }
}