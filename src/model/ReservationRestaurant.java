package model;

public class ReservationRestaurant extends Reservation {
	private int service;
	private int numeroTable;

	public ReservationRestaurant(int jour, int mois, int service, int numeroTable) {
		super(jour, mois);
		this.service = service;
		this.numeroTable = numeroTable;
	}

	@Override
	public String toString() {
		if (service == 1) {
			return "Le " + getJour() + "/" + getMois() + "\nTable " + numeroTable + " pour le premier service.";
		} else {
			return "Le " + getJour() + "/" + getMois() + "\nTable " + numeroTable + " pour le deuxième service.";
		}
	}
}