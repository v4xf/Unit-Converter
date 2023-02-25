import java.util.Scanner;

public class Unit_Converter {
    public static void main(String[] args) {
        // user interface
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(
                "INCHES = 'inch'  FEET = 'ft'  MILES = 'mi'  MILLIMETERS = 'mm'  CENTIMETERS = 'cm'  METERS = 'm'  KILOMETERS = 'km'");
        System.out.println();


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Unit which want to Convert from:");
        String fromUnit = scan.nextLine();

        

        System.out.println("Enter the Unit which want to Convert to: ");
        String toUnit = scan.nextLine();





        // new  objects  from, to :
        Methods from = new Methods(fromUnit);
        Methods to = new Methods(toUnit);
        System.out.println("Enter the Value of Unit which want to Convert from:");

        // Enterd value = val, goes inside the function and processed according to the unit.
        double val = scan.nextDouble();
        double meters = from.toMeters(val);
        double converted = to.fromMeters(meters);

        System.out.println();
        System.out.println(val + " " + fromUnit + " = " + converted + " " + toUnit);
        System.out.println();
        scan.close();
    }
}