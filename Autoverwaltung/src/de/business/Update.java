package de.business;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import de.db.MySQLConn;
import de.model.Auto;

public class Update {
	private final MySQLConn mySQLConn = new MySQLConn();
	
	public void updateAutoMD(Auto auto) {
		PreparedStatement pstmt = null;
		try{
			pstmt = mySQLConn.getConnection().prepareStatement("UPDATE auto SET FIN = ?, Motor = ?, Tueren = ?, Leistung = ?, "
					+ "Fahrzeugart = ?, Sitze = ?, Baujahr = ?, Austattungen = ?, Modell = ?, Preis = ?");
			pstmt.setString(1, auto.getFin());
			pstmt.setString(2, auto.getMotor());
			pstmt.setInt(3, auto.getTueren());
			pstmt.setInt(4, auto.getLeistung());
			pstmt.setString(5, auto.getFahrzeugart());
			pstmt.setInt(6, auto.getSitze());
			pstmt.setDate(7, auto.getBaujahr());
			pstmt.setString(8, auto.getAustattungen());
			pstmt.setString(9, auto.getModell());
			pstmt.setInt(10, auto.getPreis());
			pstmt.executeUpdate();
		}catch(SQLException e) {
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
