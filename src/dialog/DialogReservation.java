/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import java.time.LocalDate;

import interface_noyau_fonctionnel.AdaptateurDuNoyauFonctionnel;
import presentation.FrameConfirmation;
import presentation.FrameReservation;

public class DialogReservation {

	private FrameReservation frameReservation;
	private AdaptateurDuNoyauFonctionnel adnf;
	private FrameConfirmation frameConfirmation;
	private int numClient;

	public DialogReservation(AdaptateurDuNoyauFonctionnel adnf) {
		this.adnf = adnf;
	}

	public void initDialog() {
		frameReservation = new FrameReservation();
		frameReservation.initFrame();
		frameReservation.setDialog(this);
		frameReservation.setVisible(true);

		frameConfirmation = new FrameConfirmation();
		frameConfirmation.initFrame();
		frameConfirmation.setDialog(this);
	}

	public void handleUserConnected(int numClient) {
		this.numClient = numClient;
		frameReservation.setVisible(true);
	}

	public void handleDateSelectedEvent(LocalDate date) {
		if (date != null) {
			adnf.Date(date);
		}
		frameReservation.disableHeure();
		frameReservation.enableHeure();
	}

	public void handleTimeSelectedEvent(String time) {
		if (!"...".equals(time)) {
			frameReservation.disableNbPersonnes();
			frameReservation.enableNbPersonnes();
			adnf.Heure(time);
		} else {
			frameReservation.disableNbPersonnes();
		}
	}

	public void handleNumOfPersonsSelectedEvent(int nbPersons) {
		frameReservation.enableTables();
		adnf.NbPersonnes(nbPersons);
		String[] Tables = adnf.trouverTableDisponible(adnf.getJour(), adnf.getMois(), adnf.getNbPersonnes(),
				adnf.getHeure());
		frameReservation.initTables(Tables);
	}

	public void handleTableSelectedEvent(int numTable) {
		adnf.NbTable(numTable);
	}

	public void handleCancelEvent() {
		frameReservation.disableDate();

	}

	public void handleValidationEvent() {
		String texte = adnf.MessageValidation();
		frameConfirmation.InitTexte(texte);
		frameConfirmation.setVisible(true);
	}

	public void handleConfirmationReservationEvent() {
		frameConfirmation.setVisible(false);
		frameReservation.disableDate();
	}
}
