package Controller;


import Model.Banque;
import Model.Client;
import Model.GuichetAutomatique;

public class MainController {
    public static void main(String[] args)
    {
        Client client = new Client();
        GuichetAutomatique guichet = new GuichetAutomatique();
        Banque banque = new Banque();
        String numeroDeCompte = "";

        banque.AttribuerGuichetAutomatiqueAUnClient(client);
        client.SelectionnerCompte(numeroDeCompte);
        client.OptenirAideAuGuichetAutomatique();
        client.EffectuerDepot();
        client.EffectuerRetrait();

    }
}
