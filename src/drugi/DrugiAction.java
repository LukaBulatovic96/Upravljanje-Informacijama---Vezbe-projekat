package drugi;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.AbstractAction;

import app.AppCore;



public class DrugiAction extends AbstractAction{
	
	private DrugiPanel drugiPanel;

	public DrugiAction(DrugiPanel drugiPanel) {
		this.drugiPanel=drugiPanel;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			testSQL();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
private void testSQL() throws SQLException {
		
		Statement stmt = AppCore.getInstance().getCon().createStatement();
		
		String statementString="select * from location";
		
		ResultSet rs = stmt.executeQuery(statementString);

		ResultSetMetaData rsmd = rs.getMetaData();
		
		ArrayList<String> columnList = new ArrayList<>();
		
		int columnsNumber = rsmd.getColumnCount();
		for (int i = 1; i <= columnsNumber; i++ ) {
			  String name = rsmd.getColumnName(i);
			  System.out.print(name + " ");
			  
			}
		System.out.println();
		System.out.println("____________________");
		
		while(rs.next()) {
			for (int j2 = 1; j2 <= columnsNumber; j2++) {
				System.out.print(rs.getString(j2) + " ");
			}
			System.out.println();
		}
		
		
	}

}
