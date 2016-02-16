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

    public int remove(int p) {

        return 0;

    }

    public int count() {

        return 0;

    }

}
