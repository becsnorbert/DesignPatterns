package facade;

public class CPU {
    public void freeze() {
        System.out.println("CPU freeze.");
    }
    public void jump(long position) {
        System.out.println("CPU jump.");
    }
    public void execute() {
        System.out.println("CPU Execute.");
    }
}
