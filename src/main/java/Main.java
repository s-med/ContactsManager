public class Main {
    public static void main(String[] args) {

        // 1. Créer le gestionnaire de contacts
        ContactsManager monGestionnaireContacts = new ContactsManager();

        // 2-5. Ajouter le premier contact
        Contact contact1 = new Contact("Ismael", "+225 0101165350");
        monGestionnaireContacts.ajouterContact(contact1);

        // 6. Ajouter 4 autres contacts
        Contact contact2 = new Contact("Ibrahim", "+225 0707531846");
        monGestionnaireContacts.ajouterContact(contact2);

        Contact contact3 = new Contact("Mariam", "+225 0748321779");
        monGestionnaireContacts.ajouterContact(contact3);

        Contact contact4 = new Contact("Moussa", "+225 0505002666");
        monGestionnaireContacts.ajouterContact(contact4);

        Contact contact5 = new Contact("Mohamed", "+225 0556722141");
        monGestionnaireContacts.ajouterContact(contact5);

        // 7. Rechercher un contact et afficher son numéro
        Contact trouve = monGestionnaireContacts.rechercherContact("Mohamed");

        if (trouve != null) {
            System.out.println("Contact trouvé : " + trouve.nom);
            System.out.println("Numéro de téléphone : " + trouve.numeroTelephone);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}