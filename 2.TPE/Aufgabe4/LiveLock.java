package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;
/*
 * Permanenter Wechsel zwischen 2 Zuständen,-ohne-dass-etwas-passiert
 */

public class LiveLock {
	public static void main (String[] args) {
        Worker worker1 = new Worker("Worker 1 ", true);
        Worker worker2 = new Worker("Worker 2", true);

        CommonResource s = new CommonResource(worker1);

        new Thread(() -> {
            worker1.work(s, worker2);
        }).start();

        new Thread(() -> {
            worker2.work(s, worker1);
        }).start();
    }
}

