package drugi;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class DrugiPanel extends JPanel{
	
	private JTextArea textArea; 
	private JButton submitButton;
	private DrugiAction drugiAction;
	
	public DrugiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("drugi Submit");
		 textArea = new JTextArea(15, 40);
		 
		 drugiAction = new DrugiAction(this);
		 submitButton.addActionListener(drugiAction);
		 
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
