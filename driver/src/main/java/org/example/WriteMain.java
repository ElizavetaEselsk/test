package org.example;


import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public class WriteMain {
    public static void main(String[] args) throws IOException {

        Serializer.serializer(Generator.randomGenerations(10));

    }

}