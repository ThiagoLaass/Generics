import java.io.Serializable;
import java.util.List;

public class  Printer <T>{
    private T algumaCoisa;

    public Printer(T algumaCoisa) {
        this.algumaCoisa = algumaCoisa;
    }

    public void print() {
        System.out.println(algumaCoisa);
    }

    public void printLista(List<?> algumaCoisa){
        for (Object o : algumaCoisa) {
            System.out.println(o);
        }
    }

    public <U extends Animal & Serializable> void metodoGenerico(U coisaGenerica){
        System.out.println(coisaGenerica);
    }

    public <U extends Animal> void metodoGenerico2(U coisaGenerica){
        System.out.println(coisaGenerica);
    }

    public <U> void metodoGenerico3(U coisaGenerica){
        System.out.println(coisaGenerica);
    }


}




