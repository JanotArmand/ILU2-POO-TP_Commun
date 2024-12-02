package test_fonctionnel;

import java.awt.EventQueue;

import control.ControlConnecterClient;
import control.ControlCreerClient;
import control.ControlReserverTable;
import control.ControlVisualiserCarnetClientele;
import dialog.DialogReservation;
import frontiere.BoundaryConnecterClient;
import frontiere.BoundaryCreerClient;
import frontiere.BoundaryReserverTable;
import interface_noyau_fonctionnel.AdaptateurDuNoyauFonctionnel;
import model.CarnetClientele;
import model.Client;
import model.Restaurant;

public class TestReserverTable_IHM {
	public static void main(String[] args) {
		System.out.println("---------- CREER CLIENT ----------");
		// ENTITE : Creation du carnet de clientele
		CarnetClientele carnetClientele = new CarnetClientele();
		//

		ControlCreerClient controlCreerClient = new ControlCreerClient(carnetClientele);
		BoundaryCreerClient boundaryCreerClient = new BoundaryCreerClient(controlCreerClient);
		boundaryCreerClient.creerClient();

		System.out.println("\n---------- CONNECTER CLIENT ----------");
		ControlConnecterClient controlConnecterClient = new ControlConnecterClient(carnetClientele);
		BoundaryConnecterClient boundaryConnecterClient = new BoundaryConnecterClient(controlConnecterClient);
		int numClient = boundaryConnecterClient.connecterClient();

		// Creation et configuration du restaurant
		Restaurant restaurant = new Restaurant();
		restaurant.ajouterTable(2);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(8);
		//

		System.out.println("\n---------- RESERVER TABLE ----------");
		ControlReserverTable controlReserverTable = new ControlReserverTable(restaurant, carnetClientele);
		ControlVisualiserCarnetClientele controlVisualiserCarnetClientele = new ControlVisualiserCarnetClientele(
				carnetClientele);
		AdaptateurDuNoyauFonctionnel AdaptateurNF = new AdaptateurDuNoyauFonctionnel(controlReserverTable,
				controlVisualiserCarnetClientele);
		DialogReservation dialogReservation = new DialogReservation(AdaptateurNF);

		BoundaryReserverTable boundaryReserverTable = new BoundaryReserverTable(controlReserverTable);
		boundaryReserverTable.ReserverTable(numClient);

		System.out.println("\n-------- CONTROL DES DONNEES --------");
		Client client = carnetClientele.getClient(0);
		System.out.println(client.toString());
		System.out.println("Reservation :\n");
		System.out.println(client.getReservations()[0].toString());

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					dialogReservation.initDialog();
					dialogReservation.handleUserConnected(numClient);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
