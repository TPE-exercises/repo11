package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;

public class Worker {
	private String name;
	private boolean active;

	public Worker(String name, boolean active) {
		this.name = name;
		this.active = active;
	}
//	gibt namen zurück
	public String getName() {
		return name;
	}
// gibt active als boolean zurück
	public boolean isActive() {
		return active;
	}
// work synchronisiert
	public synchronized void work(CommonResource commonResource, Worker otherWorker) {
		while (active) {
			// wartet auf die ressource
			if (commonResource.getOwner() != this) {
				try {
					wait(1);
				} catch (InterruptedException e) {
							}
			}

//			wenn der otherWorker noch aktiv ist  dann lass ihn zuerst die arbeit machen
			if (otherWorker.isActive()) {
				System.out.println(getName() + " : handover the resource to the worker " + otherWorker.getName());
				commonResource.setOwner(otherWorker);
				continue;
			}

		}
	}
}
