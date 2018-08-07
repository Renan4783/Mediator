package br.unicentro.acaddecomp;

public class ConcreteActor extends Actor{
	
	private String nome;
	
	public ConcreteActor(String nome){
		this.nome = nome;
	}
	
	public void send(String msg, ConcreteActor[] dests){
		for (int i = 0; i<dests.length; i++){
			mediador.send(msg, this, dests[i]);
		}
	}
	
	public void notify(String msg, ConcreteActor from){
		System.out.println("Actor "+ this.nome +" recebeu de "+ from.nome + ": " + msg);
	}
}
