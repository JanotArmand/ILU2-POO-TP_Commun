package model;

public class ReservationHotel extends Reservation {
	private int nombreLitSimple;
	private int nombreLitDouble;
	private int numeroChambre;

	public ReservationHotel(int jour, int mois, int nombreLitSimple, int nombreLitDouble, int numeroChambre) {
		super(jour, mois);
		this.nombreLitSimple = nombreLitSimple;
		this.numeroChambre = numeroChambre;
	}

	@Override
	public String toString() {
		return "Le " + getJour() + "/" + getMois() + "\nChambre " + numeroChambre + " avec " + nombreLitSimple
				+ "lit(s) simple(s) et " + nombreLitDouble + ".";
	}
}
