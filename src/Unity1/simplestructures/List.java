package Unity1.simplestructures;

/**
 *
 * @author Darcks OMega
 */
public class List {

    private Node head;

    public List() {

        head = null;

    }

    public void add(int d) {

        Node n = new Node(d);
        if (head == null) {

            head = n;

        } else {

            Node aux = head;
            while (aux.Next != null) {

                aux = aux.Next;

            }

            aux.Next = n;

        }

    }

    public void print() { //Codigo para imprimir datos "16/02/2016

        Node aux = head;
        while (aux != null) {

            System.out.println("  " + aux.data);
            aux = aux.Next;

        }
        System.out.println();

    }

    public int remove(int i) {

        if (head == null) {
        }
        if (i == 0) {
            head = head.Next;
        }
        Node aux = head, p = null;
        int Counter = 0;
        for (; Counter < i && aux != null; Counter++) {
            p = aux;
            aux = aux.Next;
        }
        if (aux != null) {
            p.Next = aux.Next;
        }
        return aux.data;

    }

    public int count() {

        Node aux = head;
        int count = 0;
        while (aux != null) {

            count++;
            aux = aux.Next;

        }
        return count;

    }

    public int PrintFirstElement(int d) { //Metodo 8

        Node aux = head;
        if (aux == null) {
            System.out.println(" -1 ");
        }
        System.out.println(aux.data);
        return -1;
    }

    public void PrintLastElement() { //Metodo 9

        Node aux = head;

        if (aux != null) {
            while (aux.Next != null) {
                aux = aux.Next;
            }
            System.out.print(aux.data);
        } else {
            System.out.println(" -1 ");
        }

    }

    public void RemoveFirstElement() {

        if (head == null) {
            return;
        }
        head = head.Next;
    }

    public void RemoveLastElement() {

        if (head == null) {
            return;
        }
        Node aux = head, p = null;
        p = aux;
        while (aux.Next != null) {
            aux = aux.Next;
        }
        p.Next = aux.Next;
        
            
    if( head.Next != null){
    head = null;
    }

    }
}
