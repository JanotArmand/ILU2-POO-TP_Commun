package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int numeroEntite = 0;

	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	public void setIdentificationEntite(int numeroEntite) {
		this.numeroEntite = numeroEntite;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getIdentificationEntite() {
		return numeroEntite;
	}
}
