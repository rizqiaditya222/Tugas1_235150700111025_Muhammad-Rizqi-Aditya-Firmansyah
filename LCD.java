public class LCD {
    public static void main(String[] args) {
        setUp LCD1 = new setUp();
        setUp LCD2 = new setUp();
        setUp LCD3 = new setUp();
        setUp LCD4 = new setUp();

        LCD1.turnOn();
        LCD1.setVolume(21);
        LCD1.volumeUp();
        LCD1.volumeUp();
        LCD1.volumeDown();
        LCD1.BrightnessUp();
        LCD1.setBrightness(92);
        LCD1.BrightnessDown();
        LCD1.setCable(4);
        System.out.println("LCD Status \t: "+LCD1.getStatus());
        System.out.println("Volume \t\t: "+LCD1.getVolume());
        System.out.println("Brightness \t: "+LCD1.getBrightness());
        System.out.println("Cable \t\t: "+LCD1.getCable());
        System.out.println("");
        
        LCD2.turnOn();
        LCD2.Freeze();
        LCD2.setVolume(512);
        LCD2.volumeUp();
        LCD2.volumeDown();
        LCD2.volumeDown();
        LCD2.volumeDown();
        LCD2.setBrightness(-1);
        LCD2.BrightnessUp();
        LCD2.BrightnessUp();
        LCD2.setCable(3);
        System.out.println("LCD Status \t: "+LCD2.getStatus());
        System.out.println("Volume \t\t: "+LCD2.getVolume());
        System.out.println("Brightness \t: "+LCD2.getBrightness());
        System.out.println("Cable \t\t: "+LCD2.getCable());
        System.out.println("");
        
        LCD3.turnOn();
        LCD3.Freeze();
        LCD3.turnOn();
        LCD3.setVolume(21);
        LCD3.turnOff();
        LCD3.volumeUp();
        LCD3.setVolume(512);
        LCD3.volumeDown();
        LCD3.volumeDown();
        LCD3.setBrightness(-12);
        LCD3.BrightnessUp();
        LCD3.BrightnessUp();
        LCD3.BrightnessUp();
        LCD3.setCable(5);
        System.out.println("LCD Status \t: "+LCD3.getStatus());
        System.out.println("Volume \t\t: "+LCD3.getVolume());
        System.out.println("Brightness \t: "+LCD3.getBrightness());
        System.out.println("Cable \t\t: "+LCD3.getCable());
        System.out.println("");
        System.out.println("");
    }
}
