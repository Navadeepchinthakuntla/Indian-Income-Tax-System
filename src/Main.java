
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
        System.out.print("Enter Employment type : ");
        person.employmentType= sc.nextLine();
        System.out.print("Enter Annual Income : ");
        person.annualincome= sc.nextDouble();
        double tax=TaxCalculator.CalculateTax(person.annualincome);
        System.out.println("\n-----TAX REPORT-----");
        System.out.println("Name : "+person.name);
        System.out.println("Age : "+person.age);
        System.out.println("Employment type : "+person.employmentType);
        System.out.println("Annul Income : "+person.annualincome);
        System.out.println("Tax Payable : "+tax);


    }
}