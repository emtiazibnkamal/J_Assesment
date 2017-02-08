package com.company;

import java.util.ArrayList;
public class Main {

    public static void main
(String[] args) {
	// write your code here
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al: " + al.size());

        // add elements to the array list
        al.add("Nobo");
        al.add("Ovi");
        al.add("Asfak");
        al.add(" Raju");
        al.add("Prince");
        al.add(1, "Bacchu");
        System.out.println("Size of al after additions: " + al.size());

        // display the array list
        System.out.println("Contents of al: " + al);

        // Remove elements from the array list
        al.remove("prince");
        al.remove(2);
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
    }

}
