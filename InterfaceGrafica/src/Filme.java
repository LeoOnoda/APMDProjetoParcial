
public class Filme {

	private String titulo;
	private String sinopse;
	private String genero;
	private String ondeAssistir;
	private String assistido;
	private Integer avaliacao;
	
	
	public Filme(String titulo, String sinopse, String genero, String ondeAssitir, String assistido, Integer avaliacao) {
		this.titulo = titulo;
		this.sinopse = sinopse;
		this.genero = genero;
		this.ondeAssistir = ondeAssistir;
		this.assistido = assistido;
		this.avaliacao = avaliacao;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getSinopse() {
		return sinopse;
	}


	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getOndeAssistir() {
		return ondeAssistir;
	}


	public void setOndeAssistir(String ondeAssistir) {
		this.ondeAssistir = ondeAssistir;
	}


	public String getAssistido() {
		return assistido;
	}


	public void setAssistido(String assistido) {
		this.assistido = assistido;
	}


	public Integer getAvaliacao() {
		return avaliacao;
	}


	public void setAvaliacao(Integer avaliacao) {
		this.avaliacao = avaliacao;
	}
}
