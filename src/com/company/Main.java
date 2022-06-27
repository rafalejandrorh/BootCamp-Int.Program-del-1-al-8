package com.company;

public class  Main {

    public static void main(String[] args){

        int suma;
        int resta;
        int multiplicacion;
        int division;
        int a = 4;
        int b = 2;
        int contador = 10;
        int contador2 = 2;
        int contador3;
        int[] valores = {10, 20, 30, 40, 50};

        String estacion = "invierno";
        String condicional;
        String dia = "Sabado";
        String nombre = "Rafael";

        //Introducción del código
        System.out.println("Hola mundo, esto es una prueba. Mi nombre es: "+nombre);

        //Suma de dos números
        suma = suma(a, b);
        System.out.println("La suma de a + b es igual a: "+suma);

        //Resta de dos números
        resta = resta(a, b);
        System.out.println("La resta de a + b es igual a: "+resta);

        //División de dos números
        division = division(a, b);
        System.out.println("La division de a + b es igual a: "+division);

        //Multiplicación de dos números
        multiplicacion = multiplicacion(a, b);
        System.out.println("La multiplicacion de a + b es igual a: "+multiplicacion);

        //Aumento de la variable de piernas
        Piernas mipie = new Piernas();
        mipie.Quitarpie(); mipie.Quitarpie();
        System.out.println("El aumento de la variable de Piernas es igual a: "+mipie.pies);

        //Condicional de estaciones del clima
        condicional = condicional(estacion);
        System.out.println("La estacion actual es: "+condicional);

        //Bucle While directamente en la función principal y Arroja un resultado distinto a cuando se hace en otra función
        //Se suele utilizar para comparaciones cierto o falso
        System.out.println("El contador es igual a: "+contador+" Si es mayor que cero, restara dos numeros hasta llegar a 0");
        while(contador > 0){
            //Aquí restará dos numeros hasta que no haya más nada que restar, es decir llegue 0
            System.out.println(contador);
            contador = contador-2;
        }

        //Bucle Do While. La diferencia con While es que este primero ejecuta y luego comprueba la condición
        System.out.println("El contador es igual a: "+contador2+" Se restara dos numeros y se seguira ejecutando si el valor es mayor que 2");
        do {
            System.out.println(contador2);
            contador3 = contador2-2;
        } while (contador3 > 2);

        //For. Bucle más usado para trabajar con listas, conexiones, arrays, etc. La acción se ejecuta solamente cuando
        //se ha terminado de ejecutarse lo que hay en el cuerpo del For. Se suele utilizar para recorrer arrays
        System.out.println("El contador es igual a: 1. Si el contador es menor o igual que 10, se sumará hasta llegar a 10");
        for (int contador4 = 1; contador4 <=10; contador4 = contador4+1){
            System.out.println(contador4);
        }

        //For recorrriendo un array
        System.out.println("Este for es para recorrer arrays:");
        for (int valore : valores) { // Lo expreso es igual a esto: int i = 0; i < valores.length; i++
            System.out.println(valore);
        }

        //Switch Case
        System.out.println("Este es un Switch Case simplificado en Java");
        switch (estacion) {
            case "verano" -> System.out.println("La estacion actual es: Verano");
            case "invierno" -> System.out.println("La estacion actual es: Invierno");
            case "otoño" -> System.out.println("La estacion actual es: Otoño");
            case "primavera" -> System.out.println("La estacion actual es: Primavera");
            default -> System.out.println("Esta es otra estacion: " + estacion);
        }
            // Lo expreso es igual a esto:
        System.out.println("Este es un Switch Case comun en varios Lenguajes");
        switch (estacion) {
             case "verano":
                System.out.println("La estacion actual es: Verano");
                break;
            case "invierno":
                System.out.println("La estacion actual es: Invierno");
                break;
            case "otoño":
                System.out.println("La estacion actual es: Otoño");
                break;
            case "primavera":
                System.out.println("La estacion actual es: Primavera");
                break;
            default:
                System.out.println("Esta es otra estacion: "+estacion);
        }

        System.out.println("Este es un Switch Case simplificado en Java");
        switch (dia) {
            case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" ->
                    System.out.println("Hoy es: " + dia + ". Dia Laborable.");
            case "Sabado", "Domingo" ->
                    System.out.println("Hoy es:" + dia + ". Dia NO Laborable");
        }

        coche Coche = new coche();
        System.out.printf("Puertas: %d\n", Coche.numerodePuertas);
        System.out.printf("La Velocidad Maxima del Coche es: %d\n", Coche.VelocidadMaxima);
        System.out.println("La velocidad del Coche antes de acelerar es: "+Coche.velocidadActual);
        Coche.acelerar();
        System.out.println("La velocidad del Coche despues de acelerar es: "+Coche.velocidadActual);
        Coche.desacelerar();

        System.out.println("Instancia de Coche sin enviar variables");
        System.out.println(Coche.numerodePuertas);
        System.out.println(Coche.velocidadActual);
        System.out.println(Coche.VelocidadMaxima);

        System.out.println("Instancia de Coche enviando variables");
        coche Coche2 = new coche(2, 90);
        System.out.println(Coche2.numerodePuertas);
        System.out.println(Coche2.velocidadActual);
        System.out.println(Coche2.VelocidadMaxima);

    }

    // Función de Suma
    public static int suma(int a, int b){
        return a + b;
    }

    // Función de Resta
    public static int resta(int a, int b){
        return a - b;
    }

    //Función de multiplicación
    public static int multiplicacion(int a, int b){
        return a * b;
    }

    //Función de División
    public static int division(int a, int b){
        return a / b;
    }

    //Función con Condicional If, else-if, else
    public static String condicional(String estacion) {

        if (estacion == "primavera") {
            return "Primavera";
        } else if (estacion == "verano") {
            return "Verano";
        } else {
            return "Otra Estacion";
        }

    }

    //Función de Aumento de variables
    static class Piernas {
        public int pies = 0;

        public void Quitarpie() {
            this.pies++;
        }
    }

}

    class coche {
        int numerodePuertas;
        int VelocidadMaxima;
        float velocidadActual;

        public coche(int puertas, int velocidad){
            numerodePuertas = puertas;
            VelocidadMaxima = velocidad;
            System.out.println("Estoy en el Constructor sin Parametros");
        }

        public coche(){
            numerodePuertas = 4;
            VelocidadMaxima = 180;
            System.out.println("Estoy en el Constructor con Parametros");
        }

        public void acelerar() {
            velocidadActual += 15;
        }
        public void desacelerar() {

        }

    }

    class Vehiculo
