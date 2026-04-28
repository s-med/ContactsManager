public class ContactsManager {

    Contact[] mesAmis;
    int nombreAmis;

    // Constructeur par défaut
    public ContactsManager() {
        this.nombreAmis = 0;
        this.mesAmis = new Contact[500];
    }

    // Ajouter un contact
    void ajouterContact(Contact contact) {
        mesAmis[nombreAmis] = contact;
        nombreAmis++;
    }

    // Rechercher un contact par nom
    Contact rechercherContact(String nomRecherche) {
        for (int i = 0; i < nombreAmis; i++) {
            if (mesAmis[i].nom.equals(nomRecherche)) {
                return mesAmis[i];
            }
        }
        return null;
    }
}