package com.company;

public class Funciones
{
    public static void main(String[] args) {
        holaMundo();
        holaMundo();
        holaMundo("Alan");
        holaMundo("Ivan");

        String hola = devolverHola();
        System.out.println(hola);
    }
    public static void holaMundo() {
        System.out.println("Hola mundo desde un metodo");
    }
    private static void holaMundo(String name)
    {
        System.out.println("Hola "+ name);
    }
    private static void holaMundo(Integer number)
    {
        System.out.println("Hola "+ number);
    }
    private static void holaMundo(String name, String surname)
    {
        System.out.println("Hola "+ name + " "+ surname );
    }
    private static String devolverHola()
    {
        return "Hola";
    }
    private static int sum(int num1, int num2)
    {
        return num1 + num2;
    }

}
