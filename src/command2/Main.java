package command2;

public class Main {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light();
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        StereoWithCDCommand stereoOnWithCD = new StereoWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // Jöhetnek a macro command tömbbök:
        Command[] partyOn = {livingRoomLightOn, stereoOnWithCD, ceilingFanHigh};
        Command[] partyOff = {livingRoomLightOff, stereoOff, ceilingFanOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
        // Majd állítsuk is be egy gombra:
        remoteControl.setCommand(3, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        System.out.println("-----------------------------------");

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        System.out.println("-----------------------------------");

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        // Használjuk:
        System.out.println("-----------PARTY MACRO ON------------");
        remoteControl.onButtonWasPushed(3);
        System.out.println("-----------PARTY MACRO OFF------------");
        remoteControl.offButtonWasPushed(3);
    }

}
