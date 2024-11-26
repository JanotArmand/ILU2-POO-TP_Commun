package model;

public class CentraleReservation<E extends EntiteReservable, F extends Formulaire, R extends Reservation> {
	private E tableauEntite[];
	private int nombreEntite = 0;

	public CentraleReservation(E tableauEntite[]) {
		this.tableauEntite = tableauEntite;
	}

	public int ajouterEntite(E entite) {
		tableauEntite[nombreEntite] = entite;
		nombreEntite += 1;
		return nombreEntite;
	}

	public int[] donnerPossibilites(F formulaire) {
		int tableau[] = new int[nombreEntite];
		for (int i = 0; i < nombreEntite; i++) {
			if (tableauEntite[i].estLibre(formulaire)) {
				tableau[i] = i;
			}
		}
		return tableau;
	}

	public R reserver(int numeroEntite, F formulaire) {
		return new R(formulaire.getJour(), formulaire.getMois());
	}
}
