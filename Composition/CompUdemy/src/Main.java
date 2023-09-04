public class Main {
    public static void main(String[] args) {

        ComputerCase case1 = new ComputerCase("2208", "Dell", "600W");
        Monitor monitor1 = new Monitor("100HZ Ultrawide", "LG", 34, "3440x1440");
        Motherboard motherboard1 = new Motherboard("BJ-200", "ASUS", 4, 6, "v2.44");

        PersonalComputer pc1 = new PersonalComputer("Gaming-pc", "Acer", case1, monitor1, motherboard1);

//        pc1.getComputerCase().pressPowerButton();
//        pc1.getMonitor().drawPixelAt(50, 1000, "Blue");
//        pc1.getMotherboard().loadProgram("Steam");

        pc1.power();


    }
}
