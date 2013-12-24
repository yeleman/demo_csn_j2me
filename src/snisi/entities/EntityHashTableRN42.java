
package snisi.entities;

import java.util.Vector;

import snisi.entities.EntityHashTable;

/**
 * List of static codes and names for Entities/Locations
 * Automatically generated.
 */


public class EntityHashTableRN42 extends EntityHashTable {

    public EntityHashTableRN42() {
        this.code = "RN42";
        this.name = "KATI";
        this.children = new Vector();

        
        EntityHashTable hFS98 = new EntityHashTable("FS98", "KATI CSREF");

        

        this.children.addElement(hFS98);
        
        EntityHashTable hC4S5 = new EntityHashTable("C4S5", "ADEKEN");

        
        EntityHashTable v25029470 = new EntityHashTable("25029470", "KALABANCORO ADEKEN");
		hC4S5.children.addElement(v25029470);
       	

        this.children.addElement(hC4S5);
        
        EntityHashTable hCKB5 = new EntityHashTable("CKB5", "BAGUINEDA");

        
        EntityHashTable v25001001 = new EntityHashTable("25001001", "BAGUINEDA-CAMP");
		hCKB5.children.addElement(v25001001);
       	
        EntityHashTable v25001032 = new EntityHashTable("25001032", "BAGUINEDA-VILLAGE");
		hCKB5.children.addElement(v25001032);
       	
        EntityHashTable v25001063 = new EntityHashTable("25001063", "DICKO");
		hCKB5.children.addElement(v25001063);
       	
        EntityHashTable v25001156 = new EntityHashTable("25001156", "GNOGNAKORO");
		hCKB5.children.addElement(v25001156);
       	
        EntityHashTable v25001187 = new EntityHashTable("25001187", "GNOGNAN");
		hCKB5.children.addElement(v25001187);
       	
        EntityHashTable v25001218 = new EntityHashTable("25001218", "KAKABOUGOU");
		hCKB5.children.addElement(v25001218);
       	
        EntityHashTable v25001249 = new EntityHashTable("25001249", "KASSELA");
		hCKB5.children.addElement(v25001249);
       	
        EntityHashTable v25001280 = new EntityHashTable("25001280", "KOBALAKORO");
		hCKB5.children.addElement(v25001280);
       	
        EntityHashTable v25001342 = new EntityHashTable("25001342", "KOGNIMBA");
		hCKB5.children.addElement(v25001342);
       	
        EntityHashTable v25001404 = new EntityHashTable("25001404", "KOKOUM");
		hCKB5.children.addElement(v25001404);
       	
        EntityHashTable v25001466 = new EntityHashTable("25001466", "MOFA");
		hCKB5.children.addElement(v25001466);
       	
        EntityHashTable v25001497 = new EntityHashTable("25001497", "MOUNZOUN");
		hCKB5.children.addElement(v25001497);
       	
        EntityHashTable v25001590 = new EntityHashTable("25001590", "N'GONINKO");
		hCKB5.children.addElement(v25001590);
       	
        EntityHashTable v25001621 = new EntityHashTable("25001621", "N'TENEME");
		hCKB5.children.addElement(v25001621);
       	
        EntityHashTable v25001683 = new EntityHashTable("25001683", "SADIOUROUBOUGOU");
		hCKB5.children.addElement(v25001683);
       	
        EntityHashTable v25001714 = new EntityHashTable("25001714", "SEBELA");
		hCKB5.children.addElement(v25001714);
       	
        EntityHashTable v25001807 = new EntityHashTable("25001807", "SORO");
		hCKB5.children.addElement(v25001807);
       	
        EntityHashTable v25001838 = new EntityHashTable("25001838", "SOUNDOUGOUBA");
		hCKB5.children.addElement(v25001838);
       	
        EntityHashTable v25001962 = new EntityHashTable("25001962", "TIEMA");
		hCKB5.children.addElement(v25001962);
       	
        EntityHashTable v25001645 = new EntityHashTable("25001645", "DOUGOURA CORO");
		hCKB5.children.addElement(v25001645);
       	

        this.children.addElement(hCKB5);
        
        EntityHashTable h6SA0 = new EntityHashTable("6SA0", "BANCOUMANA");

        
        EntityHashTable v25003001 = new EntityHashTable("25003001", "BANCOUMANA");
		h6SA0.children.addElement(v25003001);
       	
        EntityHashTable v25003072 = new EntityHashTable("25003072", "DJIGUIDALA");
		h6SA0.children.addElement(v25003072);
       	
        EntityHashTable v25003143 = new EntityHashTable("25003143", "GONSOLO");
		h6SA0.children.addElement(v25003143);
       	
        EntityHashTable v25003214 = new EntityHashTable("25003214", "KENIEROBA");
		h6SA0.children.addElement(v25003214);
       	
        EntityHashTable v25003285 = new EntityHashTable("25003285", "KOLLE");
		h6SA0.children.addElement(v25003285);
       	
        EntityHashTable v25003356 = new EntityHashTable("25003356", "MADINA");
		h6SA0.children.addElement(v25003356);
       	
        EntityHashTable v25003427 = new EntityHashTable("25003427", "MISSIRA");
		h6SA0.children.addElement(v25003427);
       	
        EntityHashTable v25003498 = new EntityHashTable("25003498", "NANKILABOUGOU");
		h6SA0.children.addElement(v25003498);
       	
        EntityHashTable v25003569 = new EntityHashTable("25003569", "NIAGANABOUGOU");
		h6SA0.children.addElement(v25003569);
       	
        EntityHashTable v25003640 = new EntityHashTable("25003640", "NIAME");
		h6SA0.children.addElement(v25003640);
       	
        EntityHashTable v25003711 = new EntityHashTable("25003711", "OUORONINA");
		h6SA0.children.addElement(v25003711);
       	
        EntityHashTable v25003782 = new EntityHashTable("25003782", "SAMAKO");
		h6SA0.children.addElement(v25003782);
       	
        EntityHashTable v25003853 = new EntityHashTable("25003853", "TEMA");
		h6SA0.children.addElement(v25003853);
       	
        EntityHashTable v25003924 = new EntityHashTable("25003924", "TIEKO");
		h6SA0.children.addElement(v25003924);
       	

        this.children.addElement(h6SA0);
        
        EntityHashTable h3A31 = new EntityHashTable("3A31", "DABAN");

        
        EntityHashTable v25009100 = new EntityHashTable("25009100", "BOUALA");
		h3A31.children.addElement(v25009100);
       	
        EntityHashTable v25009199 = new EntityHashTable("25009199", "BOULOUKOU");
		h3A31.children.addElement(v25009199);
       	
        EntityHashTable v25009298 = new EntityHashTable("25009298", "DABAN");
		h3A31.children.addElement(v25009298);
       	
        EntityHashTable v25009397 = new EntityHashTable("25009397", "MARKADOUGOU-SIRAKORO");
		h3A31.children.addElement(v25009397);
       	
        EntityHashTable v25009496 = new EntityHashTable("25009496", "MONITOU");
		h3A31.children.addElement(v25009496);
       	
        EntityHashTable v25009595 = new EntityHashTable("25009595", "NTJIBA");
		h3A31.children.addElement(v25009595);
       	
        EntityHashTable v25009694 = new EntityHashTable("25009694", "SANKEBOUGOU");
		h3A31.children.addElement(v25009694);
       	
        EntityHashTable v25009793 = new EntityHashTable("25009793", "SIRAKORONI");
		h3A31.children.addElement(v25009793);
       	
        EntityHashTable v25009892 = new EntityHashTable("25009892", "TIESSAMABOUGOU");
		h3A31.children.addElement(v25009892);
       	

        this.children.addElement(h3A31);
        
        EntityHashTable hCHW4 = new EntityHashTable("CHW4", "DIAGO");

        
        EntityHashTable v25011001 = new EntityHashTable("25011001", "DIAGO");
		hCHW4.children.addElement(v25011001);
       	
        EntityHashTable v25011427 = new EntityHashTable("25011427", "N'GARA");
		hCHW4.children.addElement(v25011427);
       	
        EntityHashTable v25011569 = new EntityHashTable("25011569", "N'GORO");
		hCHW4.children.addElement(v25011569);
       	
        EntityHashTable v25011711 = new EntityHashTable("25011711", "SEGUETAMBOUGOU");
		hCHW4.children.addElement(v25011711);
       	

        this.children.addElement(hCHW4);
        
        EntityHashTable hA4W4 = new EntityHashTable("A4W4", "DIALAKORODJI");

        
        EntityHashTable v25015001 = new EntityHashTable("25015001", "DIALAKORODJI");
		hA4W4.children.addElement(v25015001);
       	
        EntityHashTable v25015667 = new EntityHashTable("25015667", "N'TEGUEDO-SAMASSEBOUGOU");
		hA4W4.children.addElement(v25015667);
       	
        EntityHashTable v25015284 = new EntityHashTable("25015284", "NTEGUEDO-SIRACORO");
		hA4W4.children.addElement(v25015284);
       	

        this.children.addElement(hA4W4);
        
        EntityHashTable h6EE3 = new EntityHashTable("6EE3", "DIO GARE");

        
        EntityHashTable v25019001 = new EntityHashTable("25019001", "DIFFEMOU");
		h6EE3.children.addElement(v25019001);
       	
        EntityHashTable v25019125 = new EntityHashTable("25019125", "DIO-GARE");
		h6EE3.children.addElement(v25019125);
       	
        EntityHashTable v25019249 = new EntityHashTable("25019249", "DIO-VILLAGE");
		h6EE3.children.addElement(v25019249);
       	
        EntityHashTable v25019373 = new EntityHashTable("25019373", "KALAZAN");
		h6EE3.children.addElement(v25019373);
       	
        EntityHashTable v25019621 = new EntityHashTable("25019621", "KOMI-KOMI");
		h6EE3.children.addElement(v25019621);
       	
        EntityHashTable v25019745 = new EntityHashTable("25019745", "MAGNAMBOUGOU");
		h6EE3.children.addElement(v25019745);
       	
        EntityHashTable v25019869 = new EntityHashTable("25019869", "SOTOLY");
		h6EE3.children.addElement(v25019869);
       	
        EntityHashTable v25019308 = new EntityHashTable("25019308", "KANABOUGOU");
		h6EE3.children.addElement(v25019308);
       	
        EntityHashTable v25019693 = new EntityHashTable("25019693", "KODOUGOU");
		h6EE3.children.addElement(v25019693);
       	
        EntityHashTable v25019614 = new EntityHashTable("25019614", "KOMINTAN");
		h6EE3.children.addElement(v25019614);
       	

        this.children.addElement(h6EE3);
        
        EntityHashTable hP6K2 = new EntityHashTable("P6K2", "DJOLIBA");

        
        EntityHashTable v25037001 = new EntityHashTable("25037001", "BALANDOUGOU");
		hP6K2.children.addElement(v25037001);
       	
        EntityHashTable v25037040 = new EntityHashTable("25037040", "DALAKANA");
		hP6K2.children.addElement(v25037040);
       	
        EntityHashTable v25037079 = new EntityHashTable("25037079", "DJOLIBA");
		hP6K2.children.addElement(v25037079);
       	
        EntityHashTable v25037274 = new EntityHashTable("25037274", "KAMALE SOBA");
		hP6K2.children.addElement(v25037274);
       	
        EntityHashTable v25037391 = new EntityHashTable("25037391", "KOURSALE");
		hP6K2.children.addElement(v25037391);
       	
        EntityHashTable v25037430 = new EntityHashTable("25037430", "KOURSALEKORO");
		hP6K2.children.addElement(v25037430);
       	
        EntityHashTable v25037469 = new EntityHashTable("25037469", "KRINA");
		hP6K2.children.addElement(v25037469);
       	
        EntityHashTable v25037508 = new EntityHashTable("25037508", "KRINA SOMONO");
		hP6K2.children.addElement(v25037508);
       	
        EntityHashTable v25037586 = new EntityHashTable("25037586", "NAFADJI");
		hP6K2.children.addElement(v25037586);
       	
        EntityHashTable v25037781 = new EntityHashTable("25037781", "SAMAGNANA");
		hP6K2.children.addElement(v25037781);
       	
        EntityHashTable v25037820 = new EntityHashTable("25037820", "SAMALE");
		hP6K2.children.addElement(v25037820);
       	
        EntityHashTable v25037937 = new EntityHashTable("25037937", "SAMAGNANA SOMONO");
		hP6K2.children.addElement(v25037937);
       	

        this.children.addElement(hP6K2);
        
        EntityHashTable h8948 = new EntityHashTable("8948", "DOGODOUMA");

        
        EntityHashTable v25021001 = new EntityHashTable("25021001", "DOGODOUMA");
		h8948.children.addElement(v25021001);
       	
        EntityHashTable v25021334 = new EntityHashTable("25021334", "N'GRINGOUME");
		h8948.children.addElement(v25021334);
       	
        EntityHashTable v25021314 = new EntityHashTable("25021314", "TALIKO II");
		h8948.children.addElement(v25021314);
       	

        this.children.addElement(h8948);
        
        EntityHashTable hAWS0 = new EntityHashTable("AWS0", "DOMBILA");

        
        EntityHashTable v25023001 = new EntityHashTable("25023001", "DJINIDIE");
		hAWS0.children.addElement(v25023001);
       	
        EntityHashTable v25023091 = new EntityHashTable("25023091", "DJININDJEBOUGOU");
		hAWS0.children.addElement(v25023091);
       	
        EntityHashTable v25023271 = new EntityHashTable("25023271", "HAWALA");
		hAWS0.children.addElement(v25023271);
       	
        EntityHashTable v25023451 = new EntityHashTable("25023451", "N'GALAMADIBI");
		hAWS0.children.addElement(v25023451);
       	
        EntityHashTable v25023541 = new EntityHashTable("25023541", "SANAMBA");
		hAWS0.children.addElement(v25023541);
       	
        EntityHashTable v25023631 = new EntityHashTable("25023631", "SIDIANKORO");
		hAWS0.children.addElement(v25023631);
       	
        EntityHashTable v25023721 = new EntityHashTable("25023721", "SONGO");
		hAWS0.children.addElement(v25023721);
       	
        EntityHashTable v25023811 = new EntityHashTable("25023811", "TOMBA");
		hAWS0.children.addElement(v25023811);
       	
        EntityHashTable v25023901 = new EntityHashTable("25023901", "TOULABOUGOU");
		hAWS0.children.addElement(v25023901);
       	
        EntityHashTable v25023185 = new EntityHashTable("25023185", "DOMBILA");
		hAWS0.children.addElement(v25023185);
       	
        EntityHashTable v25023377 = new EntityHashTable("25023377", "KODJALAN");
		hAWS0.children.addElement(v25023377);
       	
        EntityHashTable v25023143 = new EntityHashTable("25023143", "KOYAN");
		hAWS0.children.addElement(v25023143);
       	
        EntityHashTable v25023298 = new EntityHashTable("25023298", "CHETOU");
		hAWS0.children.addElement(v25023298);
       	

        this.children.addElement(hAWS0);
        
        EntityHashTable hKA86 = new EntityHashTable("KA86", "DOUBABOUGOU");

        
        EntityHashTable v25025001 = new EntityHashTable("25025001", "DOGOBA");
		hKA86.children.addElement(v25025001);
       	
        EntityHashTable v25025167 = new EntityHashTable("25025167", "DOUBABOUGOU");
		hKA86.children.addElement(v25025167);
       	
        EntityHashTable v25025333 = new EntityHashTable("25025333", "KENENKOUN");
		hKA86.children.addElement(v25025333);
       	
        EntityHashTable v25025503 = new EntityHashTable("25025503", "MAMARIBOUGOU");
		hKA86.children.addElement(v25025503);
       	
        EntityHashTable v25025831 = new EntityHashTable("25025831", "SIRADO");
		hKA86.children.addElement(v25025831);
       	
        EntityHashTable v25025294 = new EntityHashTable("25025294", "BOUALA");
		hKA86.children.addElement(v25025294);
       	
        EntityHashTable v25025172 = new EntityHashTable("25025172", "SIRABLO");
		hKA86.children.addElement(v25025172);
       	
        EntityHashTable v25025893 = new EntityHashTable("25025893", "NIANTIGUILA");
		hKA86.children.addElement(v25025893);
       	
        EntityHashTable v25025563 = new EntityHashTable("25025563", "ZAMBOUGOU");
		hKA86.children.addElement(v25025563);
       	

        this.children.addElement(hKA86);
        
        EntityHashTable hWHJ3 = new EntityHashTable("WHJ3", "FALADIE");

        
        EntityHashTable v25051001 = new EntityHashTable("25051001", "BANCOUMAN 1");
		hWHJ3.children.addElement(v25051001);
       	
        EntityHashTable v25051053 = new EntityHashTable("25051053", "BANCOUMAN 2");
		hWHJ3.children.addElement(v25051053);
       	
        EntityHashTable v25051105 = new EntityHashTable("25051105", "BASSABOUGOU");
		hWHJ3.children.addElement(v25051105);
       	
        EntityHashTable v25051157 = new EntityHashTable("25051157", "BOUMOUNDO");
		hWHJ3.children.addElement(v25051157);
       	
        EntityHashTable v25051209 = new EntityHashTable("25051209", "DJIBROULA");
		hWHJ3.children.addElement(v25051209);
       	
        EntityHashTable v25051216 = new EntityHashTable("25051216", "N'TIOBOUGOU");
		hWHJ3.children.addElement(v25051216);
       	
        EntityHashTable v25051261 = new EntityHashTable("25051261", "DJIDIANA");
		hWHJ3.children.addElement(v25051261);
       	
        EntityHashTable v25051313 = new EntityHashTable("25051313", "DJISSOUMALE");
		hWHJ3.children.addElement(v25051313);
       	
        EntityHashTable v25051365 = new EntityHashTable("25051365", "DOMBILA");
		hWHJ3.children.addElement(v25051365);
       	
        EntityHashTable v25051417 = new EntityHashTable("25051417", "FALADIE");
		hWHJ3.children.addElement(v25051417);
       	
        EntityHashTable v25051521 = new EntityHashTable("25051521", "KONKOU-ZAMBOUGOU");
		hWHJ3.children.addElement(v25051521);
       	
        EntityHashTable v25051625 = new EntityHashTable("25051625", "M'PIEBOUGOU");
		hWHJ3.children.addElement(v25051625);
       	
        EntityHashTable v25051677 = new EntityHashTable("25051677", "NEGUEBABOUGOU-DABAN");
		hWHJ3.children.addElement(v25051677);
       	
        EntityHashTable v25051781 = new EntityHashTable("25051781", "N'TEGUEDO");
		hWHJ3.children.addElement(v25051781);
       	
        EntityHashTable v25051833 = new EntityHashTable("25051833", "SANANCO");
		hWHJ3.children.addElement(v25051833);
       	
        EntityHashTable v25051885 = new EntityHashTable("25051885", "SIRANIDOULOU");
		hWHJ3.children.addElement(v25051885);
       	
        EntityHashTable v25051937 = new EntityHashTable("25051937", "SOGNEBOUGOU");
		hWHJ3.children.addElement(v25051937);
       	
        EntityHashTable v25051574 = new EntityHashTable("25051574", "MAMARIBOUGOU");
		hWHJ3.children.addElement(v25051574);
       	
        EntityHashTable v25051091 = new EntityHashTable("25051091", "BAYABOUGOU");
		hWHJ3.children.addElement(v25051091);
       	
        EntityHashTable v25051424 = new EntityHashTable("25051424", "DJIDJE");
		hWHJ3.children.addElement(v25051424);
       	

        this.children.addElement(hWHJ3);
        
        EntityHashTable h2751 = new EntityHashTable("2751", "FALANI");

        
        EntityHashTable v25041125 = new EntityHashTable("25041125", "DARANI");
		h2751.children.addElement(v25041125);
       	
        EntityHashTable v25041249 = new EntityHashTable("25041249", "FALAKO DARANI");
		h2751.children.addElement(v25041249);
       	
        EntityHashTable v25041311 = new EntityHashTable("25041311", "FALANI");
		h2751.children.addElement(v25041311);
       	
        EntityHashTable v25041497 = new EntityHashTable("25041497", "KOGNI-CORO");
		h2751.children.addElement(v25041497);
       	
        EntityHashTable v25041559 = new EntityHashTable("25041559", "KOUNGODIAN");
		h2751.children.addElement(v25041559);
       	
        EntityHashTable v25041807 = new EntityHashTable("25041807", "SEBELACORO");
		h2751.children.addElement(v25041807);
       	
        EntityHashTable v25041931 = new EntityHashTable("25041931", "TIENE");
		h2751.children.addElement(v25041931);
       	
        EntityHashTable v25041800 = new EntityHashTable("25041800", "KOLIMBA");
		h2751.children.addElement(v25041800);
       	

        this.children.addElement(h2751);
        
        EntityHashTable hAT79 = new EntityHashTable("AT79", "FARABANA");

        

        this.children.addElement(hAT79);
        
        EntityHashTable h6XH3 = new EntityHashTable("6XH3", "FARADA");

        
        EntityHashTable v25043799 = new EntityHashTable("25043799", "FARADA");
		h6XH3.children.addElement(v25043799);
       	
        EntityHashTable v25043622 = new EntityHashTable("25043622", "KAMBILA");
		h6XH3.children.addElement(v25043622);
       	
        EntityHashTable v25043067 = new EntityHashTable("25043067", "FANAFIÈCORO");
		h6XH3.children.addElement(v25043067);
       	
        EntityHashTable v25043389 = new EntityHashTable("25043389", "DIANÉGUÉBOUGOUDIAGO");
		h6XH3.children.addElement(v25043389);
       	

        this.children.addElement(h6XH3);
        
        EntityHashTable hP567 = new EntityHashTable("P567", "KABALABOUGOU");

        
        EntityHashTable v25037157 = new EntityHashTable("25037157", "FARABANA");
		hP567.children.addElement(v25037157);
       	
        EntityHashTable v25037196 = new EntityHashTable("25037196", "KABALABOUGOU");
		hP567.children.addElement(v25037196);
       	
        EntityHashTable v25037352 = new EntityHashTable("25037352", "KATIBOUGOU");
		hP567.children.addElement(v25037352);
       	
        EntityHashTable v25037742 = new EntityHashTable("25037742", "OUENZZINDOUGOU");
		hP567.children.addElement(v25037742);
       	
        EntityHashTable v25037859 = new EntityHashTable("25037859", "SAMANKO PLANTANTION");
		hP567.children.addElement(v25037859);
       	
        EntityHashTable v25037898 = new EntityHashTable("25037898", "SAMAYA");
		hP567.children.addElement(v25037898);
       	
        EntityHashTable v25037976 = new EntityHashTable("25037976", "TOROKOROBOUGOU");
		hP567.children.addElement(v25037976);
       	

        this.children.addElement(hP567);
        
        EntityHashTable hK638 = new EntityHashTable("K638", "KALIFABOUGOU");

        
        EntityHashTable v25031001 = new EntityHashTable("25031001", "BANTJIY");
		hK638.children.addElement(v25031001);
       	
        EntityHashTable v25031167 = new EntityHashTable("25031167", "DJINIDJELA");
		hK638.children.addElement(v25031167);
       	
        EntityHashTable v25031250 = new EntityHashTable("25031250", "DOUNGAN");
		hK638.children.addElement(v25031250);
       	
        EntityHashTable v25031333 = new EntityHashTable("25031333", "FANSIRA-DIEROBOUGOU");
		hK638.children.addElement(v25031333);
       	
        EntityHashTable v25031416 = new EntityHashTable("25031416", "KABABOUGOU");
		hK638.children.addElement(v25031416);
       	
        EntityHashTable v25031499 = new EntityHashTable("25031499", "KALIFABOUGOU");
		hK638.children.addElement(v25031499);
       	
        EntityHashTable v25031505 = new EntityHashTable("25031505", "DJELIBOUGOU");
		hK638.children.addElement(v25031505);
       	
        EntityHashTable v25031582 = new EntityHashTable("25031582", "MANGOLA");
		hK638.children.addElement(v25031582);
       	
        EntityHashTable v25031665 = new EntityHashTable("25031665", "NIAMANA");
		hK638.children.addElement(v25031665);
       	
        EntityHashTable v25031748 = new EntityHashTable("25031748", "N'GOLOBOUGOU");
		hK638.children.addElement(v25031748);
       	
        EntityHashTable v25031831 = new EntityHashTable("25031831", "OUASSOROLA");
		hK638.children.addElement(v25031831);
       	
        EntityHashTable v25031914 = new EntityHashTable("25031914", "TIESSEBOUGOU");
		hK638.children.addElement(v25031914);
       	
        EntityHashTable v25031678 = new EntityHashTable("25031678", "WESSAMABOUGOU");
		hK638.children.addElement(v25031678);
       	
        EntityHashTable v25031026 = new EntityHashTable("25031026", "SANANFALANI");
		hK638.children.addElement(v25031026);
       	
        EntityHashTable v25031709 = new EntityHashTable("25031709", "MINDJOUROU");
		hK638.children.addElement(v25031709);
       	
        EntityHashTable v25031389 = new EntityHashTable("25031389", "BASSIBOUGOU-SIKORO");
		hK638.children.addElement(v25031389);
       	

        this.children.addElement(hK638);
        
        EntityHashTable hBBB4 = new EntityHashTable("BBB4", "KANADJIGUILA");

        
        EntityHashTable v25037118 = new EntityHashTable("25037118", "FARABA");
		hBBB4.children.addElement(v25037118);
       	
        EntityHashTable v25037547 = new EntityHashTable("25037547", "MAMARIBOUGOU");
		hBBB4.children.addElement(v25037547);
       	
        EntityHashTable v25037625 = new EntityHashTable("25037625", "N'TANFAFA");
		hBBB4.children.addElement(v25037625);
       	
        EntityHashTable v25037703 = new EntityHashTable("25037703", "N'TEGUEDO-NIONFARA");
		hBBB4.children.addElement(v25037703);
       	
        EntityHashTable v25037247 = new EntityHashTable("25037247", "KANADJIGUILA");
		hBBB4.children.addElement(v25037247);
       	

        this.children.addElement(hBBB4);
        
        EntityHashTable h4R83 = new EntityHashTable("4R83", "KATI COCO");

        
        EntityHashTable v25091046 = new EntityHashTable("25091046", "BANAMBANI");
		h4R83.children.addElement(v25091046);
       	
        EntityHashTable v25091361 = new EntityHashTable("25091361", "KOKO");
		h4R83.children.addElement(v25091361);
       	
        EntityHashTable v25091856 = new EntityHashTable("25091856", "TOUBANA");
		h4R83.children.addElement(v25091856);
       	
        EntityHashTable v25091039 = new EntityHashTable("25091039", "DONEGUEBOUGOU");
		h4R83.children.addElement(v25091039);
       	

        this.children.addElement(h4R83);
        
        EntityHashTable h8MX1 = new EntityHashTable("8MX1", "MALIBOUGOU");

        
        EntityHashTable v25023542 = new EntityHashTable("25023542", "SEBENIKORO");
		h8MX1.children.addElement(v25023542);
       	
        EntityHashTable v25033331 = new EntityHashTable("25033331", "KONOBOUGOU");
		h8MX1.children.addElement(v25033331);
       	
        EntityHashTable v25033397 = new EntityHashTable("25033397", "MAKONO");
		h8MX1.children.addElement(v25033397);
       	
        EntityHashTable v25033463 = new EntityHashTable("25033463", "M'PIEBOUGOU");
		h8MX1.children.addElement(v25033463);
       	
        EntityHashTable v25033595 = new EntityHashTable("25033595", "NTONINBA");
		h8MX1.children.addElement(v25033595);
       	
        EntityHashTable v25033727 = new EntityHashTable("25033727", "OUADOUGOU-SIKORO");
		h8MX1.children.addElement(v25033727);
       	

        this.children.addElement(h8MX1);
        
        EntityHashTable hPDE9 = new EntityHashTable("PDE9", "MORIBABOUGOU");

        
        EntityHashTable v25039001 = new EntityHashTable("25039001", "DOGOBALA");
		hPDE9.children.addElement(v25039001);
       	
        EntityHashTable v25039334 = new EntityHashTable("25039334", "MORIBABOUGOU");
		hPDE9.children.addElement(v25039334);
       	
        EntityHashTable v25039667 = new EntityHashTable("25039667", "SOULEYMANEBOUGOU");
		hPDE9.children.addElement(v25039667);
       	
        EntityHashTable v25039944 = new EntityHashTable("25039944", "SIKOULOU");
		hPDE9.children.addElement(v25039944);
       	
        EntityHashTable v25039912 = new EntityHashTable("25039912", "FOMBABOUGOU");
		hPDE9.children.addElement(v25039912);
       	

        this.children.addElement(hPDE9);
        
        EntityHashTable h72G2 = new EntityHashTable("72G2", "MOUNTOUGOULA");

        
        EntityHashTable v25041001 = new EntityHashTable("25041001", "BANDOUGOU");
		h72G2.children.addElement(v25041001);
       	
        EntityHashTable v25041063 = new EntityHashTable("25041063", "DARA");
		h72G2.children.addElement(v25041063);
       	
        EntityHashTable v25041373 = new EntityHashTable("25041373", "FARADALLA");
		h72G2.children.addElement(v25041373);
       	
        EntityHashTable v25041435 = new EntityHashTable("25041435", "FARACORO-MOUNTOUGOULA");
		h72G2.children.addElement(v25041435);
       	
        EntityHashTable v25041621 = new EntityHashTable("25041621", "MANACORONI");
		h72G2.children.addElement(v25041621);
       	
        EntityHashTable v25041683 = new EntityHashTable("25041683", "MOUNTOUGOULA");
		h72G2.children.addElement(v25041683);
       	
        EntityHashTable v25041745 = new EntityHashTable("25041745", "SANANKOROBOUGOU");
		h72G2.children.addElement(v25041745);
       	
        EntityHashTable v25041869 = new EntityHashTable("25041869", "TANGALA");
		h72G2.children.addElement(v25041869);
       	

        this.children.addElement(h72G2);
        
        EntityHashTable h6DM2 = new EntityHashTable("6DM2", "NANA KENIEBA");

        
        EntityHashTable v25063142 = new EntityHashTable("25063142", "FARAGUERO");
		h6DM2.children.addElement(v25063142);
       	
        EntityHashTable v25063283 = new EntityHashTable("25063283", "KALAGUE");
		h6DM2.children.addElement(v25063283);
       	
        EntityHashTable v25063424 = new EntityHashTable("25063424", "KARAMOKOLA");
		h6DM2.children.addElement(v25063424);
       	
        EntityHashTable v25063471 = new EntityHashTable("25063471", "KENIERO");
		h6DM2.children.addElement(v25063471);
       	
        EntityHashTable v25063518 = new EntityHashTable("25063518", "KOMAFARA");
		h6DM2.children.addElement(v25063518);
       	
        EntityHashTable v25063659 = new EntityHashTable("25063659", "NANA-KENEIBA");
		h6DM2.children.addElement(v25063659);
       	
        EntityHashTable v25063753 = new EntityHashTable("25063753", "SAGUELE");
		h6DM2.children.addElement(v25063753);
       	

        this.children.addElement(h6DM2);
        
        EntityHashTable h57G7 = new EntityHashTable("57G7", "NEGUELA");

        
        EntityHashTable v25005001 = new EntityHashTable("25005001", "BANCO");
		h57G7.children.addElement(v25005001);
       	
        EntityHashTable v25005059 = new EntityHashTable("25005059", "DIALAKORO");
		h57G7.children.addElement(v25005059);
       	
        EntityHashTable v25005235 = new EntityHashTable("25005235", "NIALENKO");
		h57G7.children.addElement(v25005235);
       	
        EntityHashTable v25005291 = new EntityHashTable("25005291", "KOULIKORONI");
		h57G7.children.addElement(v25005291);
       	
        EntityHashTable v25005349 = new EntityHashTable("25005349", "LEMOUROUSAN-SAN");
		h57G7.children.addElement(v25005349);
       	
        EntityHashTable v25005465 = new EntityHashTable("25005465", "MARICO 2");
		h57G7.children.addElement(v25005465);
       	
        EntityHashTable v25005523 = new EntityHashTable("25005523", "NEGUEBABOUGOU BOSSOFALA");
		h57G7.children.addElement(v25005523);
       	
        EntityHashTable v25005581 = new EntityHashTable("25005581", "NEGUELA");
		h57G7.children.addElement(v25005581);
       	
        EntityHashTable v25005639 = new EntityHashTable("25005639", "NEGUELABOUGOU");
		h57G7.children.addElement(v25005639);
       	
        EntityHashTable v25005755 = new EntityHashTable("25005755", "OUOLONI");
		h57G7.children.addElement(v25005755);
       	
        EntityHashTable v25005813 = new EntityHashTable("25005813", "SAMAN");
		h57G7.children.addElement(v25005813);
       	
        EntityHashTable v25005871 = new EntityHashTable("25005871", "SIELLE (SAMBO)");
		h57G7.children.addElement(v25005871);
       	
        EntityHashTable v25005117 = new EntityHashTable("25005117", "DJININA");
		h57G7.children.addElement(v25005117);
       	
        EntityHashTable v25005407 = new EntityHashTable("25005407", "MARICO 1");
		h57G7.children.addElement(v25005407);
       	
        EntityHashTable v25005221 = new EntityHashTable("25005221", "NOUMOUBOUGOU");
		h57G7.children.addElement(v25005221);
       	
        EntityHashTable v25005797 = new EntityHashTable("25005797", "GANGANA");
		h57G7.children.addElement(v25005797);
       	

        this.children.addElement(h57G7);
        
        EntityHashTable hAAX1 = new EntityHashTable("AAX1", "NGABACORO");

        
        EntityHashTable v25047001 = new EntityHashTable("25047001", "DJINKONI");
		hAAX1.children.addElement(v25047001);
       	
        EntityHashTable v25047143 = new EntityHashTable("25047143", "MOUNOUMOUNOUBA");
		hAAX1.children.addElement(v25047143);
       	
        EntityHashTable v25047285 = new EntityHashTable("25047285", "N'GABACORO DROIT");
		hAAX1.children.addElement(v25047285);
       	
        EntityHashTable v25047427 = new EntityHashTable("25047427", "SALLA");
		hAAX1.children.addElement(v25047427);
       	
        EntityHashTable v25047853 = new EntityHashTable("25047853", "TITIBOUGOU");
		hAAX1.children.addElement(v25047853);
       	
        EntityHashTable v25047591 = new EntityHashTable("25047591", "BANDIOUGOUBOUGOU");
		hAAX1.children.addElement(v25047591);
       	
        EntityHashTable v25047291 = new EntityHashTable("25047291", "SOLOKONO");
		hAAX1.children.addElement(v25047291);
       	

        this.children.addElement(hAAX1);
        
        EntityHashTable hY862 = new EntityHashTable("Y862", "NGOURABA");

        
        EntityHashTable v25049001 = new EntityHashTable("25049001", "BANCOUMANA");
		hY862.children.addElement(v25049001);
       	
        EntityHashTable v25049077 = new EntityHashTable("25049077", "BASSIAN");
		hY862.children.addElement(v25049077);
       	
        EntityHashTable v25049153 = new EntityHashTable("25049153", "BINI");
		hY862.children.addElement(v25049153);
       	
        EntityHashTable v25049229 = new EntityHashTable("25049229", "DIANIKORO");
		hY862.children.addElement(v25049229);
       	
        EntityHashTable v25049305 = new EntityHashTable("25049305", "DIBAN");
		hY862.children.addElement(v25049305);
       	
        EntityHashTable v25049381 = new EntityHashTable("25049381", "DIONON COBLEN");
		hY862.children.addElement(v25049381);
       	
        EntityHashTable v25049383 = new EntityHashTable("25049383", "MOGOYAKOUNGO");
		hY862.children.addElement(v25049383);
       	
        EntityHashTable v25049457 = new EntityHashTable("25049457", "FARISSOUMANA");
		hY862.children.addElement(v25049457);
       	
        EntityHashTable v25049533 = new EntityHashTable("25049533", "KINSIKA");
		hY862.children.addElement(v25049533);
       	
        EntityHashTable v25049609 = new EntityHashTable("25049609", "KONI");
		hY862.children.addElement(v25049609);
       	
        EntityHashTable v25049761 = new EntityHashTable("25049761", "NIOKO");
		hY862.children.addElement(v25049761);
       	
        EntityHashTable v25049837 = new EntityHashTable("25049837", "N'GOURABA");
		hY862.children.addElement(v25049837);
       	
        EntityHashTable v25049913 = new EntityHashTable("25049913", "SOUNI");
		hY862.children.addElement(v25049913);
       	

        this.children.addElement(hY862);
        
        EntityHashTable hWWC9 = new EntityHashTable("WWC9", "NIOUMA MAKANA");

        
        EntityHashTable v25045001 = new EntityHashTable("25045001", "DAMBALA-MAKADIANA");
		hWWC9.children.addElement(v25045001);
       	
        EntityHashTable v25045100 = new EntityHashTable("25045100", "KENIEBA KOUTA");
		hWWC9.children.addElement(v25045100);
       	
        EntityHashTable v25045199 = new EntityHashTable("25045199", "KOLENA");
		hWWC9.children.addElement(v25045199);
       	
        EntityHashTable v25045298 = new EntityHashTable("25045298", "LABATA");
		hWWC9.children.addElement(v25045298);
       	
        EntityHashTable v25045496 = new EntityHashTable("25045496", "MOMONDO");
		hWWC9.children.addElement(v25045496);
       	
        EntityHashTable v25045595 = new EntityHashTable("25045595", "NIAMOU");
		hWWC9.children.addElement(v25045595);
       	
        EntityHashTable v25045694 = new EntityHashTable("25045694", "NIOUMALA");
		hWWC9.children.addElement(v25045694);
       	
        EntityHashTable v25045793 = new EntityHashTable("25045793", "NIOUMA-MAKANA");
		hWWC9.children.addElement(v25045793);
       	
        EntityHashTable v25045892 = new EntityHashTable("25045892", "SOROKORO");
		hWWC9.children.addElement(v25045892);
       	

        this.children.addElement(hWWC9);
        
        EntityHashTable hXSS0 = new EntityHashTable("XSS0", "SAFO");

        
        EntityHashTable v25055001 = new EntityHashTable("25055001", "CHODO");
		hXSS0.children.addElement(v25055001);
       	
        EntityHashTable v25055072 = new EntityHashTable("25055072", "DABANI");
		hXSS0.children.addElement(v25055072);
       	
        EntityHashTable v25055143 = new EntityHashTable("25055143", "DOGNOUMANA");
		hXSS0.children.addElement(v25055143);
       	
        EntityHashTable v25055285 = new EntityHashTable("25055285", "FALAYAN");
		hXSS0.children.addElement(v25055285);
       	
        EntityHashTable v25055356 = new EntityHashTable("25055356", "KODIALANI");
		hXSS0.children.addElement(v25055356);
       	
        EntityHashTable v25055427 = new EntityHashTable("25055427", "KOLA");
		hXSS0.children.addElement(v25055427);
       	
        EntityHashTable v25055498 = new EntityHashTable("25055498", "SAFO");
		hXSS0.children.addElement(v25055498);
       	
        EntityHashTable v25055569 = new EntityHashTable("25055569", "SAMABOUGOU (SOMABOUGOU)");
		hXSS0.children.addElement(v25055569);
       	
        EntityHashTable v25055640 = new EntityHashTable("25055640", "SERIWALA");
		hXSS0.children.addElement(v25055640);
       	
        EntityHashTable v25055711 = new EntityHashTable("25055711", "SIRABABOUGOU");
		hXSS0.children.addElement(v25055711);
       	
        EntityHashTable v25055782 = new EntityHashTable("25055782", "TASSAN");
		hXSS0.children.addElement(v25055782);
       	
        EntityHashTable v25055853 = new EntityHashTable("25055853", "TORODO-SAFO");
		hXSS0.children.addElement(v25055853);
       	
        EntityHashTable v25055924 = new EntityHashTable("25055924", "ZOROKORO");
		hXSS0.children.addElement(v25055924);
       	

        this.children.addElement(hXSS0);
        
        EntityHashTable hKJD4 = new EntityHashTable("KJD4", "SANANFARA");

        
        EntityHashTable v25091001 = new EntityHashTable("25091001", "CAMP-MILITAIRE");
		hKJD4.children.addElement(v25091001);
       	
        EntityHashTable v25091811 = new EntityHashTable("25091811", "SANANFARA");
		hKJD4.children.addElement(v25091811);
       	
        EntityHashTable v25091878 = new EntityHashTable("25091878", "SIRAKORO-NIARE");
		hKJD4.children.addElement(v25091878);
       	

        this.children.addElement(hKJD4);
        
        EntityHashTable hA620 = new EntityHashTable("A620", "SANANKOROBA");

        
        EntityHashTable v25059039 = new EntityHashTable("25059039", "BANANKORO");
		hA620.children.addElement(v25059039);
       	
        EntityHashTable v25059153 = new EntityHashTable("25059153", "DIGATO");
		hA620.children.addElement(v25059153);
       	
        EntityHashTable v25059191 = new EntityHashTable("25059191", "FALANI-COUNGO");
		hA620.children.addElement(v25059191);
       	
        EntityHashTable v25059229 = new EntityHashTable("25059229", "KABE");
		hA620.children.addElement(v25059229);
       	
        EntityHashTable v25059267 = new EntityHashTable("25059267", "KONIOBLA");
		hA620.children.addElement(v25059267);
       	
        EntityHashTable v25059343 = new EntityHashTable("25059343", "NIAGNAN");
		hA620.children.addElement(v25059343);
       	
        EntityHashTable v25059381 = new EntityHashTable("25059381", "NIANFALA");
		hA620.children.addElement(v25059381);
       	
        EntityHashTable v25059495 = new EntityHashTable("25059495", "N'TABACORO");
		hA620.children.addElement(v25059495);
       	
        EntityHashTable v25059533 = new EntityHashTable("25059533", "SANANKOROBA");
		hA620.children.addElement(v25059533);
       	
        EntityHashTable v25059571 = new EntityHashTable("25059571", "SATINEBOUGOU");
		hA620.children.addElement(v25059571);
       	
        EntityHashTable v25059609 = new EntityHashTable("25059609", "SICORO");
		hA620.children.addElement(v25059609);
       	
        EntityHashTable v25059647 = new EntityHashTable("25059647", "SIENE");
		hA620.children.addElement(v25059647);
       	
        EntityHashTable v25059685 = new EntityHashTable("25059685", "SINSINA");
		hA620.children.addElement(v25059685);
       	
        EntityHashTable v25059761 = new EntityHashTable("25059761", "TADIANA");
		hA620.children.addElement(v25059761);
       	
        EntityHashTable v25059799 = new EntityHashTable("25059799", "TADIANABOUGOU");
		hA620.children.addElement(v25059799);
       	
        EntityHashTable v25059837 = new EntityHashTable("25059837", "TAMALA");
		hA620.children.addElement(v25059837);
       	
        EntityHashTable v25059875 = new EntityHashTable("25059875", "TOURELA");
		hA620.children.addElement(v25059875);
       	
        EntityHashTable v25059913 = new EntityHashTable("25059913", "TOYA (TOYAN)");
		hA620.children.addElement(v25059913);
       	
        EntityHashTable v25059951 = new EntityHashTable("25059951", "ZOUGOUME");
		hA620.children.addElement(v25059951);
       	

        this.children.addElement(hA620);
        
        EntityHashTable hY833 = new EntityHashTable("Y833", "SANDAMA");

        
        EntityHashTable v25065100 = new EntityHashTable("25065100", "BEDEYA");
		hY833.children.addElement(v25065100);
       	
        EntityHashTable v25065199 = new EntityHashTable("25065199", "GOLO");
		hY833.children.addElement(v25065199);
       	
        EntityHashTable v25065298 = new EntityHashTable("25065298", "KAMALE");
		hY833.children.addElement(v25065298);
       	
        EntityHashTable v25065397 = new EntityHashTable("25065397", "LOUKOU");
		hY833.children.addElement(v25065397);
       	
        EntityHashTable v25065496 = new EntityHashTable("25065496", "MASSAKOLOMA");
		hY833.children.addElement(v25065496);
       	
        EntityHashTable v25065497 = new EntityHashTable("25065497", "BARAKOURO");
		hY833.children.addElement(v25065497);
       	
        EntityHashTable v25065595 = new EntityHashTable("25065595", "NAFADJI");
		hY833.children.addElement(v25065595);
       	
        EntityHashTable v25065694 = new EntityHashTable("25065694", "SAKORODABA");
		hY833.children.addElement(v25065694);
       	
        EntityHashTable v25065793 = new EntityHashTable("25065793", "SANDAMA");
		hY833.children.addElement(v25065793);
       	
        EntityHashTable v25065892 = new EntityHashTable("25065892", "TAMBALE");
		hY833.children.addElement(v25065892);
       	

        this.children.addElement(hY833);
        
        EntityHashTable h3SD0 = new EntityHashTable("3SD0", "SIBY");

        
        EntityHashTable v25063001 = new EntityHashTable("25063001", "DJELIBANI");
		h3SD0.children.addElement(v25063001);
       	
        EntityHashTable v25063048 = new EntityHashTable("25063048", "DIOULAFONDO");
		h3SD0.children.addElement(v25063048);
       	
        EntityHashTable v25063095 = new EntityHashTable("25063095", "DOGORO");
		h3SD0.children.addElement(v25063095);
       	
        EntityHashTable v25063189 = new EntityHashTable("25063189", "GUENA");
		h3SD0.children.addElement(v25063189);
       	
        EntityHashTable v25063236 = new EntityHashTable("25063236", "KAKA");
		h3SD0.children.addElement(v25063236);
       	
        EntityHashTable v25063330 = new EntityHashTable("25063330", "KALASSA");
		h3SD0.children.addElement(v25063330);
       	
        EntityHashTable v25063377 = new EntityHashTable("25063377", "KALAYA");
		h3SD0.children.addElement(v25063377);
       	
        EntityHashTable v25063565 = new EntityHashTable("25063565", "KONGOLA");
		h3SD0.children.addElement(v25063565);
       	
        EntityHashTable v25063612 = new EntityHashTable("25063612", "MAKANDIANA");
		h3SD0.children.addElement(v25063612);
       	
        EntityHashTable v25063706 = new EntityHashTable("25063706", "NIAMBALI (NIAMBALY)");
		h3SD0.children.addElement(v25063706);
       	
        EntityHashTable v25063800 = new EntityHashTable("25063800", "SELENKEGNY");
		h3SD0.children.addElement(v25063800);
       	
        EntityHashTable v25063847 = new EntityHashTable("25063847", "SIBY");
		h3SD0.children.addElement(v25063847);
       	
        EntityHashTable v25063894 = new EntityHashTable("25063894", "TABOU");
		h3SD0.children.addElement(v25063894);
       	
        EntityHashTable v25063941 = new EntityHashTable("25063941", "TENEYA");
		h3SD0.children.addElement(v25063941);
       	
        EntityHashTable v25063968 = new EntityHashTable("25063968", "KAMALE-KAKELE");
		h3SD0.children.addElement(v25063968);
       	

        this.children.addElement(h3SD0);
        
        EntityHashTable hDH60 = new EntityHashTable("DH60", "SONIKEGNY");

        
        EntityHashTable v25033001 = new EntityHashTable("25033001", "BEMASSO");
		hDH60.children.addElement(v25033001);
       	
        EntityHashTable v25033067 = new EntityHashTable("25033067", "DIANEGUEBOUGOU-SAFO");
		hDH60.children.addElement(v25033067);
       	
        EntityHashTable v25033199 = new EntityHashTable("25033199", "FANAFIE-COURA");
		hDH60.children.addElement(v25033199);
       	
        EntityHashTable v25033529 = new EntityHashTable("25033529", "NOUMOUBOUGOU");
		hDH60.children.addElement(v25033529);
       	
        EntityHashTable v25033661 = new EntityHashTable("25033661", "N'GORONGODJI");
		hDH60.children.addElement(v25033661);
       	
        EntityHashTable v25033793 = new EntityHashTable("25033793", "SICOROBOUGOU");
		hDH60.children.addElement(v25033793);
       	
        EntityHashTable v25033859 = new EntityHashTable("25033859", "SONIKEGNY");
		hDH60.children.addElement(v25033859);
       	
        EntityHashTable v25033925 = new EntityHashTable("25033925", "TIENEGUEBOUGOU");
		hDH60.children.addElement(v25033925);
       	
        EntityHashTable v25033801 = new EntityHashTable("25033801", "TILEKOUMOUNI");
		hDH60.children.addElement(v25033801);
       	
        EntityHashTable v25033537 = new EntityHashTable("25033537", "TILEBOUABOUGOU");
		hDH60.children.addElement(v25033537);
       	
        EntityHashTable v25033440 = new EntityHashTable("25033440", "SANKA");
		hDH60.children.addElement(v25033440);
       	

        this.children.addElement(hDH60);
        
        EntityHashTable hEDB2 = new EntityHashTable("EDB2", "TANIMA");

        
        EntityHashTable v25001125 = new EntityHashTable("25001125", "FARAKAN");
		hEDB2.children.addElement(v25001125);
       	
        EntityHashTable v25001435 = new EntityHashTable("25001435", "MASSACONI");
		hEDB2.children.addElement(v25001435);
       	
        EntityHashTable v25001528 = new EntityHashTable("25001528", "NEGNELE");
		hEDB2.children.addElement(v25001528);
       	
        EntityHashTable v25001652 = new EntityHashTable("25001652", "PALASSO");
		hEDB2.children.addElement(v25001652);
       	
        EntityHashTable v25001745 = new EntityHashTable("25001745", "SINCORO-COURA");
		hEDB2.children.addElement(v25001745);
       	
        EntityHashTable v25001776 = new EntityHashTable("25001776", "SINCORO-CORO");
		hEDB2.children.addElement(v25001776);
       	
        EntityHashTable v25001869 = new EntityHashTable("25001869", "TANIMA");
		hEDB2.children.addElement(v25001869);
       	
        EntityHashTable v25001900 = new EntityHashTable("25001900", "TANTEACORO");
		hEDB2.children.addElement(v25001900);
       	

        this.children.addElement(hEDB2);
        
        EntityHashTable hMYW5 = new EntityHashTable("MYW5", "TORODO");

        
        EntityHashTable v25017001 = new EntityHashTable("25017001", "BAMABOUGOU");
		hMYW5.children.addElement(v25017001);
       	
        EntityHashTable v25017063 = new EntityHashTable("25017063", "BANANKORO");
		hMYW5.children.addElement(v25017063);
       	
        EntityHashTable v25017125 = new EntityHashTable("25017125", "BORO");
		hMYW5.children.addElement(v25017125);
       	
        EntityHashTable v25017187 = new EntityHashTable("25017187", "BOURAKEBOUGOU");
		hMYW5.children.addElement(v25017187);
       	
        EntityHashTable v25017249 = new EntityHashTable("25017249", "DJEFALE");
		hMYW5.children.addElement(v25017249);
       	
        EntityHashTable v25017311 = new EntityHashTable("25017311", "KOUNTOU");
		hMYW5.children.addElement(v25017311);
       	
        EntityHashTable v25017373 = new EntityHashTable("25017373", "MORIBOUGOUCORO");
		hMYW5.children.addElement(v25017373);
       	
        EntityHashTable v25017435 = new EntityHashTable("25017435", "NIESSAMABOUGOU");
		hMYW5.children.addElement(v25017435);
       	
        EntityHashTable v25017497 = new EntityHashTable("25017497", "N'TJIBLEMBOUGOU");
		hMYW5.children.addElement(v25017497);
       	
        EntityHashTable v25017559 = new EntityHashTable("25017559", "N'TJIBOUGOU-TORODO");
		hMYW5.children.addElement(v25017559);
       	
        EntityHashTable v25017621 = new EntityHashTable("25017621", "SIMINIAN");
		hMYW5.children.addElement(v25017621);
       	
        EntityHashTable v25017683 = new EntityHashTable("25017683", "SIRABLO");
		hMYW5.children.addElement(v25017683);
       	
        EntityHashTable v25017745 = new EntityHashTable("25017745", "SIRAKOROBOUGOU TORODO");
		hMYW5.children.addElement(v25017745);
       	
        EntityHashTable v25017807 = new EntityHashTable("25017807", "TINY");
		hMYW5.children.addElement(v25017807);
       	
        EntityHashTable v25017869 = new EntityHashTable("25017869", "TORODO");
		hMYW5.children.addElement(v25017869);
       	
        EntityHashTable v25017931 = new EntityHashTable("25017931", "ZEALA");
		hMYW5.children.addElement(v25017931);
       	

        this.children.addElement(hMYW5);
        
        EntityHashTable hJBC3 = new EntityHashTable("JBC3", "YELEKEBOUGOU");

        
        EntityHashTable v25071001 = new EntityHashTable("25071001", "M'BAMBA");
		hJBC3.children.addElement(v25071001);
       	
        EntityHashTable v25071063 = new EntityHashTable("25071063", "FABOUGOULA");
		hJBC3.children.addElement(v25071063);
       	
        EntityHashTable v25071125 = new EntityHashTable("25071125", "FANSIRA-KORO");
		hJBC3.children.addElement(v25071125);
       	
        EntityHashTable v25071127 = new EntityHashTable("25071127", "SIRAMASO");
		hJBC3.children.addElement(v25071127);
       	
        EntityHashTable v25071187 = new EntityHashTable("25071187", "FANSIRACOURA");
		hJBC3.children.addElement(v25071187);
       	
        EntityHashTable v25071249 = new EntityHashTable("25071249", "FIAH");
		hJBC3.children.addElement(v25071249);
       	
        EntityHashTable v25071250 = new EntityHashTable("25071250", "DJOIMA");
		hJBC3.children.addElement(v25071250);
       	
        EntityHashTable v25071311 = new EntityHashTable("25071311", "GUILLY");
		hJBC3.children.addElement(v25071311);
       	
        EntityHashTable v25071373 = new EntityHashTable("25071373", "KOBA");
		hJBC3.children.addElement(v25071373);
       	
        EntityHashTable v25071435 = new EntityHashTable("25071435", "KOULOUNIKORO");
		hJBC3.children.addElement(v25071435);
       	
        EntityHashTable v25071497 = new EntityHashTable("25071497", "MENI");
		hJBC3.children.addElement(v25071497);
       	
        EntityHashTable v25071559 = new EntityHashTable("25071559", "MORIBOUGOU COURA");
		hJBC3.children.addElement(v25071559);
       	
        EntityHashTable v25071621 = new EntityHashTable("25071621", "NGOLOFALA");
		hJBC3.children.addElement(v25071621);
       	
        EntityHashTable v25071683 = new EntityHashTable("25071683", "NIAZANA");
		hJBC3.children.addElement(v25071683);
       	
        EntityHashTable v25071807 = new EntityHashTable("25071807", "SOUNGALOBOUGOU");
		hJBC3.children.addElement(v25071807);
       	
        EntityHashTable v25071869 = new EntityHashTable("25071869", "TINZENI");
		hJBC3.children.addElement(v25071869);
       	
        EntityHashTable v25071931 = new EntityHashTable("25071931", "YELEKEBOUGOU");
		hJBC3.children.addElement(v25071931);
       	
        EntityHashTable v25071431 = new EntityHashTable("25071431", "N'TIEYANI");
		hJBC3.children.addElement(v25071431);
       	

        this.children.addElement(hJBC3);
        
        EntityHashTable hXBF9 = new EntityHashTable("XBF9", "KATI-CORO");

        
        EntityHashTable v25091181 = new EntityHashTable("25091181", "KATI-COURA");
		hXBF9.children.addElement(v25091181);
       	
        EntityHashTable v25091271 = new EntityHashTable("25091271", "KATI KORO");
		hXBF9.children.addElement(v25091271);
       	
        EntityHashTable v25091541 = new EntityHashTable("25091541", "MISSION");
		hXBF9.children.addElement(v25091541);
       	
        EntityHashTable v25091631 = new EntityHashTable("25091631", "NOUMORILA");
		hXBF9.children.addElement(v25091631);
       	
        EntityHashTable v25091721 = new EntityHashTable("25091721", "SAMAKE-BOUGOU");
		hXBF9.children.addElement(v25091721);
       	
        EntityHashTable v25091901 = new EntityHashTable("25091901", "TOMINIKORO");
		hXBF9.children.addElement(v25091901);
       	

        this.children.addElement(hXBF9);
        
        EntityHashTable h5HD1 = new EntityHashTable("5HD1", "SANGAREBOUGOU");

        
        EntityHashTable v25061667 = new EntityHashTable("25061667", "SEYDOUBOUGOU");
		h5HD1.children.addElement(v25061667);
       	
        EntityHashTable v25061001 = new EntityHashTable("25061001", "SANGAREBOUGOU");
		h5HD1.children.addElement(v25061001);
       	
        EntityHashTable v25061334 = new EntityHashTable("25061334", "SARAMBOUGOU");
		h5HD1.children.addElement(v25061334);
       	

        this.children.addElement(h5HD1);
        
        EntityHashTable hNZC8 = new EntityHashTable("NZC8", "KALABAN-CORO");

        
        EntityHashTable v25029084 = new EntityHashTable("25029084", "GOUANA");
		hNZC8.children.addElement(v25029084);
       	
        EntityHashTable v25029167 = new EntityHashTable("25029167", "KABALA");
		hNZC8.children.addElement(v25029167);
       	
        EntityHashTable v25029250 = new EntityHashTable("25029250", "KALABANCORO");
		hNZC8.children.addElement(v25029250);
       	
        EntityHashTable v25029333 = new EntityHashTable("25029333", "KOURALE");
		hNZC8.children.addElement(v25029333);
       	
        EntityHashTable v25029416 = new EntityHashTable("25029416", "MISSALA");
		hNZC8.children.addElement(v25029416);
       	
        EntityHashTable v25029665 = new EntityHashTable("25029665", "N'GOLOBOUGOU");
		hNZC8.children.addElement(v25029665);
       	
        EntityHashTable v25029499 = new EntityHashTable("25029499", "MISSALABOUGOU");
		hNZC8.children.addElement(v25029499);
       	
        EntityHashTable v25029387 = new EntityHashTable("25029387", "BANCO-CORO");
		hNZC8.children.addElement(v25029387);
       	
        EntityHashTable v25029184 = new EntityHashTable("25029184", "BANCO-COURA");
		hNZC8.children.addElement(v25029184);
       	
        EntityHashTable v25029896 = new EntityHashTable("25029896", "MADINA");
		hNZC8.children.addElement(v25029896);
       	

        this.children.addElement(hNZC8);
        
        EntityHashTable hJ8J1 = new EntityHashTable("J8J1", "KALABANCORO KOULOUBA");

        
        EntityHashTable v25029465 = new EntityHashTable("25029465", "KALABANCORO KOULOUBA");
		hJ8J1.children.addElement(v25029465);
       	

        this.children.addElement(hJ8J1);
        
        EntityHashTable h4K70 = new EntityHashTable("4K70", "KALABANCORO HERAMAKONO");

        
        EntityHashTable v25029094 = new EntityHashTable("25029094", "KALABANCORO HERAMAKONO");
		h4K70.children.addElement(v25029094);
       	

        this.children.addElement(h4K70);
        
        EntityHashTable h2PH2 = new EntityHashTable("2PH2", "SIRACORO-MEGUETANA");

        
        EntityHashTable v25029001 = new EntityHashTable("25029001", "DIATOULA");
		h2PH2.children.addElement(v25029001);
       	
        EntityHashTable v25029914 = new EntityHashTable("25029914", "SIRACORO MEGUETANA");
		h2PH2.children.addElement(v25029914);
       	
        EntityHashTable v25029150 = new EntityHashTable("25029150", "N'TABACORO");
		h2PH2.children.addElement(v25029150);
       	
        EntityHashTable v25029495 = new EntityHashTable("25029495", "NIAMAN (+ NIAMANABOUGOU + NIAMA)");
		h2PH2.children.addElement(v25029495);
       	

        this.children.addElement(h2PH2);
        
        EntityHashTable h4WA6 = new EntityHashTable("4WA6", "DIALAKOROBOUGOU");

        
        EntityHashTable v25041187 = new EntityHashTable("25041187", "DIALAKOROBOUGOU");
		h4WA6.children.addElement(v25041187);
       	
        EntityHashTable v25041703 = new EntityHashTable("25041703", "KOBALACOURA");
		h4WA6.children.addElement(v25041703);
       	
        EntityHashTable v25041389 = new EntityHashTable("25041389", "TIEGUENA");
		h4WA6.children.addElement(v25041389);
       	
        EntityHashTable v25041393 = new EntityHashTable("25041393", "NIMIZATT");
		h4WA6.children.addElement(v25041393);
       	

        this.children.addElement(h4WA6);
        
        EntityHashTable hDBJ2 = new EntityHashTable("DBJ2", "NIAMANA");

        
        EntityHashTable v25001094 = new EntityHashTable("25001094", "DOUGOURAKORO");
		hDBJ2.children.addElement(v25001094);
       	
        EntityHashTable v25001311 = new EntityHashTable("25001311", "KOBALAKOURA");
		hDBJ2.children.addElement(v25001311);
       	
        EntityHashTable v25001373 = new EntityHashTable("25001373", "KOGNINI");
		hDBJ2.children.addElement(v25001373);
       	
        EntityHashTable v25001559 = new EntityHashTable("25001559", "NIMIZATT");
		hDBJ2.children.addElement(v25001559);
       	
        EntityHashTable v25001931 = new EntityHashTable("25001931", "TIEGUENA");
		hDBJ2.children.addElement(v25001931);
       	
        EntityHashTable v25001874 = new EntityHashTable("25001874", "DIALAKOROBOUGOU");
		hDBJ2.children.addElement(v25001874);
       	
        EntityHashTable v25029831 = new EntityHashTable("25029831", "SABALIBOUGOU");
		hDBJ2.children.addElement(v25029831);
       	

        this.children.addElement(hDBJ2);
        
        EntityHashTable hWX90 = new EntityHashTable("WX90", "ASACO - SAN");

        

        this.children.addElement(hWX90);
        
        EntityHashTable h3ZS0 = new EntityHashTable("3ZS0", "ASACO KANER");

        

        this.children.addElement(h3ZS0);
        
        EntityHashTable hD6S3 = new EntityHashTable("D6S3", "ASACOHERE");

        

        this.children.addElement(hD6S3);
        
        EntityHashTable hYK34 = new EntityHashTable("YK34", "ASACOKA");

        

        this.children.addElement(hYK34);
        
        EntityHashTable hKDB1 = new EntityHashTable("KDB1", "ASACOSIME");

        

        this.children.addElement(hKDB1);
        
        EntityHashTable h6KC7 = new EntityHashTable("6KC7", "ASAKKOUL");

        

        this.children.addElement(h6KC7);
        
        EntityHashTable hB6F6 = new EntityHashTable("B6F6", "ASCOMKA");

        

        this.children.addElement(hB6F6);
        
        EntityHashTable hP3D6 = new EntityHashTable("P3D6", "KOURSALE");

        

        this.children.addElement(hP3D6);
        
    }

}