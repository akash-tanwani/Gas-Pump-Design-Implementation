package OP;

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
import AbstractFactory.AbstractFactory;
import Cancel_Msg.*;
import DataStore.DataStore;

/*
*   This class acts as the "Client" class in the strategy design pattern
*   Each Action in this class calls the platform specific implementation of the action.
* 	Implemented meta action based on strategy pattern.
 */

public class OP {
    
    DataStore dataStore;
    Store_Prices store_Prices;
    Pay_Msg pay_Msg;
    Store_Cash store_Cash;
    Display_Menu display_Menu;
    Reject_Msg reject_Msg;
    Set_Price set_Price;
    Set_InitialValues set_InitialValues;
    Pump_GasUnit pump_GasUnit;
    GasPumped_Msg gasPumped_Msg;
    Print_Receipt print_Receipt;
    Cancel_Msg cancel_Msg;
    Return_Cash return_Cash;
    WrongPin_Msg wrongPin_Msg;
    Store_Pin store_Pin;
    EnterPin_Msg enterPin_Msg;
    Initialize_Data initialize_Data;
    Eject_Card eject_Card;
    Set_W set_W;

    public void StorePrices()
    {
        // stores price(s) for the gas from the temporary data store
        store_Prices.StorePrices(dataStore);
    }

    public void PayMsg()
    {
        // displays a type of payment method
        pay_Msg.PayMsg(dataStore);
    }

    public void StoreCash()
    {
        // stores cash from the temporary data store
        store_Cash.StoreCash(dataStore);
    }

    public void DisplayMenu()
    {
        // display a menu with a list of selections
        display_Menu.DisplayMenu(dataStore);
    }

    public void RejectMsg()
    {
        // displays credit card not approved message
        reject_Msg.RejectMsg(dataStore);
    }

    public void SetPrice(int g)
    {
        // set the price for the gas identified by g identifier
        set_Price.SetPrice(dataStore,g);
    }

    public void SetInitialValues()
    {
        // set G (or L) and total to 0
        set_InitialValues.SetInitialValues(dataStore);
    }

    public void PumpGasUnit()
    {
        // disposes unit of gas and counts # of units disposed
        pump_GasUnit.PumpGasUnit(dataStore);
    }

    public void GasPumpedMsg()
    {
        // displays the amount of disposed gas
        gasPumped_Msg.GasPumpedMsg(dataStore);
    }

    public void PrintReceipt()
    {
        // print a receipt
        print_Receipt.PrintReceipt(dataStore);
    }

    public void CancelMsg() {
        // displays a cancellation message
        cancel_Msg.CancelMsg(dataStore);
    }

    public void ReturnCash(){
        // returns the cash
        return_Cash.ReturnCash(dataStore);
    }

    public void WrongPinMsg(){
        // displays a wrong pin message
        wrongPin_Msg.WrongPinMsg(dataStore);
    }
    
    public void StorePin(){
        // store price from the temporary data store
        store_Pin.StorePin(dataStore);
    }

    public void EnterPinMsg(){
        // displays Enter pin message
        enterPin_Msg.EnterPinMsg(dataStore);
    }
    
    public void InitializeData(){
        // it reset the value of price
        initialize_Data.InitializeData(dataStore);
    }

    public void SetW(int i){
        // it set the payment type(0 for cash payment or 1 for card payment)
        set_W.SetW(dataStore,i);
    }

    public void EjectCard(){
        // displays Eject card message
        eject_Card.EjectCard(dataStore);
    }

	public void intialize(AbstractFactory af, DataStore d) {
        //create object of each class
        store_Prices=af.CreateStorePrices();
        pay_Msg=af.CreatePayMsg();
        store_Cash=af.CreateStoreCash();
        display_Menu=af.CreateDisplayMenu();
        reject_Msg=af.CreateRejectMsg();
        set_Price=af.CreateSetPrice();
        set_InitialValues=af.CreateSetInitialValues();
        pump_GasUnit=af.CreatePumpGasUnit();
        gasPumped_Msg=af.CreateGasPumpedMsg();
        print_Receipt=af.CreatePrintReceipt();
        cancel_Msg=af.CreateCancelMsg();
        return_Cash=af.CreateReturnCash();
        wrongPin_Msg=af.CreateWrongPinMsg();
        store_Pin=af.CreateStorePin();
        enterPin_Msg=af.CreateEnterPinMsg();
        initialize_Data=af.CreateInitializeData();
        set_W=af.CreateSetW();
        eject_Card=af.CreateEjectCard();
        dataStore=d;

	}
    
}


