package prvi;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.AbstractAction;

import app.AppCore;


public class PrviAction extends AbstractAction{
	
	private PrviPanel prviPanel;

	public PrviAction(PrviPanel prviPanel) {
		this.prviPanel=prviPanel;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		try {
			testSQL();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

}
	
private void testSQL() throws SQLException {
		
		Statement stmt = AppCore.getInstance().getCon().createStatement();
		
		String statementString="select * from product";
		
		ResultSet rs = stmt.executeQuery(statementString);

		ResultSetMetaData rsmd = rs.getMetaData();
	
		
		
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
