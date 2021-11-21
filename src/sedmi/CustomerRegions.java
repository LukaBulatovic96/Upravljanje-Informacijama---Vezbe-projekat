package sedmi;

public class CustomerRegions {
	
	private int customerCount;
	private double avgSales;
	private double avgSpent;
	
	public CustomerRegions(int customerCount, double avgSales, double avgSpent) {
		
		this.customerCount = customerCount;
		this.avgSales = avgSales;
		this.avgSpent = avgSpent;
	}

	public CustomerRegions() {
		
	}

	public int getCustomerCount() {
		return customerCount;
	}

	public void setCustomerCount(int customerCount) {
		this.customerCount = customerCount;
	}

	public double getAvgSales() {
		return avgSales;
	}

	public void setAvgSales(double avgSales) {
		this.avgSales = avgSales;
	}

	public double getAvgSpent() {
		return avgSpent;
	}

	public void setAvgSpent(double avgSpent) {
		this.avgSpent = avgSpent;
	}

	@Override
	public String toString() {
		return "CustomerRegions [customerCount=" + customerCount + ", avgSales=" + avgSales + ", avgSpent=" + avgSpent
				+ "]";
	}
	
	

}
