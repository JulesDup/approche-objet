package fr.Diginamic.jdr.entites;

import java.util.Random;
import java.util.stream.IntStream;

public class Personnage {
	/** pseudo : */
	private String pseudo;
	/** force : du personnage */
	private int force;
	/** pv : Poit de vie de personnage */
	private int pv;
	/** score : Score du personnage */
	private int score;

	/**
	 * Constructeur
	 * 
	 * @param pseudo du personnage
	 * @param force  du personnage
	 * @param pv     du personnage
	 * @param score  du personnage
	 */
	public Personnage(String pseudo) {
		this.pseudo = pseudo;
		this.force = this.genereNbreRandom(12, 18);
		this.pv = this.genereNbreRandom(20, 50);
		this.score = 0;
	}

	/**
	 * Getter
	 * 
	 * @return the pseudo du personnage
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * Getter
	 * 
	 * @return the force du personnage
	 */
	public int getForce() {
		return force;
	}

	/**
	 * Getter
	 * 
	 * @return the pv du personnage
	 */
	public int getPv() {
		return pv;
	}

	/**
	 * Getter
	 * 
	 * @return the score du personnage
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Setter
	 * 
	 * @param pseudo du personnage
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * Setter
	 * 
	 * @param force du personnage
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/**
	 * Setter
	 * 
	 * @param pv ajout des pv du personnage
	 * 
	 */
	public void setPv(int pv) {
		this.pv = pv;
	}

	/**
	 * Setter
	 * 
	 * @param score ajout du score du personnage
	 */
	public void setScore(int score) {
		this.score = score;
	}

	private int genereNbreRandom(int min, int max) {

		Random r = new Random();
		int valeur = min + r.nextInt(max - min);

		return valeur;

	}

	@Override
	public String toString() {
		return "Statut de votre personnage [pseudo=" + pseudo + ", force=" + force + ", pv=" + pv + ", score=" + score
				+ "]";
	}
}
