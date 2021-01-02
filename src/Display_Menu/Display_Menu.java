package Display_Menu;

import DataStore.DataStore;
/*
 * Display_Menu Class
 * This class represents the meta action of Display Menu
 * This is a parent abstract class having one abstract method of DisplayMenu()
 * The child classes will be having different implementations or versions of this action
 */

public abstract class Display_Menu {
    public abstract void DisplayMenu(DataStore d);
}
