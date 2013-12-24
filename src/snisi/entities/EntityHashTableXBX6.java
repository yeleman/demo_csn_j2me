
package snisi.entities;

import java.util.Vector;

import snisi.entities.EntityHashTable;

/**
 * List of static codes and names for Entities/Locations
 * Automatically generated.
 */


public class EntityHashTableXBX6 extends EntityHashTable {

    public EntityHashTableXBX6() {
        this.code = "XBX6";
        this.name = "TESSALIT";
        this.children = new Vector();

        
        EntityHashTable hS8B1 = new EntityHashTable("S8B1", "TESSALIT CSREF");

        

        this.children.addElement(hS8B1);
        
        EntityHashTable hK7K2 = new EntityHashTable("K7K2", "ASSEKHAT (ADEL - HOC)");

        

        this.children.addElement(hK7K2);
        
        EntityHashTable hXRP1 = new EntityHashTable("XRP1", "TAGHRIST");

        

        this.children.addElement(hXRP1);
        
        EntityHashTable hXRX0 = new EntityHashTable("XRX0", "TIMTAGHÈNE (INABAG)");

        

        this.children.addElement(hXRX0);
        
    }

}