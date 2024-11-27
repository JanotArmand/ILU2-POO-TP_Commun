package model;

public class Hotel {
	Chambre listeChambre[] = new Chambre[100];
	CentraleReservation centrale = new CentraleReservation<Chambre, FormulaireHotel>(listeChambre);

	public void ajouterChambre(int nombreLitsSimple, int nombreLitDouble) {
		Chambre chambre = new Chambre(nombreLitsSimple, nombreLitDouble);
		centrale.ajouterEntite(chambre);
	}

	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		return centrale.donnerPossibilites(formulaire);
	}

	public Reservation reserver(int numeroEntite, FormulaireRestaurant formulaire) {
		return centrale.reserver(numeroEntite, formulaire);
	}

	private class Chambre extends EntiteReservable<FormulaireHotel> {
		private int nombreLitsSimple;
		private int nombreLitsDouble;

		public Chambre(int nombreLitsSimple, int nombreLitsDouble) {
			this.nombreLitsSimple = nombreLitsSimple;
			this.nombreLitsDouble = nombreLitsDouble;
		}

		@Override
		public boolean compatible(FormulaireHotel formulaire) {
			if ((((formulaire.getNombreLitSimple() == nombreLitsSimple)
					|| (formulaire.getNombreLitSimple() == nombreLitsSimple - 1))
					&& ((formulaire.getNombreLitDouble() == nombreLitsDouble)
							|| (formulaire.getNombreLitDouble() == nombreLitsDouble - 1)))
					&& (estLibre(formulaire))) {
				return true;
			} else {
				return false;
			}
		}

		// A REVOIR !!!

		@Override
		public ReservationHotel reserver(FormulaireHotel formulaire) {
			calendrier.reserver(formulaire.getJour(), formulaire.getMois());
			return new ReservationHotel(formulaire.getJour(), formulaire.getMois(), formulaire.getNombreLitSimple(),
					formulaire.getNombreLitDouble(), 1);
		}
	}
}
