public class Methods {
    final static double INCHES = 0.0254001;
    final static double FEET = 0.3048;
    final static double MILES = 1609.35;
    final static double MILLIMETERS = 0.001;
    final static double CENTIMETERS = 0.01;
    final static double METERS = 1;
    final static double KILOMETERS = 1000;
    private double  meters, converted ;
    String afromUnit;

    // Constrcture
    Methods(String fromUnit) {
        afromUnit = fromUnit;
    }

    // This method converts the value to meters.
    public double toMeters(double val) {
        if (afromUnit.equals("inch")) {
            meters = (val * INCHES);
        } else if (afromUnit.equals("ft")) {
            meters = (val * FEET);
        } else if (afromUnit.equals("mi")) {
            meters = (val * MILES);
        } else if (afromUnit.equals("mm")) {
            meters = (val * MILLIMETERS);
        } else if (afromUnit.equals("cm")) {
            meters = (val * CENTIMETERS);
        } else if (afromUnit.equals("m")) {
            meters = (val * METERS);
        } else if (afromUnit.equals("km")) {
            meters = (val * KILOMETERS);
        
        }
        return meters;
    }

    // This method converts meters to the selected unit.
    public double fromMeters(double meters2) {
        if (afromUnit.equals("inch")) {
            converted = meters2 * (39.36992);
        } else if (afromUnit.equals("ft")) {
            converted = (meters2 * 3.28084);
        } else if (afromUnit.equals("mi")) {
            converted = (meters2 * 1609.34);
        } else if (afromUnit.equals("mm")) {
            converted = (meters2 * 1000);
        } else if (afromUnit.equals("cm")) {
            converted = (meters2 * 100);
        } else if (afromUnit.equals("m")) {
            converted = (meters2 * 1);
        } else if (afromUnit.equals("km")) {
            converted = (meters2 * 0.001);
        } 
        return converted;
    }
}