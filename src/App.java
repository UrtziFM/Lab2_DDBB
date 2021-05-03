import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First step: Pila exercise");
        Pila pilaDinamica = new Pila();
        pilaDinamica.push("Spain");
        pilaDinamica.push("France");
        pilaDinamica.push("Italy");
        pilaDinamica.printPila();
        pilaDinamica.pop();
        pilaDinamica.countPila();
        pilaDinamica.top();
        pilaDinamica.printPila(); // to validate a country in the Pila 
        pilaDinamica.validateCountry();
        System.out.println("Second step: Queue exercise");
        Queue <String> linkedList1 = new LinkedList <String>(); // Using directly java package
        linkedList1.add("China"); // adding method in Queue
        linkedList1.add("Korea");
        linkedList1.add("Japan");
        System.out.println(linkedList1);
        System.out.println(linkedList1.peek()); // showing first element in Queue
        linkedList1.poll(); // extracting method in Queue
        System.out.println(linkedList1);
    }
}
