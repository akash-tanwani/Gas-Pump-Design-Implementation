package Pay_Msg;

import DataStore.DataStore;
/*
 * This Class will display the different payment methods available for GasPump_1 i.e, Credit card payment and Cash Payment
 */

public class Pay_Msg1 extends Pay_Msg{

    @Override
    public void PayMsg(DataStore d)
    {
        System.out.println("Thank you for choosing this GasPump");
        System.out.println("select payment type for the GasPump\n");
        System.out.println("\tPress (2) for Credit Card Payment");
        System.out.println("\tPress (6) for Cash  Payment");
    }
    
}
