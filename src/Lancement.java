
public class Lancement {

	public static void main(String[] args) {
		PileEntierPositifOuNul pile = new PileEntierPositifOuNul();
		PileEntierPositifOuNul pile2 = new PileEntierPositifOuNul(15);
		pile.empiler(15);
		pile.empiler(5);
		pile.empiler(3);
		pile.empiler(4);
		pile.empiler(-5);
		pile.empiler(8);
		pile.empiler(7777);
		pile.contenu();
		pile2.depiler();
		pile.depiler();
		pile.contenu();
	}

}
