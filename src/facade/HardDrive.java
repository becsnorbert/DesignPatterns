package facade;

public class HardDrive {
    public void read(long lba, int size) {
        System.out.println("HardDrive(" + lba + ", " + size + ")");
    }
}
