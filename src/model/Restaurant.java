package model;

public class Restaurant {
	Table listeTable[] = new Table[100];
	CentraleReservation centrale = new CentraleReservation<Table, FormulaireRestaurant>(listeTable);

	public void ajouterTable(int nbChaises) {
		Table table = new Table(nbChaises);
		centrale.ajouterEntite(table);
	}

	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		return centrale.donnerPossibilites(formulaire);
	}

	public Reservation reserver(int numeroEntite, FormulaireRestaurant formulaire) {
		return centrale.reserver(numeroEntite, formulaire);
	}

	private class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService = new CalendrierAnnuel();

		public Table(int nbChaises) {
			this.nbChaises = nbChaises;
		}

		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			if (((formulaire.getNombrePersonnes() == nbChaises) || (formulaire.getNombrePersonnes() == nbChaises - 1))
					&& (estLibre(formulaire))) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public ReservationRestaurant reserver(FormulaireRestaurant formulaire) {
			if (formulaire.getNumService() == 1) {
				calendrier.reserver(formulaire.getJour(), formulaire.getMois());
			} else {
				calendrierDeuxiemeService.reserver(formulaire.getJour(), formulaire.getMois());
			}
			return new ReservationRestaurant(formulaire.getJour(), formulaire.getMois(), formulaire.getNumService(),
					formulaire.getNombrePersonnes());
		}
	}
}
