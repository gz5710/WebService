/**
 * 
 */
package com.tmax.facturation;

/**
 * @author Bruce GONG
 *
 */
public class Facturation {
	public Result getResult(String compteRendu){
		String facture = "\n Cet opération coûtera 20000 euros.\n";
		Result r = new Result(compteRendu,facture);
		return r;
	}
}

class Result{
	private String compteRendu;
	private String facture;
	public String getCompteRendu() {
		return compteRendu;
	}
	public void setCompteRendu(String compteRendu) {
		this.compteRendu = compteRendu;
	}
	public String getFacture() {
		return facture;
	}
	public void setFacture(String facture) {
		this.facture = facture;
	}
	@Override
	public String toString() {
		return "Result [compteRendu=" + compteRendu + ", facture=" + facture + "]";
	}
	public Result(String compteRendu, String facture) {
		super();
		this.compteRendu = compteRendu;
		this.facture = facture;
	}
	
}
