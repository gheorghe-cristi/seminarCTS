package ro.ase.cts.ChainOfResponsibility.clase;

public class NotificatorSMS extends Notificator {
    @Override
    public void trimiteNotificare(Client client, String text) {

        if(client.getNrTelefon()!=null){
            System.out.println("Trimitere notificare prin SMS catre clientul "+client.getNume()+" "+text);
        }
        else if(super.getNotificator()!=null){
            super.getNotificator().trimiteNotificare(client,text);
        }
        else
        {  
            System.out.println("Nu avem datele de contact necesare!");
        }
    }
}
