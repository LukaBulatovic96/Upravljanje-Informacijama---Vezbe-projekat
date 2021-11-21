package sedmi;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.AbstractAction;

import app.AppCore;
import peti.PetiPanel;

public class SedmiAction extends AbstractAction{
	
	private SedmiPanel sedmiPanel;

	public SedmiAction(SedmiPanel sedmiPanel) {
		this.sedmiPanel=sedmiPanel;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		try {
			selectView();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}
	
	public CustomerRegions selectView() throws SQLException {
		
		CustomerRegions customer = new CustomerRegions();
		String query = "SELECT * FROM customer_regions";
		PreparedStatement statement = AppCore.getInstance().getCon().prepareStatement(query);
		ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()){
		    	customer.setCustomerCount(resultSet.getInt("Customers"));
		    	customer.setAvgSales(resultSet.getDouble("averageOrders"));
		    	customer.setAvgSpent(resultSet.getDouble("averageSpent"));
		    }
			sedmiPanel.getTextArea().setText(customer.toString());
			return customer;
	}

}
