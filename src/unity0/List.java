package unity0;

/**
 *
 * @author Darcks OMega
 */
public class List {

    private int data[];
    private int top;

    public void List() {

        data = new int[100];
        top = 0;

    }

    public void add(int d, int p) {

        data[p] = d;
        top++;

    }

    public int remove( int p) {

        int d = data [p];
        
        return 0;

    }

    public void print() {

        System.out.println();
        
    }

}
