/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) 
    {             
        return length * width;
    }
    
    /**
     * Calculates the area of a rectangle.
     *
     * @param l  length of base of rectangle
     * @param w  width of the rectangle
     * @return   area of the rectangle
     */
    public static double rectangleArea(double length, double width) 
    {             
        return length * width;
    }
    
    /**
     * Calculates the area of a triangle.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
     /**
     * Calculates the volume of a sphere.
     *
     * @param r  radius of sphere
     * @return   volume of the sphere
     */
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calculates the area of a trapezoid.
     * 
     * @param a  base one of trapezoid
     * @param b  base two of trapezoid
     * @param h  height of trapezoid
     */
    
    public static double trapezoidArea(double base_1, double base_2, double height)
    {
       double area = ((base_1 + base_2) / 2) * height;
       return area; 
    }  
    
    
    /**
     * Calculates the volume of a rectangular prism.
     * 
     * @param l  length of prism
     * @param w  width of prism
     * @param h  height of prism 
     * 
     */
    
    public static double volumeRectangularPrism(double length, double width, double height)
    {
        double volume = length * width * height;
        return volume;
    }
    
    
    /** 
     * Calculates the volume of a cone.
     * 
     * @param r  radius of cone
     * @param h  height of cone
     * 
     */
    
    public static double volumeCone(double radius, double height)
    {
        double volume = (Math.PI * Math.pow(radius, 2) * height) / 3;
        return volume;
        
    }
    
    
    /**
     * Calculates the surface area of a rectangular prism.
     * 
     * @param 
     */
        
    
    
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println(ra1);
    }
}
