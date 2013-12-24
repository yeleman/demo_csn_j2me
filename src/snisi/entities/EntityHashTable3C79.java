
package snisi.entities;

import java.util.Vector;

import snisi.entities.EntityHashTable;

/**
 * List of static codes and names for Entities/Locations
 * Automatically generated.
 */


public class EntityHashTable3C79 extends EntityHashTable {

    public EntityHashTable3C79() {
        this.code = "3C79";
        this.name = "TIN-ESSAKO";
        this.children = new Vector();

        
        EntityHashTable hWTS9 = new EntityHashTable("WTS9", "TIN-ESSAKO CSREF");

        

        this.children.addElement(hWTS9);
        
        EntityHashTable hKXD0 = new EntityHashTable("KXD0", "TIN-ESSAKO CENTRAL");

        

        this.children.addElement(hKXD0);
        
    }

}