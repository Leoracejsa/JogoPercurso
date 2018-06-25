package br.com.program.model.classes;

public class OptionAnswer {
	private String resposta; 
	private boolean RespostaCerta;
	
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public boolean isRespostaCerta() {
		return RespostaCerta;
	}
	public void setRespostaCerta(boolean respostaCerta) {
		RespostaCerta = respostaCerta;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (RespostaCerta ? 1231 : 1237);
		result = prime * result + ((resposta == null) ? 0 : resposta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OptionAnswer other = (OptionAnswer) obj;
		if (RespostaCerta != other.RespostaCerta)
			return false;
		if (resposta == null) {
			if (other.resposta != null)
				return false;
		} else if (!resposta.equals(other.resposta))
			return false;
		return true;
	}

	
	
	
	
}
