import java.util.Scanner;

public class Box {
    double width;
    double height;
    double depth;
    
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    double volume() {
        return width * height * depth;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box box = new Box();
        
        System.out.print("Enter width of the box: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter height of the box: ");
        double height = scanner.nextDouble();
        
        System.out.print("Enter depth of the box: ");
        double depth = scanner.nextDouble();
        
        box.setDim(width, height, depth);
        System.out.println("Volume of the box is: " + box.volume());
        
        scanner.close();
    }
}
