package com.company;

import com.sun.xml.internal.bind.v2.runtime.output.FastInfosetStreamWriterOutput;

public class Main {

    public static void main(String[] args) {
	String hello = "Hello OOP";
        System.out.println(hello);

        // OOP это тип данных - Классы
        int a = 5;
        Integer b = 6; //Класс - больше возможностей

        // Нам необходимо тип данных "a" переделать в тип данных "double"

        double c = (double) a;
        System.out.println("a = " + a);
        System.out.println("c = " + c);

      Double d = b.doubleValue();

      String number = "1234";
      Integer numberInt = Integer.valueOf(number);

      // Найти площядь прямоугольника длинной 3см и шириной 4см !

        int lenght = 3;
        int widht = 4;
        int area = lenght * widht;
        System.out.println(area);

        Rectangle r1 = new Rectangle(3, 4);
            int areaR1 = r1.getArea();
        System.out.println(areaR1);


    }
}
