
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Printer<String> printer = new Printer<>("Hello, World!");
        printer.print();

        Printer<Integer> printer2 = new Printer<>(42);
        printer2.print();

        Printer<Double> printer3 = new Printer<>(3.14);
        printer3.print();

        Gato gato = new Gato("Garfield", 3);
        Printer<Gato> printer4 = new Printer<>(gato);
        printer4.print();

        List<String> lista = new ArrayList<>();
        lista.add("Hello");
        lista.add("World");
        lista.add("!");
        printer.printLista(lista);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        printer2.printLista(lista2);

        List<Gato> lista3 = new ArrayList<>();
        lista3.add(new Gato("Garfield", 3));
        lista3.add(new Gato("Tom", 5));
        lista3.add(new Gato("Felix", 2));
        printer4.printLista(lista3);

    }

    public <T, U, V> void multipleGenericTypes(T algumaCoisa, 
        U outraCoisa, V outraCoisaAinda) {

        System.out.println(algumaCoisa);
        System.out.println(outraCoisa);
        System.out.println(outraCoisaAinda);
    }

}
