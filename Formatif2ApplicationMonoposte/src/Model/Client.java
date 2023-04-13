package Model;

public class Client {
    private GuichetAutomatique guichetAutomatique;

    public void SelectionnerCompte(String numeroDeCompte) {
        Banque.DonnerUnCompteAuClient();
    }

    public void OptenirAideAuGuichetAutomatique() {
    }

    private void RecevoirGuichetAutomatique(GuichetAutomatique guichet) {

    }

    public void EffectuerDepot() {
    }

    public void EffectuerRetrait() {
    }
}
