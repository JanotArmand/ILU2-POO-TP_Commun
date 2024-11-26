package model;

public class FormulaireRestaurant extends Formulaire {
	private int nombrePersonnes;
	private int numeroService;

	public FormulaireRestaurant(int jour, int mois, int nombrePersonnes, int numeroService) {
		super(jour, mois);
		this.nombrePersonnes = nombrePersonnes;
		this.numeroService = numeroService;
	}

	public int getNombrePersonnes() {
		return nombrePersonnes;
	}

	public int getNumService() {
		return numeroService;
	}
}
