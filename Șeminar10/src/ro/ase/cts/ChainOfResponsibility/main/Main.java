package ro.ase.cts.ChainOfResponsibility.main;

import ro.ase.cts.ChainOfResponsibility.clase.Client;
import ro.ase.cts.ChainOfResponsibility.clase.NotificatorEmail;
import ro.ase.cts.ChainOfResponsibility.clase.NotificatorSMS;

public class Main {
    public static void main(String[] args) {

    	Client client1= new Client("Gigi",null,null);
        Client client2= new Client("Gica","079293",null);
        Client client3= new Client("Gheorghe",null,"gheorghe@gmail.com");


        NotificatorSMS notificatorSMS= new NotificatorSMS();
        NotificatorEmail notificatorEmail= new NotificatorEmail();

        notificatorSMS.setNotificator(notificatorEmail);

        notificatorSMS.trimiteNotificare(client1,"Mesaj1");
        notificatorSMS.trimiteNotificare(client2,"Mesaj2");
        notificatorSMS.trimiteNotificare(client3,"Mesaj3");



    }
}
