package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ruleta  R1 = new Ruleta();

        R1.getNombre();
        int opcion;

        do {
            System.out.println("\nMenú de Ruleta");
            System.out.println("1. Ingresar nombre");
            System.out.println("2. Jugar");
            System.out.println("3. Reiniciar ruleta");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    R1.setNombre(nombre);
                    R1.getListParticipantes().add(nombre);
                    break;

                case 2:
                    if (R1.getNombre() == null) {
                        System.out.println("Debe ingresar un nombre antes de jugar.");
                    } else {
                        if (R1.disparar()) {
                            System.out.println("Juego terminado.");
                            return;
                        }
                    }
                    break;

                case 3:
                    R1.nuevoAleatorio();
                    System.out.println("Ruleta reiniciada.");
                    break;

                case 4:
                    System.out.println("Saliendo del juego...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
