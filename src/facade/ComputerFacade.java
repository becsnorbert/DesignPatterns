package facade;

public class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    /*
     * Facade methods.
     */
    public void start() {
        processor.freeze();
        ram.load(5);
        processor.jump(5);
        processor.execute();
    }


}
