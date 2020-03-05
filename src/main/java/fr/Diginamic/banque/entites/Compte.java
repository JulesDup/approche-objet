package fr.Diginamic.banque.entites;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author jules
 *
 */
public class Compte {

	/** numCompte : */
	protected String numCompte;
	/** soldeCompte : */
	protected int soldeCompte;
	/** soldeInitial : */
	int soldeInitial;
	/** tabOperation : */
	private List<Operation> listOperation;

	/**
	 * Constructeur
	 * 
	 * @param numCompte
	 * @param soldeCompte
	 */
	public Compte(String numCompte, int soldeCompte) {
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

	public Compte(Compte compte) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Getter
	 * 
	 * @return the numCompte
	 */
	public String getNumCompte() {
		return numCompte;
	}

	/**
	 * Setter
	 * 
	 * @param numCompte the numCompte to set
	 */
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	/**
	 * Getter
	 * 
	 * @return the soldeCompte
	 */
	public int getSoldeCompte() {
		return soldeCompte;
	}

	/**
	 * Setter
	 * 
	 * @param soldeCompte the soldeCompte to set
	 */
	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	/**
	 * Getter
	 * 
	 * @return the soldeInitial
	 */
	public int getSoldeInitial() {
		return soldeInitial;
	}

	/**
	 * Setter
	 * 
	 * @param soldeInitial the soldeInitial to set
	 */
	public void setSoldeInitial(int soldeInitial) {
		this.soldeInitial = soldeInitial;
	}

	// Methode
	public void ajouterOperation(Operation ope) {
		listOperation.add(ope);
	}
	
	public double getSolde(int soldeInitial) {
		double soldeCompte = soldeInitial; 
		for (Iterator<Operation> it = listOperation.iterator(); it.hasNext(); ) {
			Operation a = it.next(); 
			soldeCompte +=a.montantOperation; 
		}		
		return soldeCompte;	
	}

	
	public double getSolde(String type) {
		
		return soldeCompte;
		
	}
	
	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + "]";
	}

}
