public class Circle{
    public double radius;
    double pi=3.142,area;
    public void findarea(){
        area=pi*radius*radius;
    }
    public void display(){
        System.out.println("Area of the circle is: " + area);
    }
} 
