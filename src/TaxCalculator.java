public class TaxCalculator {
    public static TaxDetails CalculateTax(double Income,String employmentType){
        TaxDetails details=new TaxDetails();
        double TaxableIncome=Income;
        if(employmentType.equalsIgnoreCase("Government")||
                employmentType.equalsIgnoreCase("Private")) {
            TaxableIncome = Income - 50000;

        }
        details.TaxableIncome=TaxableIncome;
        double tax =0;
        if(TaxableIncome<=300000){
            tax=0;
        } else if (TaxableIncome<=600000) {
            tax=(TaxableIncome-300000)*0.05;
        } else if (TaxableIncome<=900000) {
            tax=(300000*0.05)+
                    (TaxableIncome-600000)*0.10;

        } else if (TaxableIncome<=1200000) {
            tax=(300000*0.05)+
                    (300000*0.10)+
                    (TaxableIncome-900000)*0.15;

        } else if (TaxableIncome<=1500000) {
            tax=(300000*0.05)+
                    (300000*0.10)+
                    (300000*0.15)+
                    (TaxableIncome-1200000)*0.20;
        }else {
            tax = (300000 * 0.05) +
                    (300000 * 0.10) +
                    (300000 * 0.15) +
                    (300000 * 0.20) +
                    (TaxableIncome - 1500000) * 0.30;

        }
        if (TaxableIncome<700000){
            tax=0;
        }
        details.BaseTax=tax;
        double cess=tax*(0.04);
        details.Cess=cess;
        details.FinalTax=tax+cess;
        return details;

    }
}
