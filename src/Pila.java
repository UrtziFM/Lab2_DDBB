public class Pila {
    //Atributos
    private Node top; //Ultimo nodo que se ha incluido
    private int size;
    //Constructores
    public String PilaDinamica() {
        top = null; //No hay elementos
        this.size = 0;
        return null;
    }
    // Pila vacia
    public boolean isEmpty() {
        return top == null;
    }
    // Tamaño de la pila
    public int size() {
        return this.size;
    }
    // Devuelve el elemento que esta más arriba en la pila
    public String top() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getCountry();
        }
    }
    // Saca y devuelve el elemento que mas arriba esta en la pila
    public String pop() {
        if (isEmpty()) {
            return null;
        } else {
            String country = top.getCountry();
            Node aux = top.getNextElement();
            top = null; //marco para borrar
            top = aux; //actualizo el top
            this.size--;
            return country;
        }
    }
    //Mete un elemento a la pila
    public String push(String country) {
 
        Node aux = new Node(country);
        top = aux; //actualizo el top
        this.size++;
        return aux.getCountry();
    }
    // Devuelve el estado de la pila
    public String toString() {
 
        if (isEmpty()) {
            return "La pila esta vacia";
        } else {
 
            String resultado = "";
            Node aux = top;
            //Recorro la pila
            while (aux != null) {
                resultado += aux.toString();
                aux = aux.getNextElement();
            }
 
            System.out.println(resultado);
            return resultado;
 
        }
 
    }
 
}