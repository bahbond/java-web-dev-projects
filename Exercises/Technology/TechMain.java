package Technology;

public class TechMain {
    public static void main(String[] args){
        Computer powerSpec = new Computer("powerspec", 2000000, true);
        System.out.println(powerSpec.getGBMemory());
        System.out.println(powerSpec.addSoftware(120000));
        System.out.println(powerSpec.GBMemory);


        Computer macBookPro = new Computer("Apple", 25000000, false);
         macBookPro.addSoftware(12500000);
        System.out.println(macBookPro.GBMemory);
    }
}
