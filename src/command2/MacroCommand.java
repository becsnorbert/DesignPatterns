package command2;

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;    // Itt egy tömbben megadott commandokat
    }                                // tárolunk.

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();    // Itt hajtjuk végre.
        }
    }

    @Override
    public void undo() {
    }
}
