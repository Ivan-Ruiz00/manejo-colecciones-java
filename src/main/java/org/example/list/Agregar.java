package org.example.list;
import java.util.List;
public class Agregar {
    public static void agregar(List lista,Object objeto){
        lista.add(objeto);
    }
}
class Remover{
    public static void remover(List lista,Object objeto){
        lista.remove(objeto);
    }
}
class Vacio{
    public static void esVacio(List lista){
        if(lista.isEmpty())
            System.out.print("La lista está vacía, ");
        else
            System.out.print("La lista no está vacía, ");
    }
}
class Pertenece{
    public static void contiene(List lista,String fruta){
        if(lista.contains(fruta))
            System.out.println("La lista contiene "+fruta.toLowerCase());
        else
            System.out.println("La lista no contiene "+fruta.toLowerCase());
    }
}
class Reemplazar{
    public static void reemplazar(List lista,int indice,Object objeto){
        lista.set(indice,objeto);
    }
}
