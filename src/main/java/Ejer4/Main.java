package Ejer4;


import Ejer4.Modelo.Persona;

public class Main {
    public static void main(String[] args) {
//        Persona persona = new Persona();
//        persona.setNombre("Daniel");
//        persona.setApellido("Barrero");
//        System.out.println(persona);

//        Persona persona2 = Persona.builder().
//                                    nombre("Daniel").
//                                    apellido("Barrero").
//                                    build();
//
//        System.out.println(persona2);

        Persona persona3 = Persona.builder().nombre("Daniel").apellido("Barrero").build();
        persona3.toString();
        System.out.println(persona3.nulo(persona3));
    }
}