package ro.ase.cts.ChainOfResponsibility.clase;

public class NotificatorEmail extends Notificator {
    @Override
    public void trimiteNotificare(Client client, String text) {

        if(client.getEmail()!=null){
            System.out.println("Trimitere notificare prin email catre clientul "+client.getNume()+" "+text);
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
