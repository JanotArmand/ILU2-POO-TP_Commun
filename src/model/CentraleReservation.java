package model;

public class CentraleReservation<E extends EntiteReservable, F extends Formulaire> {
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
			if (tableauEntite[i].compatible(formulaire)) {
				tableau[i] = i + 1;
			} else {
				tableau[i] = 0;
			}
		}
		return tableau;
	}

	public Reservation reserver(int numeroEntite, F formulaire) {
		int i = 0;
		while (tableauEntite[i].getNumero() != numeroEntite) {
			i += 1;
		}
		formulaire.setIdentificationEntite(tableauEntite[i].getNumero());
		return tableauEntite[i].reserver(formulaire);
	}
}
