public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = Double.parseDouble(args[0]);   
        System.out.println("Celsius: "+celsius);
        double Fahrenheit =celsius * 9/5 +32;
        System.out.println("Fajremheit: "+Fahrenheit);
        double Kelvin =celsius+273.15;
        System.out.println("Kelvin: "+Kelvin);
        
        int cel=Integer.parseInt(args[0]);
        int F=9/5*cel+32;//9/5 becomes 1 and 1*37= 37 and 37+32=69 
        System.out.println("BUG: "+F);
    }
}
