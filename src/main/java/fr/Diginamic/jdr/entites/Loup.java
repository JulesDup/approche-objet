package fr.Diginamic.jdr.entites;

public class Loup extends Monstre {

	public Loup() {
		this.force = this.genereNbreRandom(3, 8);
		this.pv = this.genereNbreRandom(5, 10);
	}

}
