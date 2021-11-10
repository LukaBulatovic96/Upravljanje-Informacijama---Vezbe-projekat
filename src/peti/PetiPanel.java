package peti;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import cetvrti.CetvrtiAction;

public class PetiPanel extends JPanel{

	private JTextArea textArea; 
	private JButton submitButton;
	private PetiAction petiAction;
	
	public PetiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("peti Submit");
		 textArea = new JTextArea(15, 40);
		 
		 petiAction = new PetiAction(this);
		 submitButton.addActionListener(petiAction);
		 
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
