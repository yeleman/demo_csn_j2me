
package snisi.entities;

import java.util.Vector;

import snisi.entities.EntityHashTable;

/**
 * List of static codes and names for Entities/Locations
 * Automatically generated.
 */


public class EntityHashTable8TK7 extends EntityHashTable {

    public EntityHashTable8TK7() {
        this.code = "8TK7";
        this.name = "KIDAL";
        this.children = new Vector();

        
        EntityHashTable hPAM0 = new EntityHashTable("PAM0", "KIDAL CSREF");

        

        this.children.addElement(hPAM0);
        
        EntityHashTable hYTK0 = new EntityHashTable("YTK0", "AGHABO");

        

        this.children.addElement(hYTK0);
        
        EntityHashTable hDN74 = new EntityHashTable("DN74", "ALIOU");

        

        this.children.addElement(hDN74);
        
        EntityHashTable hEH21 = new EntityHashTable("EH21", "ANEFIF");

        

        this.children.addElement(hEH21);
        
        EntityHashTable hB3Z5 = new EntityHashTable("B3Z5", "ESSOUK");

        

        this.children.addElement(hB3Z5);
        
        EntityHashTable hZJ25 = new EntityHashTable("ZJ25", "ETAMBAR");

        

        this.children.addElement(hZJ25);
        
        EntityHashTable hKZ41 = new EntityHashTable("KZ41", "KIDAL CENTRAL");

        

        this.children.addElement(hKZ41);
        
    }

}