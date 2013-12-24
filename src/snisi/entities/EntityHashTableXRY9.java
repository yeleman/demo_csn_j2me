
package snisi.entities;

import java.util.Vector;

import snisi.entities.EntityHashTable;

/**
 * List of static codes and names for Entities/Locations
 * Automatically generated.
 */


public class EntityHashTableXRY9 extends EntityHashTable {

    public EntityHashTableXRY9() {
        this.code = "XRY9";
        this.name = "COMMUNE5";
        this.children = new Vector();

        
        EntityHashTable hXBY5 = new EntityHashTable("XBY5", "COMMUNE 5 CSREF");

        

        this.children.addElement(hXBY5);
        
        EntityHashTable hM4M4 = new EntityHashTable("M4M4", "ADASCO");

        

        this.children.addElement(hM4M4);
        
        EntityHashTable hTX81 = new EntityHashTable("TX81", "ASACOBADA PMI");

        
        EntityHashTable v91095100 = new EntityHashTable("91095100", "BADALABOUGOU");
		hTX81.children.addElement(v91095100);
       	
        EntityHashTable v91095595 = new EntityHashTable("91095595", "QUARTIER SEMA");
		hTX81.children.addElement(v91095595);
       	

        this.children.addElement(hTX81);
        
        EntityHashTable h2860 = new EntityHashTable("2860", "ASACODA");

        
        EntityHashTable v91095199 = new EntityHashTable("91095199", "FLABOUGOU-DAOUDABOUGOU");
		h2860.children.addElement(v91095199);
       	

        this.children.addElement(h2860);
        
        EntityHashTable hE8T0 = new EntityHashTable("E8T0", "ASACOGA");

        
        EntityHashTable v91095900 = new EntityHashTable("91095900", "GARANTIGUIBOUGOU");
		hE8T0.children.addElement(v91095900);
       	

        this.children.addElement(hE8T0);
        
        EntityHashTable h4B69 = new EntityHashTable("4B69", "ASACOKAL");

        
        EntityHashTable v91095397 = new EntityHashTable("91095397", "KALABANCOURA");
		h4B69.children.addElement(v91095397);
       	

        this.children.addElement(h4B69);
        
        EntityHashTable h5543 = new EntityHashTable("5543", "ASACOSAB I");

        
        EntityHashTable v91095694 = new EntityHashTable("91095694", "SABALIBOUGOU");
		h5543.children.addElement(v91095694);
       	

        this.children.addElement(h5543);
        
        EntityHashTable hR2R4 = new EntityHashTable("R2R4", "ASACOSAB II");

        
        EntityHashTable v91095793 = new EntityHashTable("91095793", "SEMA II");
		hR2R4.children.addElement(v91095793);
       	

        this.children.addElement(hR2R4);
        
        EntityHashTable hDMC3 = new EntityHashTable("DMC3", "ASACOSAB III");

        

        this.children.addElement(hDMC3);
        
        EntityHashTable hJF51 = new EntityHashTable("JF51", "ASACOTOQUA");

        
        EntityHashTable v91095496 = new EntityHashTable("91095496", "QUARTIER MALI");
		hJF51.children.addElement(v91095496);
       	
        EntityHashTable v91095892 = new EntityHashTable("91095892", "TOROKOROBOUGOU");
		hJF51.children.addElement(v91095892);
       	

        this.children.addElement(hJF51);
        
        EntityHashTable hGWS9 = new EntityHashTable("GWS9", "ASCOMBACODJI");

        
        EntityHashTable v91095001 = new EntityHashTable("91095001", "BACO-DJIKORONI");
		hGWS9.children.addElement(v91095001);
       	

        this.children.addElement(hGWS9);
        
        EntityHashTable hN3C7 = new EntityHashTable("N3C7", "ASCODA");

        

        this.children.addElement(hN3C7);
        
        EntityHashTable hZ4E3 = new EntityHashTable("Z4E3", "ASACOKAL ACI");

        

        this.children.addElement(hZ4E3);
        
    }

}