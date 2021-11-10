package jedanaesti;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import sedmi.SedmiAction;

public class JedanaestiPanel extends JPanel{
	
	

	private JTextArea textArea; 
	private JButton submitButton;
	private JedanaestiAction jedanaestiAction;
	
	public JedanaestiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("jedanaesti Submit");
		 textArea = new JTextArea(15, 40);
		 
		 jedanaestiAction = new JedanaestiAction(this);
		 submitButton.addActionListener(jedanaestiAction);
		 
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
