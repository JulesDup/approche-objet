package fr.Diginamic.jdr.entites;

public class Troll extends Monstre {

	public Troll() {
		this.force = this.genereNbreRandom(10, 15);
		this.pv = this.genereNbreRandom(20, 30);

	}

}
