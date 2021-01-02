package Pay_Msg;

import DataStore.DataStore;
/*
 * Pay_Msg Class
 * This class represents the meta action of Payment methoods
 * This is a parent abstract class having one abstract method of PayMsg()
 * The child classes will be having different implementations or versions of this action based on what payment methods are available for those gas pumps
 */
public abstract class Pay_Msg {
    
    public abstract void PayMsg(DataStore d);
    
}
