package AbstractFactory;

import Display_Menu.*;
import Eject_Card.*;
import EnterPin_Msg.*;
import GasPumped_Msg.*;
import Initialize_Data.*;
import Pay_Msg.*;
import Print_Receipt.*;
import Pump_GasUnit.*;
import Reject_Msg.*;
import Return_Cash.*;
import Set_InitialValues.*;
import Set_Price.*;
import Set_W.*;
import Store_Cash.*;
import Store_Pin.*;
import Store_Prices.*;
import WrongPin_Msg.*;
import Cancel_Msg.*;


/*
 * ConcreteFactory_1
 * Concrete Factory 1
 * Child of Abstract Factory
 * This will create required Output Class objects to use Gas Pump1
 *
 */

public class ConcreteFactory1 extends AbstractFactory {


    @Override
    public Store_Prices CreateStorePrices() {
        // Create and returns object of storePrices_1 class that will store data as per user input for GasPump_1
        return new Store_Prices1();
    }
    
    @Override
    public Pay_Msg CreatePayMsg(){
        // Create and returns object of Pay_Msg1 class that will display different payment methods available for GasPump_1
        return new Pay_Msg1();
    }
    
    @Override
    public Store_Cash CreateStoreCash(){
        //create and returns object of Store_Cash1 class that will store cash for GasPump_1
        return new Store_Cash1();
    }
    
    @Override
    public  Display_Menu CreateDisplayMenu(){
        //Create and returns object of Display_Menu1 class to display menu available for GasPump_1
	    return new Display_Menu1(); 
	}
    
    @Override
    public Reject_Msg CreateRejectMsg(){
        //Create and returns object of Reject_Msg1 class to display rejected message of credit card transaction for GasPump_1
        return new Reject_Msg1();
    }
    
    @Override
    public Set_Price CreateSetPrice(){
        //this will not return anything as we don't have any option to select gas type for GasPump_1
        return new Set_Price1();
    }
    
    @Override
    public Set_InitialValues CreateSetInitialValues(){
        //Creates object of Set_InitialValues1 class that will set the total price and number of liters pumped to 0 for GasPump_1
        return new Set_InitialValues1();
    }

    @Override
    public Pump_GasUnit CreatePumpGasUnit(){
        // Create and returns object of Pump_GasUnit1 class that returns total unit of gas pumped for GasPump_1
        return new Pump_GasUnit1();
    }
    
    @Override
    public GasPumped_Msg CreateGasPumpedMsg(){
        // Creates and return object of GasPumped_Msg1 class that displays displays number of liters gas pumped  of transaction for GasPump_1
        return new GasPumped_Msg1();
    }
    
    @Override
    public Print_Receipt CreatePrintReceipt(){
        // Create and return object of class Print_Receipt1 that will display the total bill of the transaction for GasPump_1
        return new Print_Receipt1();
    }

    @Override
    public Cancel_Msg CreateCancelMsg() {
        // Create and returns the object of Cancel_Msg1 class that will cancel the current transaction and displays the same for GasPump_1
        return new Cancel_Msg1();
    }

    
    @Override
    public Return_Cash CreateReturnCash(){
        // Create and returns the object of class Return_Cash1 that will Return the cash in case when user will select the cancel option for GasPump_1
        return new Return_Cash1();
    }

    @Override
    public WrongPin_Msg CreateWrongPinMsg(){
        //This will not return anything as we don't have debit card payment option for GasPump_1
        return new WrongPin_Msg1();
    }
    
    
    @Override
    public Store_Pin CreateStorePin(){
        //this will not return anything as we don't have debit card payment option for GasPump_1
        return new Store_Pin1();
    }
    
    @Override
    public EnterPin_Msg CreateEnterPinMsg(){
        //this will not return anything as we don't have debit card payment option for GasPump_1
        return new EnterPin_Msg1();
    }

    @Override
    public Initialize_Data CreateInitializeData(){
        // this will not return anything as we don't have any option to select gas type for GasPump_1
        return new Initialize_Data1();
    }
    
    @Override
    public Set_W CreateSetW(){
        // Creates and return object of Set_W1 class that is set to 1 for card payments and set to 0 for Cash payment
        return new Set_W1();
    }
    
    @Override
    public Eject_Card CreateEjectCard(){
        // Creates and return object of Eject_Card1 class that will Display Eject Card message for any card transaction for GasPump_1
        return new Eject_Card1();
    }

 
    
}
    
    
