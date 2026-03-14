//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TAXPAYER person =new TAXPAYER();
        person.name="ajay";
        person.age=22;
        person.employmentType="private";
        person.annualincome=600000;
        System.out.println("Name : "+person.name);
        System.out.println("Age : "+person.age);
        System.out.println("Employment type : "+person.employmentType);
        System.out.println("Annulincome : "+person.annualincome);


    }
}