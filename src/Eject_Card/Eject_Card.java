package Eject_Card;

/*
 * Eject Card Class
 * This class represents the meta action of Eject Card
 * This is a parent abstract class having one abstract method of EjectCard()
 * Here The child classes will be having same implementations or versions of this action
 */

import DataStore.DataStore;

public abstract class Eject_Card {
    public abstract void EjectCard(DataStore d);
}
