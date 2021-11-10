package prvi;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class PrviPanel extends JPanel{

	private JTextArea textArea; 
	private JButton submitButton;
	private PrviAction prviAction;
	
	public PrviPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("prviSubmit");
		 textArea = new JTextArea(15, 40);
		 
		 prviAction = new PrviAction(this);
		 submitButton.addActionListener(prviAction);
		 
		 this.add(textArea);
		 this.add(submitButton);
		 
		
	}
	

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JButton getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(JButton submitButton) {
		this.submitButton = submitButton;
	}
	
	
	
}
