public class TaxReport {
    public static void printreport(TAXPAYER person,double tax){
        System.out.println("\n========TAX REPORT========");
        System.out.println("Name           : "+person.name);
        System.out.println("Age            : "+person.age);
        System.out.println("EmploymentType : "+person.employmentType);
        System.out.println("AnnualIncome   : "+person.annualincome);
        System.out.println("Tax Payable    : "+tax);
        System.out.println("===========================");

    }
}
