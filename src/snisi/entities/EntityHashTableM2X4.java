
package snisi.entities;

import java.util.Vector;

import snisi.entities.EntityHashTable;

/**
 * List of static codes and names for Entities/Locations
 * Automatically generated.
 */


public class EntityHashTableM2X4 extends EntityHashTable {

    public EntityHashTableM2X4() {
        this.code = "M2X4";
        this.name = "ABEIBARA";
        this.children = new Vector();

        
        EntityHashTable hHMN0 = new EntityHashTable("HMN0", "ABEIBARA CSREF");

        

        this.children.addElement(hHMN0);
        
        EntityHashTable hWW71 = new EntityHashTable("WW71", "ABEIBARA CENTRAL");

        

        this.children.addElement(hWW71);
        
    }

}