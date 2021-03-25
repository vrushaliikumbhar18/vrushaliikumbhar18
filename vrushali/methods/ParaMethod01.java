package methods;

public class ParaMethod01 {

    // parameterized methods -- no return type
    public void areaOfTriangle(int height, int base)  //parameters of methods- height & base
    {
        System.out.println("Height of Triangle is: " +height + " cm");
        System.out.println("Base of Triangle is: " +base +" cm");

        System.out.println("");

        // area- local variable to store the area of triable calculated
        int area = (height * base)/2;
        System.out.println("Area of Triangle is " +area + " cm^2");
    }

    public static void main(String[] args) {
        ParaMethod01 p1= new ParaMethod01();

        //calling method by object reference
        p1.areaOfTriangle(20, 10);  //passing values for parameters of method i.e. values for height and base
    }

}
