package Examen;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Darcks OMega
 */
public class List {
    
    public void insertZeros(){
        
        
        
    }
    
    public void removeMiddle(){
 
	Scanner scan;
	LinkedList<String> list;
	
	int n;
	
	void getVal() {
		
		scan = new Scanner(System.in);
		list = new LinkedList<String>();
		
		System.out.println("Linked List - Create & Insert");
		
		System.out.println("\nEnter 'n' value");
		n = scan.nextInt();
		
		System.out.println("Enter the data");
 
		for(int i=0; i<n; i++) {
			
			list.add(scan.next());
		}
	}
	
	void display() {
		
		System.out.println("\nThe Linked List");
 
		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
		}
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		LinkedList_Ex1 obj = new LinkedList_Ex1();
		
		obj.getVal();
		obj.display();
	}
}
        
        public void removeMiddleElement(){
     int count = 0;
     for(int i=0; i<values.length; i++){
         count++;
     }
     if(count%2==0){
         int middle1=count/2;
         int middle2=(count/2)+1;
         int[] copy = new int[copy.length-1];
         System.arraycopy(copy, 0, copy, 0, middle1);
         System.arraycopy(copy, middle1+1, copy, middle1, copy.length-middle1-1);
         System.arraycopy(copy, 0, copy, 0, middle2);
         System.arraycopy(copy, middle2+1, copy, middle2, copy.length-middle2-1);
         copy = values; 
        }
     else if(count%2!=0){
         int middle3=(int) ((count/2)+.5);
         int[] copy = new int[copy.length-1];
         System.arraycopy(copy, 0, copy, 0, middle3);
         System.arraycopy(copy, middle3+1, copy, middle3, copy.length-middle3-1);
         copy = values;
         }
        
    }
    
    public boolean countOdds(int impNum){
        
        if (impNum % 2 != 0) {
            return true;
        } else {
            return false;
        }

        
    }
    
}
