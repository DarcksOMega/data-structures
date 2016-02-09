package unity0;

/**
 *
 * @author Darcks OMega
 */
public class Test {
    
    public static void main (String [] args){
        
        Stack s = new Stack();
        s.add( 10 );
        s.add( 20 );
        s.add( 30 );
        
        s.print( ); // Imprimira estos números: 10, 20, 30
        
        s.remove(); /*Como es una pila, se remueve el ultimo que fue adicionado, en este caso, el
        nùmero 30 */
        
        s.print(); /* Aquí imprime los 2 primeros números, que son el 10 y el 20*/
        
        for (int i=2; i<20; i+=2){ //Este es un incremento de 2 en 2
            s.add(i);
        }
        
        s.print(); //Se imprimiran los elementos adicionales
        
    }
    
}