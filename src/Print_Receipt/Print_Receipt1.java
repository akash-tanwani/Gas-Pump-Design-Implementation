package Print_Receipt;

import DataStore.DataStore;
/*
 * This Class will will display the receipt showing total liters of gasoline pumped along with the rate per liter and the total amount
 */
public class Print_Receipt1 extends Print_Receipt {

    @Override
    public void PrintReceipt(DataStore d) {
        // TODO Auto-generated method stub
        System.out.println("######################################################################");
        System.out.println("Printing receipt ...");
        System.out.println("######################################################################");
        System.out.println(d.getL() + " Liters of gasoline pumped at rate of : $" + d.getPrice() + "/Liter");
        System.out.println("Total amount is: $" + d.getTotal());
        float return_cash=d.getCash()-d.getTotal();
        if(return_cash>0) {
            System.out.println("#######################################################################");
            System.out.println("Returning Cash Amount is : $"+ return_cash);
        }
        System.out.println("#######################################################################");
        System.out.println("Transaction complete");
        System.out.println("#######################################################################");
    }
    
}
