package com.dbc.moduloUm;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main{
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = dtf.format(LocalDateTime.now());
        System.out.println("yyyy/MM/dd HH:mm:ss-> " + data);
    }
}