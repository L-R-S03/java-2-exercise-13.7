/*
 * Project exercise 13.7 Square class 
 * Lauren Smith 
 * 12/16/20 
 * Makes Square class that extends GeometricObject and implements Colorable
 */
package pkg137;

//makes square class that extends GeometricObject and implements Colorable interface
public class Square extends GeometricObject implements Colorable { 
    //makes private double side for length of side of the square
    private double side; 
    //default super constructor and sets side length
    public Square(double side) 
    {
        super();  
        this.side=side; 
    } 
    //parameter super constructor and sets side length
    public Square(String color, boolean filled, double side) 
    {
        super(color, filled); 
        this.side=side; 
    } 
    //overrides abstract getArea and returns area by multiplying the two side lengths 
    @Override 
    public double getArea() 
    {
        return side*side; 
    } 
    //overrides abstract getPerimeter and finds perimeter by adding side lengths
    @Override 
    public double getPerimeter() 
    {
        return side+side+side+side; 
    } 
    //overrides interface method howToColor and prints color all four sides
    @Override 
    public void howToColor() 
    {
        System.out.println("Color all four sides");
                
                
    }
    
    
}
