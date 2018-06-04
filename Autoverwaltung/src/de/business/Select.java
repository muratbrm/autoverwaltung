package de.business;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import de.db.MySQLConn;
import de.model.Auto;
import de.model.Users;

public class Select {
	private final MySQLConn mySQLConn = new MySQLConn();
	/**
	 * Die Methode setzt den User Typ, damit man bestimmen kann auf welche Methoden der User zugreifen kann.
	 * @author murat
	 * @throws SQLException
	 * @param users
	 */
	public void setUserType(Users users) {
		PreparedStatement pstmt = null;
		try {
			pstmt = mySQLConn.getConnection().prepareStatement("SELECT ID, Pwd, UserType FROM users WHERE ID = ?");
			pstmt.setString(1, users.getId());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Users.userType = rs.getString("UserType");
			}
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
	/**
	 * Diese Methode holt die Metadaten von einem Auto aus der MySQL DB raus. 
	 * @param auto
	 * @throws SQLException
	 * @return {@link Auto}
	 */
	public Auto selectAutoMD(Auto auto) {
		PreparedStatement pstmt = null;
		try {
			pstmt = mySQLConn.getConnection().prepareStatement("SELECT * FROM auto WHERE fin = ?");
			pstmt.setString(1, auto.getFin());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				auto = new Auto(rs.getString("FIN"), rs.getString("Motor"), rs.getInt("Tueren"), 
						rs.getInt("Leistung"), rs.getString("Fahrzeugart"), rs.getInt("Sitze"), 
						rs.getDate("Baujahr"), rs.getString("Austattungen"),
						rs.getString("Modell"), rs.getInt("Preis"));
			}
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
		return auto;
	}
	
	public List<Auto> selectAllAutoMD() {
		PreparedStatement pstmt = null;
		List<Auto> auto = new ArrayList<>();
		try {
			pstmt = mySQLConn.getConnection().prepareStatement("SELECT * FROM auto");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				auto.add(new Auto(rs.getString("FIN"), rs.getString("Motor"), 
						rs.getInt("Tueren"), rs.getInt("Leistung"), rs.getString("Fahrzeug"), 
						rs.getInt("Sitze"), rs.getDate("Baujahr"), rs.getString("Austattungen"),
						rs.getString("Modell"), rs.getInt("Preis")));
			}
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
		return auto;
	}
}
