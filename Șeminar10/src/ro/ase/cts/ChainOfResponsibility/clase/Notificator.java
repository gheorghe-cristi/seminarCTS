package ro.ase.cts.ChainOfResponsibility.clase;

public abstract class Notificator {

    private Notificator notificator;

    public void setNotificator(Notificator notificator) {
        this.notificator = notificator;
    }

    public Notificator getNotificator() {
        return notificator;
    }

    public abstract void trimiteNotificare(Client client, String text);
}
