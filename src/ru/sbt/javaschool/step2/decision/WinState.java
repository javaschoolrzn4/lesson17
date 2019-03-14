package ru.sbt.javaschool.step2.decision;

public class WinState implements State {

    GumballMachine machine;

    public WinState(GumballMachine machine) {
        this.machine = machine;
        if (machine.getCount() < 2) {
            machine.setState(machine.getSoldOutState());
        }
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispence() {

    }
}
