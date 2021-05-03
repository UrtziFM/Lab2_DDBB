public class Node {
 
    //Atributes
    private String country;
    private Node next; //Pointer to next element
    //Constructor
    public Node(String country, Node next) {
        this.country = country;
        this.next = next;
    }
    //Methods
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public String showPila() {
        return country ;
    }
 
}