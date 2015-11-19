//Creates the Rectangle Class
public class Rectangle {
    //Declares two non static global variables
    double width;
    double height;
    //non-static method that takes one paramter and assigns the value to 'width'
    public void setWidth(double x) {
        width = x;
    }
    //non-static method that takes one parameter and assigns the value to 'height'
    public void setHeight(double y) {
        height = y;
    }
    //non-static method that computes and returns the product of 'height' and 'width'
    public double getArea() {
        return (height * width);
    }
    //declares the main method
    public static void main (String[] args) {
        //Creates the r1 instance of class Rectangle
        Rectangle r1 = new Rectangle();
        //calls the 'setWidth' method and sets width equal to 7.3
        r1.setWidth(7.3);
        //calls the 'setHeight' method and sets height equal to 5.3
        r1.setHeight(5.3);
        //prints the area, by calling 'getArea'
        System.out.println("Area: " + r1.getArea());
    }
}