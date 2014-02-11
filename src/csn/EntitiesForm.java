
package csn;

import javax.microedition.lcdui.*;
import snisi.entities.Utils.*;

/**
 * J2ME Form allowing Server number, user_name region and district.
 * @author Fad
 */

public class EntitiesForm extends Form implements CommandListener {

    private static final Command CMD_EXIT = new Command ("Quiter", Command.BACK, 0);
    private static final Command CMD_CONTINUE = new Command ("Continuer", Command.HELP, 1);
    private static final Command CMD_CONTINUE_2 = new Command ("Continuer", Command.HELP, 2);
    private static final Command CMD_CONTINUE_3 = new Command ("Continuer", Command.HELP, 3);
    private static final Command CMD_DISPLAY = new Command ("Terminer", Command.HELP, 4);
    private static final Command CMD_RESTART = new Command ("Reprendre", Command.HELP, 5);

    CnsMIDlet midlet;
    //Displayable returnTo;

    private String[] regions;
    String district_code;
    String health_center_code;
    String village_code;
    String village_name;
    //choice
    private ChoiceGroup regionField;
    private ChoiceGroup districtField;
    private ChoiceGroup locationField;
    private ChoiceGroup health_centerField;

    public EntitiesForm(CnsMIDlet midlet) {
        super("Demo CSN");
        this.midlet = midlet;
        regions = snisi.entities.Utils.regions_codes();

        regionField = new ChoiceGroup("Votre Région:", ChoiceGroup.POPUP, snisi.entities.Utils.regions_names(), null);
        append(regionField);

        addCommand(CMD_CONTINUE);
        addCommand(CMD_EXIT);

        this.setCommandListener(this);
      }

    public void commandAction(Command c, Displayable d) {

        if (c == CMD_RESTART) {
            this.midlet.startApp();
            return;
        }

        if (c == CMD_CONTINUE) {
            districtField = new ChoiceGroup("Votre District:", ChoiceGroup.POPUP,
                                            snisi.entities.Utils.districts_names(regions[regionField.getSelectedIndex()]), null);
            append(districtField);
            removeCommand(CMD_CONTINUE);
            addCommand(CMD_CONTINUE_2);
            addCommand(CMD_RESTART);
        }

        if (c == CMD_CONTINUE_2) {
            district_code = snisi.entities.Utils.districts_codes(regions[regionField.getSelectedIndex()])[districtField.getSelectedIndex()];

            health_centerField = new ChoiceGroup("Aire de santé:", ChoiceGroup.POPUP,
                                                 snisi.entities.Utils.hcenters_names(district_code), null);
            append(health_centerField);
            removeCommand(CMD_CONTINUE_2);
            addCommand(CMD_CONTINUE_3);
        }

        if (c == CMD_CONTINUE_3) {
            System.out.println("District: "+ district_code + " Aire sanitaire: " + health_center_code);
            health_center_code = snisi.entities.Utils.hcenters_codes(district_code)[health_centerField.getSelectedIndex()];
            locationField = new ChoiceGroup("Village:",ChoiceGroup.POPUP,
                                        snisi.entities.Utils.villages_names(district_code,
                                        health_center_code), null);

            try {
                village_name = snisi.entities.Utils.villages_names(district_code,
                                                                   health_center_code)[locationField.getSelectedIndex()];
                village_code = snisi.entities.Utils.villages_codes(district_code,
                                                                   health_center_code)[locationField.getSelectedIndex()];
                System.out.println(village_code);
                append(locationField);
                removeCommand(CMD_CONTINUE_3);
            } catch (Exception e) {
                Alert alert;
                alert = new Alert("Village non trouver", "Aucun village n'a "
                                  + "été trouvé pour l'aire de santé de "
                                  + snisi.entities.Utils.hcenters_names(district_code)[health_centerField.getSelectedIndex()]
                                  + "/" + health_center_code
                                  + ".", null,
                                   AlertType.INFO);
                alert.setTimeout(Alert.FOREVER);
                this.midlet.display.setCurrent (alert, this);

                // System.out.println(village_code);
                return;
            }
            addCommand(CMD_DISPLAY);
        }
                // save command
        if (c == CMD_DISPLAY) {
            Alert alert;
            String sep = " | ";
                alert = new Alert ("Voici votre selection",
                                   "Region / code \n "
                                   + snisi.entities.Utils.regions_names()[regionField.getSelectedIndex()]
                                   + sep + snisi.entities.Utils.regions_codes()[regionField.getSelectedIndex()]
                                   + "\nDistrict / code\n "
                                   + snisi.entities.Utils.districts_names(regions[regionField.getSelectedIndex()])[districtField.getSelectedIndex()]
                                   + sep + district_code
                                   + "\nAire de santé / code\n "
                                   + snisi.entities.Utils.hcenters_names(district_code)[health_centerField.getSelectedIndex()]
                                   + sep + health_center_code
                                   + "\nVillage / code \n "
                                   + village_name + sep + village_code,
                                   null, AlertType.INFO);
                this.midlet.display.setCurrent (alert, this);
        }

       if (c == CMD_EXIT) {
           this.midlet.destroyApp(false);
           this.midlet.notifyDestroyed();
       }
    }
}
