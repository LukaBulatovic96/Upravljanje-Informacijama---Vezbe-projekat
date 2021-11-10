package trinaesti;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import sedmi.SedmiAction;

public class TrinaestiPanel extends JPanel{
	

	private JTextArea textArea; 
	private JButton submitButton;
	private TrinaestiAction trinaestiAction;
	
	public TrinaestiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("trinaesti Submit");
		 textArea = new JTextArea(15, 40);
		 
		 trinaestiAction = new TrinaestiAction(this);
		 submitButton.addActionListener(trinaestiAction);
		 
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
