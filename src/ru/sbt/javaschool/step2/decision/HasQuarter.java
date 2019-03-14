package ru.sbt.javaschool.step2.decision;

import java.util.Random;

public class HasQuarter implements State {

    Random random = new Random(System.currentTimeMillis());

    public HasQuarter(GumballMachine machine) {
        this.machine = machine;
    }

    GumballMachine machine;
    @Override
    public void insertQuarter() {
        System.out.println("Монетка уже брошена");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Монетка возвращена");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Рычаг дернут");
            machine.setState(machine.getSoldState());
    }

    @Override
    public void dispence() {
        System.out.println("Некорректное действие для этого состояния");
    }

    @Override
    public String toString() {
        return "HasQuarter";
    }
}
