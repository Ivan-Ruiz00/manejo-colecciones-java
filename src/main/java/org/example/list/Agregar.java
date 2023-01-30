package org.example.list;
import java.util.List;
import java.util.Random;
public class Agregar{
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
class RandomNumber{
    static Random random=new Random();
    public static int random(){
        return random.nextInt(100)+1;
    }
}
class Sumar{
    public static int sumar(List lista){
        int suma=0;
        for(Object objeto:lista)
            suma+=(int)objeto;
        return suma;
    }
}
class Restar{
    public static int restar(List lista){
        int resta=(int)lista.get(0);
        for(int i=1;i<lista.size();i++)
            resta-=(int)lista.get(i);
        return resta;
    }
}
class Multiplicar{
    public static int multiplicar(List lista){
        int multiplicacion=-1;
        for(Object numero:lista)
            multiplicacion=multiplicacion*(int)numero;
        return multiplicacion;
    }
}
class Comprar{
    public static void comprar(List<Producto> lista,Producto producto){
        lista.get(lista.indexOf(producto)).setComprado(true);
    }
}
