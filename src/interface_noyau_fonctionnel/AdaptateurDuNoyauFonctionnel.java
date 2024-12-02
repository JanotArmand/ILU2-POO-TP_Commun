package interface_noyau_fonctionnel;

import java.time.LocalDate;

import control.ControlReserverTable;
import control.ControlVisualiserCarnetClientele;

public class AdaptateurDuNoyauFonctionnel {

	private ControlReserverTable control;
	private ControlVisualiserCarnetClientele controlVisualiserCarnetClientele;
	private int[] propositions;
	LocalDate DateReservation;
	int JourReservation;
	int MoisReservation;
	String HeureReservation;
	int nbPersonnesReservation;
	String[] TablesReservation;
	int nbTableReservation;

	public AdaptateurDuNoyauFonctionnel(ControlReserverTable control,
			ControlVisualiserCarnetClientele controlVisualiserCarnetClientele) {
		this.control = control;
		this.controlVisualiserCarnetClientele = controlVisualiserCarnetClientele;
	}

	public String[] trouverTableDisponible(int jour, int mois, int nombrePersonnes, String time) {
		int numService;
		if (time.equals("19H30")) {
			numService = 1;
		} else {
			numService = 2;
		}

		propositions = control.trouverPossibilite(jour, mois, nombrePersonnes, numService);
		int nbProposition = 0;
		int[] propositionRetenue = new int[propositions.length - 1];
		for (int i = 1; i < propositions.length; i++) {
			if (propositions[i] != 0) {
				propositionRetenue[nbProposition] = propositions[i];
				nbProposition++;
			}
		}
		String[] propString;
		propString = new String[nbProposition];
		for (int i = 0; i < nbProposition; i++) {
			propString[i] = "" + propositionRetenue[i];
		}

		return propString;
	}

	public int selectionTable(int numIndice) {
		return propositions[numIndice];
	}

	public String reserverTable(int numClient, int numTable/* , int[] proposition */) {
		control.reserver(numClient, numTable, propositions[0]);
		return controlVisualiserCarnetClientele.visualiserCarnetClientel();
	}

	public void Date(LocalDate date) {
		this.DateReservation = date;
		this.JourReservation = date.getDayOfMonth();
		this.MoisReservation = date.getMonthValue();
	}

	public LocalDate getDate() {
		return DateReservation;
	}

	public int getJour() {
		return JourReservation;
	}

	public int getMois() {
		return MoisReservation;
	}

	public void Heure(String time) {
		this.HeureReservation = time;
	}

	public String getHeure() {
		return HeureReservation;
	}

	public void NbPersonnes(int nbPersons) {
		this.nbPersonnesReservation = nbPersons;
	}

	public int getNbPersonnes() {
		return nbPersonnesReservation;
	}

	public void NbTable(int nbTable) {
		this.nbTableReservation = nbTable;
	}

	public int getNbTable() {
		return nbTableReservation;
	}

	public String MessageValidation() {
		String msg = "<html>Réservation validée pour le <html>" + DateReservation.toString() + " à " + HeureReservation
				+ " pour " + nbPersonnesReservation + " personnes à la table " + propositions[nbTableReservation + 1]
				+ ".";
		return msg;
	}

}
