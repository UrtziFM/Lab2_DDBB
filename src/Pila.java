import javax.swing.JOptionPane;

public class Pila {

    //Atributes
    private Node top; //Last node included
    private int size = 0;
    
    public boolean isEmpty() { // method to know if is empty
        return top == null;
    }
    
    public String pop() { // method to extract last element
        if (isEmpty()) {
            return null;
        } else {
            String country = top.getCountry();
            Node aux = top.getNext();
            top = null; 
            top = aux; 
            this.size--; // counter
            return country;
        }
    }
    
    public String push(String country) { // method to include a new element 
        Node aux = new Node(country, top);
        top = aux; 
        this.size++; //counter
        return aux.getCountry();
    }
  
    public String top() { // method to know last element included
        if (isEmpty()) {
            System.out.printf("\n It is empty");
        } else {
            System.out.printf("\n %s \n", top.getCountry());
        }
        return null;
    }
    public void printPila(){ //method to iterate in the list and print it
        for (Node i = top; i != null; i = i.getNext()) {
            System.out.printf("\n %s ", i.showPila());
        }
        System.out.println();
    }
    public void countPila() {
        System.out.println("\n The size of the Pila is " + size);
    }
    public void validateCountry(){ // method to validate if a country is on the list
        String texto =JOptionPane.showInputDialog("What country do you want to validate?");
        for (Node i = top; i != null; i = i.getNext()) {
            String countryName = i.showPila();
            if(countryName.equals(texto)){
                System.out.printf("This country is on the list \n");
            }
        }
        System.out.println();
    }
}
