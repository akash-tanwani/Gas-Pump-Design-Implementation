package GasPumped_Msg;

import DataStore.DataStore;
/*
 * GasPumped_Msg Class
 * This class represents the meta action of GasPumped Message
 * This is a parent abstract class having one abstract method of GasPumpedMsg()
 * The child classes will be having different implementations or versions of this action
 */

public abstract class GasPumped_Msg {
    public abstract void GasPumpedMsg(DataStore d);
    
}
