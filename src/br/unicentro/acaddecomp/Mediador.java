package br.unicentro.acaddecomp;

public interface Mediador {
	
	void send(String msg, ConcreteActor from, ConcreteActor dest);
}
