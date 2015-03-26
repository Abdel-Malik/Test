/**
 * 
 * @author Blouin&Bouhassoun
 *
 */
public class PileEntierPositifOuNul {
	/** Taille par défaut de la pile. */
	private static final int DEFAULT_VAL = 5;
	/** Code erreur pile pleine. */
	public static final int PILE_PLEINE = -1;
	/** Code erreur pile vide. */
	public static final int PILE_VIDE = -2;
	/** Code erreur valeur saisie négative. */
	public static final int NEGATIF = -3;
	/** Code succes. */
	public static final int SUCCES = 1;
	private final int tabNb[];
	private int nbElem;
	
	/**Constructeur.
	 * Utilise la valeur par défaut
	 */
	public PileEntierPositifOuNul() {
		this(DEFAULT_VAL);
	}
	


	/**
	 * 
	 * @param taille
	 * Taille initiale du tableau
	 * 
	 */
	public PileEntierPositifOuNul(int taille) {
		this.tabNb = new int[taille < 1 ? DEFAULT_VAL : taille];
		this.nbElem = 0;
	}

	/** test si pile vide.
	 * 
	 * @return
	 * revoie si vide.
	 */
	public boolean estVide() {
		return (this.nbElem == 0);
	}

	/**
	 * vérification si pile est pleine.
	 * @return un booleen
	 */
	public boolean estPlein() {
		return (this.nbElem == this.tabNb.length);
	}

	/**
	 * 
	 * @param entier
	 * @return
	 */
	public int empiler(int entier) {
		if (this.estPlein()) {
			System.out.println("La pile est pleine");
			return PILE_PLEINE;
		}
		if (entier < 0) {
			System.out.println("Le nombre " + entier + " est inferieur à 0");
			return NEGATIF;
		}
		this.tabNb[nbElem] = entier;
		nbElem++;
		return SUCCES;
	}

	public int depiler() {
		if (this.estVide()) {
			System.out.println("La pile est vide"); // Normalement pas
													// d'affichage dans les
													// librairies mais des logs
			return PILE_VIDE;
		}
		this.nbElem = nbElem - 1;
		return this.tabNb[nbElem];
	}

	public int getTailleTab() {
		return this.tabNb.length;
	}

	public void contenu() {
		System.out.println("------------------  Contenu ----------------");
		for (int i = this.nbElem; i > 0; i--) {
			System.out.println("l'élément numero : " + i + " vaut "
					+ this.tabNb[i - 1]);
		}
		System.out.println("--------------------------------------------");
	}
}
