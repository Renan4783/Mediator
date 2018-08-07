package br.unicentro.acaddecomp;

import java.util.*;

public class MediadorConcreto implements Mediador{

	HashMap<Actor, Actor> Atores = new HashMap<>();
	
	@Override
	public void send(String msg, ConcreteActor from, ConcreteActor dest) {
		Atores.put(dest, dest);
		if (dest == Atores.get(dest)){
			dest.notify(msg, from);
		}
	}

}
