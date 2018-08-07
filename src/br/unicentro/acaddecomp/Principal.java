package br.unicentro.acaddecomp;

public class Principal {
	public static void main(String[] args) {
		MediadorConcreto m = new MediadorConcreto();
		ConcreteActor paulo = new ConcreteActor("Paulo");
		ConcreteActor guilherme = new ConcreteActor("Guilherme");
		ConcreteActor vaimal = new ConcreteActor("Vai mal");
		paulo.setMediador(m);
		guilherme.setMediador(m);
		vaimal.setMediador(m);
		guilherme.send("Vamo almo�ar?", new ConcreteActor[] {paulo, vaimal});
		paulo.send("Vamo! Deixe eu terminar de almo�ar.", new ConcreteActor[] {guilherme, vaimal});
		vaimal.send("Ja almo�ei ja", new ConcreteActor[] {paulo, guilherme});
	}
}
