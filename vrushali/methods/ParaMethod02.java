package methods;

public class ParaMethod02 {

    // parameterized methods -- with return type: string
    public String name(String firstName, String lastName)
    {
        System.out.println("First Name passed is: " +firstName);
        System.out.println("Last Name passed is: "+ lastName);
        String fullName= firstName + "  " + lastName;
        return (fullName); //return statement
    }

    // parameterized methods -- with return type: int
    public int totalSalary(int baseAmount, int allowance) {
        System.out.println("");
        System.out.println("Base Amount is: " + baseAmount + " INR");
        System.out.println("Allowance recovered is: " +allowance + " INR");
        return (baseAmount + allowance);   //return tally of base amount & allowance
    }

    public  boolean nationality(String n)
    {
        System.out.println("value passed is: " +n);

        if (n == "India") {
            System.out.println("Person is Indian");
            return (true);
        }
        else
        {
            System.out.println("Person is not an Indian");
            return (false);
        }
    }
    public static void main(String[] args) {

        ParaMethod02 p2 = new ParaMethod02(); //reference object creation
        System.out.println("");

        // declare variable to store the returned value, returned by 'name' method
        String name = p2.name("Vijay", "Devarkonda");  //calling method name
        System.out.println("Name: " + name);

        System.out.println("");

        // not declaring variable to store the returned value returned by 'totalSalary' method
        // directly printing the value returned by the method by calling method in the sout statement itself
        System.out.println("Net Salary is " + p2.totalSalary(5000, 2500) + " INR");

        System.out.println("");

        //calling nationality() to match value to TRUE
        boolean t1 = p2.nationality("India");
        System.out.println(t1);

        System.out.println("");

        //calling nationality() to match value to FALSE
        boolean t2 = p2.nationality("France");
        System.out.println(t2);

    }
}
