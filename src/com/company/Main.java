package com.company;

import com.sun.xml.internal.bind.v2.runtime.output.FastInfosetStreamWriterOutput;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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

        Rectangle r2 = new Rectangle(7,12);
        int areaR2 = r2.getArea();
        System.out.println(areaR2 + " and " + areaR1);

        System.out.println(r2.getPerimetr());

        // Мы хотим в нашем 4 угольнике Rectangle R2 увеличить длинну на 3
        // Это делается с помощю Seterra !!!
        r2.setLength(10); // Добавили 3 - изменили 7 на 10
        System.out.println(r2.getArea());
        r2.setWidth(20); // добавили 8 - изменили 12 на 20
        System.out.println(r2.getWidth());


        System.out.println(r2.toString());

        Rectangle r3 = new Rectangle();
        r3.setWidth(5);
        r3.setLength(6);
        System.out.println(r3.toString());

        //Трапеция ДЗ

    }
}
