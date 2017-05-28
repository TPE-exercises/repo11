package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;
public class CommonResource {
    private Worker owner;

    public CommonResource (Worker d) {
        owner = d;
    }

    public Worker getOwner () {
        return owner;
    }

    public synchronized void setOwner (Worker d) {
        owner = d;
    }
}