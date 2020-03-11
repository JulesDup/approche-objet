package fr.Diginamic.jdr.entites;

import java.util.Random;

public abstract class Monstre {
	/** force : du monstre */
	int force;
	/** vie : du montre */
	int pv;

	/**
	 * Constructeur
	 * 
	 * @param force du montre
	 * @param vie   du montre
	 */
	public Monstre() {
		this.force = this.genereNbreRandom(12, 18);
		this.pv = this.genereNbreRandom(20, 50);
	}

	/**
	 * Getter
	 * 
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/**
	 * Getter
	 * 
	 * @return the vie
	 */
	public int getPv() {
		return pv;
	}

	/**
	 * Setter
	 * 
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/**
	 * Setter
	 * 
	 * @param vie the vie to set
	 */
	public void setVie(int pv) {
		this.pv = pv;
	}

	@Override
	public String toString() {
		return "Sauvage [force=" + force + ", pv=" + pv + "]";
	}

	protected int genereNbreRandom(int min, int max) {
		Random r = new Random();
		int valeur = min + r.nextInt(max - min);

		return valeur;

	}
}
