
package snisi.entities;

import java.util.Vector;

import snisi.entities.EntityHashTable;

/**
 * List of static codes and names for Entities/Locations
 * Automatically generated.
 */


public class EntityHashTableR279 extends EntityHashTable {

    public EntityHashTableR279() {
        this.code = "R279";
        this.name = "COMMUNE1";
        this.children = new Vector();

        
        EntityHashTable hHCK0 = new EntityHashTable("HCK0", "COMMUNE 1 CSREF");

        

        this.children.addElement(hHCK0);
        
        EntityHashTable hBXE2 = new EntityHashTable("BXE2", "ASACOBA");

        
        EntityHashTable v91091001 = new EntityHashTable("91091001", "BANCONI");
		hBXE2.children.addElement(v91091001);
       	

        this.children.addElement(hBXE2);
        
        EntityHashTable h3X68 = new EntityHashTable("3X68", "ASACOBOUL1");

        
        EntityHashTable v91091112 = new EntityHashTable("91091112", "BOULKASSOUMBOUGOU");
		h3X68.children.addElement(v91091112);
       	

        this.children.addElement(h3X68);
        
        EntityHashTable hNM44 = new EntityHashTable("NM44", "ASACOBOUL2");

        

        this.children.addElement(hNM44);
        
        EntityHashTable h39F6 = new EntityHashTable("39F6", "ASACODJAN");

        

        this.children.addElement(h39F6);
        
        EntityHashTable hPX23 = new EntityHashTable("PX23", "ASACODJE");

        
        EntityHashTable v91091223 = new EntityHashTable("91091223", "DIELIBOUGOU");
		hPX23.children.addElement(v91091223);
       	

        this.children.addElement(hPX23);
        
        EntityHashTable hF4F7 = new EntityHashTable("F4F7", "ASACODOU");

        
        EntityHashTable v91091334 = new EntityHashTable("91091334", "DOUMAZANA");
		hF4F7.children.addElement(v91091334);
       	

        this.children.addElement(hF4F7);
        
        EntityHashTable hCCM1 = new EntityHashTable("CCM1", "ASACOFADJI");

        
        EntityHashTable v91091445 = new EntityHashTable("91091445", "FADJIGUILA");
		hCCM1.children.addElement(v91091445);
       	

        this.children.addElement(hCCM1);
        
        EntityHashTable h95T5 = new EntityHashTable("95T5", "ASACOKOSA");

        
        EntityHashTable v91091667 = new EntityHashTable("91091667", "KOROFINA SUD");
		h95T5.children.addElement(v91091667);
       	

        this.children.addElement(h95T5);
        
        EntityHashTable hWH67 = new EntityHashTable("WH67", "ASACOMSI");

        

        this.children.addElement(hWH67);
        
        EntityHashTable h6F26 = new EntityHashTable("6F26", "ASACONORD");

        
        EntityHashTable v91091556 = new EntityHashTable("91091556", "KOROFINA NORD");
		h6F26.children.addElement(v91091556);
       	

        this.children.addElement(h6F26);
        
        EntityHashTable h8M97 = new EntityHashTable("8M97", "ASACOSISOU");

        
        EntityHashTable v91091778 = new EntityHashTable("91091778", "SIKORONI (MEKIN SICORO)");
		h8M97.children.addElement(v91091778);
       	

        this.children.addElement(h8M97);
        
        EntityHashTable h24J0 = new EntityHashTable("24J0", "SOTUBA");

        
        EntityHashTable v91091889 = new EntityHashTable("91091889", "SOTUBA");
		h24J0.children.addElement(v91091889);
       	

        this.children.addElement(h24J0);
        
    }

}