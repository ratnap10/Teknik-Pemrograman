package AnotherTypeofEmployee;

/*
    Commission.java         Author: Ratna
    Represents a commissioned employee.
*/

public class Commission extends Hourly{
    private double totalSales;
    private double commissionRate;
    
    // Sets up this commissioned employee using the specified information.
    public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double commsRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        
        commissionRate = commsRate;
    }
    
    // Adds the parameter to the instance variable
    // representing total sales.
    public void addSales(double totSales){
        totalSales += totSales;
    }
    
    // Computes and returns the pay for a commissioned employee,
    // which is the hourly employee payment plus the total sales.
    public double pay(){
        double payment = super.pay() + (commissionRate*totalSales);
        totalSales = 0.0;
        return payment;
    }
    
    // Returns information about this commissioned employee as a string.
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
