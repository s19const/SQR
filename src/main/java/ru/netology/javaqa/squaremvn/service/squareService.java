package ru.netology.javaqa.squaremvn.service;

public class squareService {

    public int calcSQR(int low, int high) {
        int x = 0;
        int i;
        for (i = 10; i <= 99; i++) {

            if (low <= i * i && i * i <= high) {
                x = x + 1;
                //System.out.println(x + ".  Число " + i);
             }
        }
        return x;
    }
}

