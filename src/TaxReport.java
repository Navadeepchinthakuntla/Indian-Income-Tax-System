public class TaxReport {
    public static void printreport(TAXPAYER person,TaxDetails details){
        System.out.println("\n========TAX REPORT========");
        System.out.println("Name           : "+person.name);
        System.out.println("Age            : "+person.age);
        System.out.println("EmploymentType : "+person.employmentType);
        System.out.println("AnnualIncome   : "+person.annualincome);
        System.out.println("\n-----TAX BREAKDOWN-----");
        System.out.println("TaxPayable Income : "+details.TaxableIncome);
        System.out.println("Base Tax          : "+details.BaseTax);
        System.out.println("Cess              : "+details.Cess);
        System.out.println("Final Tax         : "+details.FinalTax);
        System.out.println("===========================");

    }
}
