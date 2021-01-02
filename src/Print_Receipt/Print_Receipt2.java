package Print_Receipt;

import DataStore.DataStore;
/*
 * This Class will will display the receipt showing total gallons of gasoline pumped along with the rate per Gallon and the total amount
 */
public class Print_Receipt2 extends Print_Receipt {

    @Override
    public void PrintReceipt(DataStore d) {
        // TODO Auto-generated method stub
        System.out.println("######################################################################################");
        System.out.println("Printing receipt ...");
        System.out.println("######################################################################################");
        System.out.println(d.getG() + " Gallons of gasoline pumped at rate of : $" + d.getFloatPrice() + "/Gallon");
        System.out.println("Total amount is: $" + d.getFloatTotal());
        System.out.println("#######################################################################################");
        System.out.println("Transaction complete");
        System.out.println("#######################################################################################");
    }
    
}
