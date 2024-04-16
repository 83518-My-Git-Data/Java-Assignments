package com.sunbeam;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Test {

   

    public static void main(String[] args) {
        int choice;
        BookDetails b1 = new BookDetails("XA12", Category.Mystery,20, "Harish", 14);

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter Your Choice");
            System.out.println("1. Accept Books");
            System.out.println("2. Display Books");
            System.out.println("3. Sort the Books as per Category");
            System.out.println("4. Sort the Books as per Author");
            System.out.println("5. Find Book by ISBN");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    b1.addBook();
                    break;
                case 2:
                    b1.displayBook();
                    break;
                case 3:
                    b1.sortBookByCategory();
                    break;
                case 4:
                    b1.sortByAuthorName();
                    break;
                case 5:
                    b1.findById();
                    break;
            }

        } while (choice != 0);
    }

   
   
   
    
    }

