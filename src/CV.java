
public class CV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Bienvenue chez Barette! ");
		String attente1 = "Devenir Billionnaire";
		String attente2 = "Devenir le Meilleur";

		String[] competence1 = { "Gestion", "Logiciel" };
		String[] competence2 = { "Gestion", "Logiciel & réseautage" };
		recrutement selection = new recrutement("Jemai", "Mehdi", "Technique Informatique", 3, competence1, attente2);
		recrutement.affiche();
		System.out.println("---------------------------------------");
		recrutement selection1 = new recrutement("El-Wasmi", "Yassmine", "Technique Informatique", 3, competence2,
				attente1);
		recrutement.affiche();

	}

}
