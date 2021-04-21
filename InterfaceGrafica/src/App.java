import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class App{

	public static void main(String[] args) {

		JFrame janela = new JFrame("Fiap Movies");
		janela.setSize(600, 310);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane abas = new JTabbedPane();
		
		janela.getContentPane().add(abas);
		
		JPanel panelCadastro = new JPanel();
		panelCadastro.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelCadastro.setLayout(new MigLayout("", "[200.00][95.00px][10.00px][95.00px][50.00][150.00px]", "[30px][30.00px][30px][30px][30px][30px][30px]"));
		
		JLabel tituloFilme = new MeuLabel("Título");
		panelCadastro.add(tituloFilme, "cell 1 0,grow");
		
		JTextField textFieldTitulo = new JTextField();
		textFieldTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		panelCadastro.add(textFieldTitulo, "cell 1 1 3 1,grow");
		textFieldTitulo.setColumns(10);
				
		JLabel sinopseFilme = new MeuLabel("Sinopse");
		panelCadastro.add(sinopseFilme, "cell 1 2,alignx left,growy");
		
		JTextField textFieldSinopse = new JTextField();
		textFieldSinopse.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldSinopse.setColumns(10);
		panelCadastro.add(textFieldSinopse, "cell 1 3 3 1,grow");
		
		JLabel generoFilme = new MeuLabel("Gênero");
		panelCadastro.add(generoFilme, "cell 1 4,alignx left,growy");
		
		JComboBox<String> comboBoxGenero = new JComboBox();
		comboBoxGenero.addItem("Ação");
		comboBoxGenero.addItem("Aventura");
		comboBoxGenero.addItem("Comédia");
		comboBoxGenero.addItem("Drama");
		comboBoxGenero.addItem("Ficção Científica");
		comboBoxGenero.addItem("Romance");
		comboBoxGenero.addItem("Terror");
		comboBoxGenero.setSelectedItem(null);
		panelCadastro.add(comboBoxGenero, "cell 1 5 3 1,grow");
		
		JLabel ondeAssistirFilme = new MeuLabel("Onde Assistir");
		panelCadastro.add(ondeAssistirFilme, "cell 5 0,alignx left,growy");
		
		JRadioButton buttonNetflix = new JRadioButton("Netflix");
		buttonNetflix.setFont(new Font("Arial", Font.BOLD, 14));
		buttonNetflix.setBounds(523, 80, 110, 30);
		panelCadastro.add(buttonNetflix, "cell 5 1");
		
		JRadioButton buttonPrimeVideo = new JRadioButton("Prime Video");
		buttonPrimeVideo.setFont(new Font("Arial", Font.BOLD, 14));
		buttonPrimeVideo.setBounds(523, 110, 110, 30);
		panelCadastro.add(buttonPrimeVideo, "flowy,cell 5 2");
		
		JRadioButton buttonPirateBay = new JRadioButton("Pirate Bay");
		buttonPirateBay.setFont(new Font("Arial", Font.BOLD, 14));
		buttonPirateBay.setBounds(523, 140, 110, 30);
		panelCadastro.add(buttonPirateBay, "cell 5 3");
		
		ButtonGroup ondeAssistir = new ButtonGroup();
		ondeAssistir.add(buttonNetflix);
		ondeAssistir.add(buttonPrimeVideo);
		ondeAssistir.add(buttonPirateBay);
		
		JCheckBox checkBoxAssistido = new JCheckBox("Assistido");
		checkBoxAssistido.setFont(new Font("Arial", Font.BOLD, 14));
		panelCadastro.add(checkBoxAssistido, "cell 5 4,grow");
		
		JLabel avaliacaoFilme = new MeuLabel("Avaliação");
		panelCadastro.add(avaliacaoFilme, "cell 5 5,alignx left,growy");
		
		StarRater avaliacao = new StarRater(5, 0);
		panelCadastro.add(avaliacao, "cell 5 6,growx,aligny top");
		
		JButton buttonSalvar = new JButton("Salvar");
		panelCadastro.add(buttonSalvar, "cell 1 6,growx,aligny bottom");
		
		JButton buttonCancelar = new JButton("Cancelar");
		panelCadastro.add(buttonCancelar, "cell 3 6,growx,aligny bottom");
		
		abas.add("Cadastro", panelCadastro);
		abas.add("Lista", new JLabel("A desenvolver..."));
		
		AppListener filme = new AppListener(textFieldTitulo, textFieldSinopse, comboBoxGenero, buttonNetflix, buttonPrimeVideo, buttonPirateBay, checkBoxAssistido, avaliacao);
		
		buttonSalvar.addActionListener(filme);
	}
	
}

	

