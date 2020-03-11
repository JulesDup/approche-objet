package fr.Diginamic.jdr.entites;

public class Gobelin extends Monstre {

	public Gobelin() {
		this.force = this.genereNbreRandom(5, 10);
		this.pv = this.genereNbreRandom(10, 15);
	}

}
