package frontiere;

import java.util.Scanner;

import control.ControlReserverTable;

public class BoundaryReserverTable {
	private ControlReserverTable controlReserverTable;
	private Scanner scanner = new Scanner(System.in);

	public BoundaryReserverTable(ControlReserverTable controlReserverTable) {
		this.controlReserverTable = controlReserverTable;
	}

	public void ReserverTable(int numClient) {
		System.out.println("Quand souhaitez vous réserver ?\nPour quel mois ?\n");
		int mois = Integer.valueOf(scanner.next());
		System.out.println("Pour quel jour ?\n");
		int jour = Integer.valueOf(scanner.next());
		System.out.println("Pour combien de personnes ?\n");
		int nbPersonnes = Integer.valueOf(scanner.next());
		System.out.println("Pour quel Service ?\n");
		int service = Integer.valueOf(scanner.next());

		int[] possibilites = controlReserverTable.trouverPossibilite(jour, mois, nbPersonnes, service);
		for (int i = 1; i < possibilites.length; i++) {
			System.out.println("Numéro de table : " + i + "\n");
		}
		System.out.println("\nChoisissez votre table.\n");
		int numTable = Integer.valueOf(scanner.next());

		controlReserverTable.reserver(numClient, numTable, proposition[0]);
	}
}
