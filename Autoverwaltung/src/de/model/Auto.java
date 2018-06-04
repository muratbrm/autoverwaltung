package de.model;

import java.sql.Date;

public class Auto {
	private final String fin;
	private final String motor;
	private final int tueren;
	private final int leistung;
	private final String fahrzeugart;
	private final int sitze;
	private final Date baujahr;
	private final String austattungen;
	private final String modell;
	private final int preis;
	public Auto(String fin, String motor, int tueren, int leistung, String fahrzeugart, int sitze, Date baujahr,
			String austattungen, String modell, int preis) {
		this.fin = fin;
		this.motor = motor;
		this.tueren = tueren;
		this.leistung = leistung;
		this.fahrzeugart = fahrzeugart;
		this.sitze = sitze;
		this.baujahr = baujahr;
		this.austattungen = austattungen;
		this.modell = modell;
		this.preis = preis;
	}
	public String getFin() {
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
	public Date getBaujahr() {
		return baujahr;
	}
	public String getAustattungen() {
		return austattungen;
	}
	public String getModell() {
		return modell;
	}
	public int getPreis() {
		return preis;
	}
}
