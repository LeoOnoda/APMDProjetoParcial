import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MeuLabel extends JLabel{
	
	private static final long serialVersionUID = 1L;
	
	public MeuLabel(String texto) {
		super(texto);
		init();
	}
	
	public void init() {
		this.setFont(new Font("Arial", Font.BOLD, 15));
		this.setHorizontalAlignment(JLabel.LEFT);
	}
}
