package model;

public abstract class EntiteReservable<F extends Formulaire, R extends Reservation> {
	private CalendrierAnnuel calendrier;
	private int numero;

	public EntiteReservable(CalendrierAnnuel calendrier) {
		this.calendrier = calendrier;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public boolean estLibre(F formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}

	public abstract boolean compatible();

	public abstract R reserver();
}
