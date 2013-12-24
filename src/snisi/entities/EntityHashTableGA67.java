
package snisi.entities;

import java.util.Vector;

import snisi.entities.EntityHashTable;

/**
 * List of static codes and names for Entities/Locations
 * Automatically generated.
 */


public class EntityHashTableGA67 extends EntityHashTable {

    public EntityHashTableGA67() {
        this.code = "GA67";
        this.name = "COMMUNE3";
        this.children = new Vector();

        
        EntityHashTable hKR20 = new EntityHashTable("KR20", "COMMUNE 3 CENTRAL - PMI");

        

        this.children.addElement(hKR20);
        
        EntityHashTable hZPP3 = new EntityHashTable("ZPP3", "ASACOBAKON");

        
        EntityHashTable v91093001 = new EntityHashTable("91093001", "BADIALAN 1");
		hZPP3.children.addElement(v91093001);
       	
        EntityHashTable v91093056 = new EntityHashTable("91093056", "BADIALAN 2");
		hZPP3.children.addElement(v91093056);
       	
        EntityHashTable v91093111 = new EntityHashTable("91093111", "BADIALAN 3");
		hZPP3.children.addElement(v91093111);
       	
        EntityHashTable v91093496 = new EntityHashTable("91093496", "KODABOUGOU");
		hZPP3.children.addElement(v91093496);
       	
        EntityHashTable v91093606 = new EntityHashTable("91093606", "NIOMIRAMBOUGOU");
		hZPP3.children.addElement(v91093606);
       	

        this.children.addElement(hZPP3);
        
        EntityHashTable hGY73 = new EntityHashTable("GY73", "ASACODAR");

        
        EntityHashTable v91093331 = new EntityHashTable("91093331", "DARSALAM");
		hGY73.children.addElement(v91093331);
       	

        this.children.addElement(hGY73);
        
        EntityHashTable hPF99 = new EntityHashTable("PF99", "ASACODES");

        
        EntityHashTable v91093881 = new EntityHashTable("91093881", "SAME");
		hPF99.children.addElement(v91093881);
       	

        this.children.addElement(hPF99);
        
        EntityHashTable hC6Z1 = new EntityHashTable("C6Z1", "ASACODRAB");

        
        EntityHashTable v91093386 = new EntityHashTable("91093386", "DRAVELA");
		hC6Z1.children.addElement(v91093386);
       	
        EntityHashTable v91093441 = new EntityHashTable("91093441", "DRAVELA BOLIBANA");
		hC6Z1.children.addElement(v91093441);
       	

        this.children.addElement(hC6Z1);
        
        EntityHashTable h8ZP0 = new EntityHashTable("8ZP0", "ASACOKOULPOINT");

        
        EntityHashTable v91093551 = new EntityHashTable("91093551", "KOULOUBA/KOULOUBA-VILLAGE");
		h8ZP0.children.addElement(v91093551);
       	
        EntityHashTable v91093826 = new EntityHashTable("91093826", "POINT G");
		h8ZP0.children.addElement(v91093826);
       	
        EntityHashTable v91093936 = new EntityHashTable("91093936", "SOGONAFIN/MINKOUNGO");
		h8ZP0.children.addElement(v91093936);
       	

        this.children.addElement(h8ZP0);
        
        EntityHashTable hPGJ5 = new EntityHashTable("PGJ5", "ASACOM");

        
        EntityHashTable v91093221 = new EntityHashTable("91093221", "BAMAKO-COURA BOLIBANA EX-BASE");
		hPGJ5.children.addElement(v91093221);
       	
        EntityHashTable v91093276 = new EntityHashTable("91093276", "CENTRE COMMERCIAL");
		hPGJ5.children.addElement(v91093276);
       	

        this.children.addElement(hPGJ5);
        
        EntityHashTable hDP33 = new EntityHashTable("DP33", "ASACOOB");

        
        EntityHashTable v91093166 = new EntityHashTable("91093166", "BAMAKO-COURA");
		hDP33.children.addElement(v91093166);
       	
        EntityHashTable v91093716 = new EntityHashTable("91093716", "OUOLOFOBOUGOU");
		hDP33.children.addElement(v91093716);
       	
        EntityHashTable v91093771 = new EntityHashTable("91093771", "OUOLOFOBOUGOU BOLIBANA");
		hDP33.children.addElement(v91093771);
       	

        this.children.addElement(hDP33);
        
        EntityHashTable h45J9 = new EntityHashTable("45J9", "ASACOTOM");

        
        EntityHashTable v91093661 = new EntityHashTable("91093661", "N'TOMINKOROBOUGOU");
		h45J9.children.addElement(v91093661);
       	

        this.children.addElement(h45J9);
        
    }

}