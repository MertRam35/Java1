package day07_Operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate= 50, weeklyHours= 45 ;
        double stateTaxeRate= 0.06,federalTaxrate= 0.26;//salaryBeforeTax = hourlyRate * weeklyHour * 52
        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        System.out.println("salaryBeforeTax = $ " + (int) salaryBeforeTax);
        System.out.println("federalTaxrate = $" +(int)(federalTaxrate*salaryBeforeTax));
        System.out.println("stateTaxeRate = $" + (int)(stateTaxeRate*salaryBeforeTax));
        System.out.println("total tax is "+ ((salaryBeforeTax*federalTaxrate)+(salaryBeforeTax*stateTaxeRate)));
        double totalTax=((salaryBeforeTax*federalTaxrate)+(salaryBeforeTax*stateTaxeRate));
        System.out.println("Net income is "+ (int) (salaryBeforeTax-totalTax));



    }
}
