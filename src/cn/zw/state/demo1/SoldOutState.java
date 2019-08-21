package cn.zw.state.demo1;

public class SoldOutState implements Sate {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can not insert a quarter , the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can not  eject , you have not inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned , but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed ");
    }
}
