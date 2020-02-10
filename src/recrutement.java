
public class recrutement {

	static String nom;

	static String prenom;

	static String formation;

	static int experience;
	
	static String [] competence = new String[3];

	static String attenteCours;

	public recrutement() {
		// TODO Auto-generated constructor stub
	}
	
	public String[] getCompetence() {
		
		return this.competence;
		
	}
	
   public void setCompetence(String[] competence) {
		
		this.competence = competence;
		
	}

	public recrutement(String pNom, String pPrenom, String pFormation, int pExperience,String [] pCompetence, String pAttenteCours) {

		nom = pNom;
		prenom = pPrenom;
		formation = pFormation;
		experience = pExperience;
		competence = pCompetence;
		attenteCours = pAttenteCours;

	}

	public static void affiche() {

		System.out.println("Nom : " + nom + "\n" + "Prenom :" + prenom + "\n" + "Formation : " + formation + "\n"
				+ "Expérience : " + experience + "\n" +"Compétence : "+competence[0]+" et " +competence[1] + "\n" + "Attente du cours : " + attenteCours);

	}
}
