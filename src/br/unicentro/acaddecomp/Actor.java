package br.unicentro.acaddecomp;

public abstract class Actor {
	protected Mediador mediador;
	
	public void setMediador(Mediador m){
		mediador = m;
	}
}
