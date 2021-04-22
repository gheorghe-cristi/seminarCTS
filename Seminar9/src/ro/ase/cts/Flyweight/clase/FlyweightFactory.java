package ro.ase.cts.Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, Flyweight> clienti;

	public FlyweightFactory() {
		super();
		this.clienti = new HashMap<>();
	}
	
	public Flyweight getFlyweight(String nrTel) {
		if(clienti.containsKey(nrTel)) {
			return clienti.get(nrTel);
		} else {
			Flyweight client = new Client("-",nrTel, "-");
			clienti.put(nrTel, client);
			return client;
		}
	}
	
}
