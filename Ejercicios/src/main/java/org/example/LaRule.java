package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class LaRule {
    public static Scanner entry = new Scanner(System.in);
    public static Random random = new Random();
    public void activadad_ruleta(){

        String [] colors = {"RED","BLACK"};
        Integer [] numbers = new Integer[37];
        String [] elecction = {"par","inpar"};
        int user_num;
        String color;

        for (int i=0;i<numbers.length;i++){
            numbers[i] = i;
        }

        System.out.println("introduce un numero (0-36): ");
        user_num = entry.nextInt();

        boolean searched_num = Arrays.asList(numbers).contains(user_num);
        if (!searched_num){
            System.out.println("ERROR, el numero no es valido");
            return;
        }else{
            if (user_num!=0){
                System.out.println("Inserte un color");
                color = entry.next();
                boolean searched_color = Arrays.asList(colors).contains(color);

                if (!searched_color){
                    System.out.println("ERROR, el color no es valido. ");
                    return;
                }else {
                    System.out.println("Inserta par/impar: ");
                    String user_election = entry.next();
                    boolean searched_election = Arrays.asList(elecction).contains(user_election);

                    if(!searched_election){
                        System.out.println("ERROR, la opcion par/impar no es valida.");
                        return;
                    }
                }
            }
        }
        String ramdom_color = colors[random.nextInt(colors.length)];
        int ramdom_number = numbers[random.nextInt(numbers.length)];
        String ramdom_election = "";

        if (ramdom_number%2 == 0){
            ramdom_election = elecction[0];
        }else {
            ramdom_election = elecction[1];
        }
        System.out.println("Ha tocado... ");
        if (ramdom_number==user_num && ramdom_color.equalsIgnoreCase(color)){

        } else if () {

        } else if () {

        } else if () {

        } else if () {

        }else {

        }
    }
}