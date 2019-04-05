package command2;

// A NoCommand azért fontos mert ez egy "null object". Ezt akkor használjuk
// ha nincs értelmes objektum amivel visszatérhetünk, és el akarjuk háritani
// a valódi null kezelését a kliensről. Ez bátran meghívható, úgysem csinál semmit.
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
