
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TAXPAYER person =new TAXPAYER();
        System.out.print("Enter Person Name : ");
        person.name=sc.nextLine();
        System.out.print("Enter Person Age : ");
        person.age= sc.nextInt();
        sc.nextLine();
        System.out.print("Select Employment type : ");
        System.out.println("\nGovernment");
        System.out.println("Private");
        System.out.println("Business");
        int choice= sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                person.employmentType="Government";
                break;
            case 2:
                person.employmentType="Private";
                break;
            case 3:
                person.employmentType="Business";
                break;
            default:
                person.employmentType="Private";
        }
        System.out.print("Enter Annual Income : ");
        person.annualincome= sc.nextDouble();
        TaxDetails details=TaxCalculator.CalculateTax(person.annualincome,person.employmentType);
        TaxReport.printreport(person,details);


    }
}