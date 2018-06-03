package de.business;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import de.db.MySQLConn;
import de.model.Auto;

public class Insert {
	
	private final MySQLConn mySQLConn = new MySQLConn();
	
	/**
	 * Beschreibung: Methode für das Speichern von Auto Metadaten
	 * @author murat
	 * @throws SQLException
	 * @param auto
	 */
	public void insertAutoMD(Auto auto){
		PreparedStatement pstmt = null;
		try {
			pstmt = mySQLConn.getConnection()
					.prepareStatement("INSERT INTO auto (FIN, Motor, Tueren, Leistung, Fahrzeugart, Sitze, Baujahr, Austattungen) "
							+ "VALUES (?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, auto.getFin());
			pstmt.setString(2, auto.getMotor());
			pstmt.setInt(3, auto.getTueren());
			pstmt.setInt(4, auto.getLeistung());
			pstmt.setString(5, auto.getFahrzeugart());
			pstmt.setInt(6, auto.getSitze());
			pstmt.setInt(7, auto.getBaujahr());
			pstmt.setString(8, auto.getAustattungen());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
