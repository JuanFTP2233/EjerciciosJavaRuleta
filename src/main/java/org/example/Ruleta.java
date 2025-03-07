package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ruleta {
    private String nombre;
    private int posicionBala;
    private int posicionRecamara;
    private List<String> listParticioantes = new ArrayList<>();
    private Random random = new Random();

    public Ruleta() {
        nuevoAleatorio();
    }

    public Ruleta(String nombre, List<String> listParticipantes) {
        this.nombre = nombre;
        this.listParticioantes = listParticipantes;
        nuevoAleatorio();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getListParticipantes() {
        return listParticioantes;
    }

    public void setListParticipantes(List<String> listParticipantes) {
        this.listParticioantes = listParticipantes;
    }

    public boolean disparar() {
        boolean disparo = posicionBala == posicionRecamara;
        if (disparo) {
            System.out.println("¡Bang! " + nombre + " ha muerto.");
        } else {
            System.out.println(nombre + " sigue vivo.");
            posicionRecamara = (posicionRecamara + 1) % 6;
        }
        return disparo;
    }

    public void nuevoAleatorio() {
        posicionBala = random.nextInt(6);
        posicionRecamara = random.nextInt(6);
        System.out.println("Nueva ruleta armada: Bala en " + posicionBala + " y recámara en " + posicionRecamara);
    }

    @Override
    public String toString() {
        return "Ruleta{" +
                "nombre='" + nombre + '\'' +
                ", posicionBala=" + posicionBala +
                ", posicionRecamara=" + posicionRecamara +
                ", listParticipantes=" + listParticioantes +
                '}';
    }
}
