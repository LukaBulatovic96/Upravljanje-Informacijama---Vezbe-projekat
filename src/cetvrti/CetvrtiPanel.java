package cetvrti;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import prvi.PrviAction;

public class CetvrtiPanel extends JPanel{

	private JTextArea textArea; 
	private JButton submitButton;
	private CetvrtiAction cetvrtiAction;
	
	public CetvrtiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("cetvrti Submit");
		 textArea = new JTextArea(15, 40);
		 
		 cetvrtiAction = new CetvrtiAction(this);
		 submitButton.addActionListener(cetvrtiAction);
		 
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
