
public class MaClasse {
    // Déclaration de la variable pasdswor
    private String password;

    // Constructeur
    public MaClasse(String password) {
        this.password = password;
    }

    // Méthode pour accéder à la variable password
    public String getPassword() {
        return password;
    }

    // Méthode pour modifier la variable password
    public void setPassword(String password) {
        this.password = password;
    }

    // Méthode principale (pour tester la classe)
    public static void main(String[] args) {
        // Création d'un objet MaClasse avec un mot de passe initial
        MaClasse objet = new MaClasse("monMotDePasse1234");

        // Affichage du mot de passe initial
        System.out.println("Mot de passe : " + objet.getPassword());

        // Modification du mot de passe
        objet.setPassword("nouveauMotDePasse12356");

        // Affichage du mot de passe mis à jour
        System.out.println("Nouveau mot de passe : " + objet.getPassword());
    }
}
