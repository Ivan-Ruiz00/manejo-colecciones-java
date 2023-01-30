package org.example.list;
import java.util.ArrayList;
import java.util.List;
public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * mínimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     */
    static List<Fruta> frutas=new ArrayList<>();
    public static void ejecutar(){
        Vacio.esVacio(frutas);
        System.out.println();
        Agregar.agregar(frutas,"Arándanos");
        Agregar.agregar(frutas,"Manzana");
        Agregar.agregar(frutas,"Fresas");
        Vacio.esVacio(frutas);
        System.out.println("el tamaño de la lista es: "+frutas.size());
        System.out.println(frutas);
        Reemplazar.reemplazar(frutas,frutas.indexOf("Arándanos"),"Sandías");
        System.out.println(frutas);
        Pertenece.contiene(frutas,"Sandías");
        Remover.remover(frutas,"Fresas");
        System.out.print(frutas);
    }
}
