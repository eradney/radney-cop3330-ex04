/**
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        String noun, verb, adj, adv;
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        noun = scnr.next();

        System.out.print("Enter a verb: ");
        verb = scnr.next();

        System.out.print("Enter an adjective: ");
        adj = scnr.next();

        System.out.print("Enter an adverb: ");
        adv = scnr.next();

        System.out.println("Your " + adj + " " + noun + " looks like it really needs to " + verb + " " + adv + ". Better get on it!");
    }
}
