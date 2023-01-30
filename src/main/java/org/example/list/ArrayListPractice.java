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
    static List<Integer> numeros=new ArrayList<>();
    static List<Producto> listaDeMercado=new ArrayList<>();
    public static void ejecutarUno(){
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
        System.out.print(frutas);
        System.out.println("\n");
    }
    public static void ejecutarDos(){
        for(int i=0;i<15;i++)
            Agregar.agregar(numeros,RandomNumber.random());
        System.out.println(numeros);
        System.out.println("La suma de los números es: "+Sumar.sumar(numeros));
        System.out.println("La resta de los números es: "+Restar.restar(numeros));
        System.out.println("La multiplicación de los números: "+Multiplicar.multiplicar(numeros));
        System.out.println("\n");
    }
    public static void ejecutarTres(){
        Agregar.agregar(listaDeMercado,new Producto("Arroz",false));
        Agregar.agregar(listaDeMercado,new Producto("Papas",false));
        Agregar.agregar(listaDeMercado,new Producto("Yogurt",false));
        Agregar.agregar(listaDeMercado,new Producto("Leche",false));
        Agregar.agregar(listaDeMercado,new Producto("Pollo",false));
        for (Producto producto:listaDeMercado)
            System.out.println(producto.getNombre()+" ---> "+(producto.isComprado()?"Comprado":"No comprado"));
        for (int i=0;i<3;i++)
            Comprar.comprar(listaDeMercado,listaDeMercado.get(i));
        System.out.println();
        for (Producto producto:listaDeMercado)
            System.out.println(producto.getNombre()+" ---> "+(producto.isComprado()?"Comprado":"No comprado"));
    }
}
