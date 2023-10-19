package org.example;

import java.util.List;

public class Almacenamiento <T>{
    private T t;
    List<T> almacenamiento;

    public Almacenamiento(List<T> almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public void agregar(T t){
        almacenamiento.add(t);
    }
    public T elementoPorIndice(int indice){
        return almacenamiento.get(indice);
    }
    public boolean existe(T t){
        return almacenamiento.contains(t);
    }
    public int contar(T t){
        int contador = 0;
        for (T objeto: almacenamiento
        ) {
            if(objeto.equals(t)){
                contador++;
            }
        }
        return  contador;
    }
}
