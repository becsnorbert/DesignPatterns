package command2;

public class RemoteControlWithUndo {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;    // Itt vezetjük be az undot

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0;i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;   // Csak úgy mint a többi parancsnál az undo is noCommand-al kezd.
    }

    public void  setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();       // Amint a gombot megnyomjuk a hozzá
                                          // rendelt parancsot hozzáfűzzük az
        undoCommand = onCommands[slot];   // undo gombhoz, és ezt megtesszük az
                                          // of parancsnál is, egyel lejebb.
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {   // Amikor megnyomjuk az undo gombot,
        undoCommand.undo();               // akkor az eltárolt command undo()
    }                                     // metódusát meghívjuk. Ezzel az ott
                                          // megadottakat végrehajtja.

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
