package com.company;

import java.util.Scanner;

public class Student {

    private String indexNumber = "";
    private String surName = "";
    private String gender = "";
    private String programme = "";
    private int level = 0;
    private String otherName = "";

    Student() {
        //scanner
        Scanner scanner = new Scanner(System.in);

        //surname
        System.out.print("Enter Surname :");
        this.surName = scanner.next();

        //index number
        System.out.print("Enter Index Number :");
        this.indexNumber = scanner.next();

        //other name
        System.out.print("Enter Other Name :");
        this.otherName = scanner.next();

        //gender
        System.out.print("Enter Gender [Male,Female]:");
        this.gender = scanner.next();

        //programme
        System.out.print("Enter Programme :");
        this.programme = scanner.next();

        //level
        System.out.print("And Level :");
        this.level = scanner.nextInt();
    }

    public void format() {
        System.out.printf("Your Student ID : %s\n Your Surname: %s\n Your Gender : %s\n Your  Other Name: %s\n Programme: %s\n Level : %d", this.indexNumber, this.surName, this.gender, this.otherName, this.programme, this.level).println();
    }
}

