package com.company;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String input = "EbAAdbBEaBaaBBdAccbeebaec";

        HashMap<String, Integer> map = new HashMap<>();

        int playerA = 0;
        int playerB = 0;
        int playerC = 0;
        int playerD = 0;
        int playerE = 0;

        int num = 0;
        while(num!=input.length()){
            switch(input.charAt(num)){
                case 'A':
                    playerA++;
                    break;
                case 'a':
                    playerA--;
                    break;
                case 'B':
                    playerB++;
                    break;
                case 'b':
                    playerB--;
                    break;
                case 'C':
                    playerC++;
                    break;
                case 'c':
                    playerC--;
                    break;
                case 'D':
                    playerD++;
                    break;
                case 'd':
                    playerD--;
                    break;
                case 'E':
                    playerE++;
                    break;
                case 'e':
                    playerE--;
                    break;
            }

            num++;
        }


        System.out.println("HelloWorld!!!!");
    }
}
