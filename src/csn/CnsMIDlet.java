package csn;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import csn.EntitiesForm.*;

public class CnsMIDlet extends MIDlet implements CommandListener {

    public Display display;     // The display for this MIDlet

    public CnsMIDlet() {
        display = Display.getDisplay(this);
    }

    public void startApp() {
        EntitiesForm f = new EntitiesForm(this);
        display.setCurrent(f);
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable s) {
    }
}
