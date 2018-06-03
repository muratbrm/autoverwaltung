package de.model;

public class Auto {
	private final int fin;
	private final String motor;
	private final int tueren;
	private final int leistung;
	private final String fahrzeugart;
	private final int sitze;
	private final int baujahr;
	private final String austattungen;
	public Auto(int fin, String motor, int tueren, int leistung, String fahrzeugart, int sitze, int baujahr,
			String austattungen) {
		this.fin = fin;
		this.motor = motor;
		this.tueren = tueren;
		this.leistung = leistung;
		this.fahrzeugart = fahrzeugart;
		this.sitze = sitze;
		this.baujahr = baujahr;
		this.austattungen = austattungen;
	}
	public int getFin() {
		return fin;
	}
	public String getMotor() {
		return motor;
	}
	public int getTueren() {
		return tueren;
	}
	public int getLeistung() {
		return leistung;
	}
	public String getFahrzeugart() {
		return fahrzeugart;
	}
	public int getSitze() {
		return sitze;
	}
	public int getBaujahr() {
		return baujahr;
	}
	public String getAustattungen() {
		return austattungen;
	}
	
}
