/*
 * Project exercise 13.7 main method 
 * Lauren Smith 
 * 12/16/20 
 * Tests out GeometricObject, Square class and Colorable interface 
 */
package pkg137;


public class Main {

    
    public static void main(String[] args) {
        //Makes array of 5 GeometricObjects
        GeometricObject[] shapes=new GeometricObject[5]; 
        shapes[0]=new Square(5); 
        shapes[1]=new Square(4); 
        shapes[2]=new Square(3); 
        shapes[3]=new Square(2); 
        shapes[4]=new Square(1);  
        //loops through the array 
        for(int i=0; i<shapes.length; i++) 
        {
            //prints out the area of the item at i index of array followed by a 
            //space
            System.out.print(shapes[i].getArea()+" "); 
            //prints out howToColor at index of i 
            shapes[i].howToColor(); 
        }
    }
    
}
