
package snisi.entities;

import java.util.Vector;

import snisi.entities.EntityHashTable;

/**
 * List of static codes and names for Entities/Locations
 * Automatically generated.
 */


public class EntityHashTableHG51 extends EntityHashTable {

    public EntityHashTableHG51() {
        this.code = "HG51";
        this.name = "COMMUNE2";
        this.children = new Vector();

        
        EntityHashTable h3XC5 = new EntityHashTable("3XC5", "COMMUNE 2 CSREF");

        

        this.children.addElement(h3XC5);
        
        EntityHashTable h9MX1 = new EntityHashTable("9MX1", "ABOSAC");

        
        EntityHashTable v91092271 = new EntityHashTable("91092271", "BOZOLA");
		h9MX1.children.addElement(v91092271);
       	

        this.children.addElement(h9MX1);
        
        EntityHashTable hJFM7 = new EntityHashTable("JFM7", "ASACOHI");

        
        EntityHashTable v91092361 = new EntityHashTable("91092361", "HIPPODROME");
		hJFM7.children.addElement(v91092361);
       	

        this.children.addElement(hJFM7);
        
        EntityHashTable hB3M7 = new EntityHashTable("B3M7", "ASACOME");

        
        EntityHashTable v91092451 = new EntityHashTable("91092451", "MEDINA-COURA");
		hB3M7.children.addElement(v91092451);
       	

        this.children.addElement(hB3M7);
        
        EntityHashTable hNW63 = new EntityHashTable("NW63", "BENKADY");

        
        EntityHashTable v91092091 = new EntityHashTable("91092091", "BAKARIBOUGOU");
		hNW63.children.addElement(v91092091);
       	
        EntityHashTable v91092181 = new EntityHashTable("91092181", "BOUGOUBA");
		hNW63.children.addElement(v91092181);
       	
        EntityHashTable v91092811 = new EntityHashTable("91092811", "T-S-F");
		hNW63.children.addElement(v91092811);
       	

        this.children.addElement(hNW63);
        
        EntityHashTable hWAF0 = new EntityHashTable("WAF0", "BONIABA");

        
        EntityHashTable v91092631 = new EntityHashTable("91092631", "NIARELA");
		hWAF0.children.addElement(v91092631);
       	

        this.children.addElement(hWAF0);
        
        EntityHashTable h23B3 = new EntityHashTable("23B3", "ASACOMI");

        
        EntityHashTable v91092541 = new EntityHashTable("91092541", "MISSIRA");
		h23B3.children.addElement(v91092541);
       	

        this.children.addElement(h23B3);
        
        EntityHashTable hWYC7 = new EntityHashTable("WYC7", "ASACOQUIZ");

        
        EntityHashTable v91092721 = new EntityHashTable("91092721", "QUINZAMBOUGOU");
		hWYC7.children.addElement(v91092721);
       	

        this.children.addElement(hWYC7);
        
        EntityHashTable hJEZ5 = new EntityHashTable("JEZ5", "ASACOBAGAD");

        
        EntityHashTable v91092001 = new EntityHashTable("91092001", "BAGADADJI");
		hJEZ5.children.addElement(v91092001);
       	

        this.children.addElement(hJEZ5);
        
        EntityHashTable h25N8 = new EntityHashTable("25N8", "ASACONGOMI");

        

        this.children.addElement(h25N8);
        
        EntityHashTable hDX64 = new EntityHashTable("DX64", "ASACOGO");

        

        this.children.addElement(hDX64);
        
    }

}