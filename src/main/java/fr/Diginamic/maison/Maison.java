package fr.Diginamic.maison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Maison {
	/** tabPiece : Liste de piece d'un maison */
	private Piece[] tabPieces;

	/**
	 * Constructeur
	 * 
	 * @param tabPieces[] contient les pieces de la maison
	 */
	public Maison() {
		this.tabPieces = new Piece[0];
	}

	/**
	 * @param piece a ajouter a la maison
	 */
	public void ajouterPiece(Piece piece) {
		if (piece != null && 0 < piece.getSuperficie() && piece.getNbEtage() >= 0) {
			Piece[] p = new Piece[tabPieces.length + 1];
			System.arraycopy(tabPieces, 0, p, 0, tabPieces.length);
			tabPieces = p;
			tabPieces[tabPieces.length - 1] = piece;
		} else {
			System.out.println("la piece ajouté n'est pas conforme ");
		}
	}

	/**
	 * @return La superfie total de la maison
	 */
	public double getSuperficieMaison() {
		double supMaison = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			supMaison += tabPieces[i].getSuperficie();
		}
		return supMaison;
	}

	/**
	 * @param etage de la maison
	 * @return superficie d'un etage donnée
	 */
	public double getSuperficieEtage(int etage) {
		double supEtage = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].getNbEtage() == etage) {
				supEtage += tabPieces[i].getSuperficie();
			}
		}
		return supEtage;
	}

	@Override
	public String toString() {
		return "Sperficie de la maison :" + getSuperficieMaison();
	}
}
