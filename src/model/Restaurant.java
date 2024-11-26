package model;

public class Restaurant {

	private class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService;

		public Table(int nbChaises) {
			this.nbChaises = nbChaises;
		}

		public boolean compatible(FormulaireRestaurant formulaire) {
			if (((formulaire.getNombrePersonnes() == nbChaises) || (formulaire.getNombrePersonnes() == nbChaises - 1))
					&& (estLibre(formulaire))) {
				return true;
			} else {
				return false;
			}
		}

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
