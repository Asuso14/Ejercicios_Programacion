package org.example;
import java.util.Scanner;

public class Practica1_T2 {
    public void P1_T2(){
        Scanner entry = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
        String birth_date = entry.nextLine();
        int character_num = birth_date.length();

        String first_bar = birth_date.substring(2,3);
        String second_bar = birth_date.substring(5,6);

        if (character_num == 10){
                int value = 0;
                int day = 0;
                int month = 0;
                int year = 0;
                if (!first_bar.equals("/") || !second_bar.equals("/")){
                    System.out.println("Introduce el formato de fecha correcto");
                    value = 1;
                }
                try{
                    day = Integer.parseInt(birth_date.substring(0,2));
                    month = Integer.parseInt(birth_date.substring(3,5));
                    year = Integer.parseInt(birth_date.substring(6,10));
                    if (day <= 0 || month <= 0 || year <= 0){
                        System.out.println("Has introducido un numero negativo o 0");
                        value = 1;
                    }
                }catch (NumberFormatException error){
                    System.out.println("Has introducido letras en vez de números o numeros negativos. ");
                    value = 1;
                }
                if (value == 0){
                    System.out.println(birth_date);
                    int calc_date = (day + month + year);

                    System.out.println(day + "+" + month + "+" + year + " = " + calc_date);
                    String C_calc_date = Integer.toString(calc_date);

                    int  num_1 = Integer.parseInt(C_calc_date.substring(0,1));
                    int num_2 = Integer.parseInt(C_calc_date.substring(1,2));
                    int  num_3 = Integer.parseInt(C_calc_date.substring(2,3));
                    int  num_4 = Integer.parseInt(C_calc_date.substring(3,4));
                    int special_day = (num_1 + num_2 + num_3 + num_4);

                    System.out.println(num_1 + "+" + num_2 + "+" + num_3 + "+" + num_4 + " = " + special_day);
                    System.out.println("Tu número de la suerte es " + special_day);
                }
        }else {
                System.out.println("Introduce la fecha con el formato correcto.");
        }
    }
}
