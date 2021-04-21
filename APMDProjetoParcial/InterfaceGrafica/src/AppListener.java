import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AppListener implements ActionListener{

	private JTextField textFieldTitulo;
	private JTextField textFieldSinopse;
	private JComboBox<String> comboBoxGenero;
	private JRadioButton buttonNetflix;
	private JRadioButton buttonPrimeVideo;
	private JRadioButton buttonPirateBay;
	private JCheckBox checkBoxAssistido;
	private StarRater avalia;
	
	public AppListener(JTextField textFieldTitulo, JTextField textFieldSinopse, JComboBox<String> comboBoxGenero, JRadioButton buttonNetflix,
			           JRadioButton buttonPrimeVideo, JRadioButton buttonPirateBay, JCheckBox checkBoxAssistido, StarRater avalia) {
		this.textFieldTitulo = textFieldTitulo;
		this.textFieldSinopse = textFieldSinopse;
		this.comboBoxGenero = comboBoxGenero;
		this.buttonNetflix = buttonNetflix;
		this.buttonPrimeVideo = buttonPrimeVideo;
		this.buttonPirateBay = buttonPirateBay;
		this.checkBoxAssistido = checkBoxAssistido;
		this.avalia = avalia;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String titulo = String.valueOf(textFieldTitulo.getText());
		String sinopse = String.valueOf(textFieldSinopse.getText());
		String genero = (String) comboBoxGenero.getSelectedItem();
		String ondeAssistir = null;
		if (buttonNetflix.isSelected())
			ondeAssistir = "Netflix";
		else if (buttonPrimeVideo.isSelected())
			ondeAssistir = "Prime Video";
		else if (buttonPirateBay.isSelected())
			ondeAssistir = "Pirate Bay";
		else
			ondeAssistir = "Não há em nenhuma plataforma";
		String assistido = null;
		if (checkBoxAssistido.isSelected())
			assistido = "Já assistido";
		else
			assistido = "Ainda não assistido";
		Integer avaliacao = avalia.getSelection();
		
		System.out.println("Título: " + titulo + "\nSinopse: " + sinopse + "\nGênero: " + genero + "\nOnde Assistir: " + ondeAssistir + "\nJá ssistido: " + assistido
					     + "\nAvaliação: " + avaliacao + "\n");
		
		new Filme(titulo, sinopse, genero, ondeAssistir, assistido, avaliacao); 
		
		
	}
}