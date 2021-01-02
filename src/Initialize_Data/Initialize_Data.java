package Initialize_Data;

import DataStore.DataStore;
/*
 * Initialize_Data Class
 * This class represents the meta action of Initializing the Data when we have more then one options for selecting the type of gasoline
 * This is a parent abstract class having one abstract method of InitializeData()
 * The child classes will be having different implementations or versions of this action
 */

public abstract class Initialize_Data {
    public abstract void InitializeData(DataStore d);
}
