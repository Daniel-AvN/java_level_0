import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        // ArrayList array1 = new ArrayList();

        ArrayList<String> nombres= new ArrayList<String>();

        nombres.add("Pepe");
        nombres.add("Juan");
        nombres.add("Dani");
        nombres.add("Fabiola");
        nombres.remove("Juan");
        nombres.forEach(nombre -> System.out.print(nombre+",") );

        System.out.println("\ntamaño: "+nombres.size());

        nombres.clear();
        nombres.forEach(nombre -> System.out.print(nombre+", ") );
        System.out.println("-----------------------------------------");

        ArrayList<Integer> numeros= new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(8);
        numeros.add(23);
        numeros.add(4);
        //  Ordenar el ArrayList de mayor a menor usando un comparador
        System.out.println("\norden ascendente:");
        numeros.sort( (n1, n2) -> n1-n2);

        numeros.forEach(num -> System.out.print(num+" "));
        System.out.println("orden descendente");
        numeros.sort( (n1, n2) -> n2-n1);
        numeros.forEach(num -> System.out.print(num+" "));
        
        System.out.println("\nn[0]:"+numeros.get(0));
    }
}

