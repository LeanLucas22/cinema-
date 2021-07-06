package cinema.model;

import java.util.Objects;

class Filme {
	private Integer codigo;
	private String nome;
	private String genero;
	private String sinopse;
	private Integer duracaoMinutos;

	public Filme(){}

	public Filme(Integer codigo, String nome, String genero, String sinopse, Integer duracaoMinutos) {
		this.codigo = codigo;
		this.nome = nome;
		this.genero = genero;
		this.sinopse = sinopse;
		this.duracaoMinutos = duracaoMinutos;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 89 * hash + Objects.hashCode(this.codigo);
		hash = 89 * hash + Objects.hashCode(this.nome);
		hash = 89 * hash + Objects.hashCode(this.genero);
		hash = 89 * hash + Objects.hashCode(this.sinopse);
		hash = 89 * hash + Objects.hashCode(this.duracaoMinutos);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Filme other = (Filme) obj;
		if (!Objects.equals(this.nome, other.nome)) {
			return false;
		}
		if (!Objects.equals(this.genero, other.genero)) {
			return false;
		}
		if (!Objects.equals(this.sinopse, other.sinopse)) {
			return false;
		}
		if (!Objects.equals(this.codigo, other.codigo)) {
			return false;
		}
		if (!Objects.equals(this.duracaoMinutos, other.duracaoMinutos)) {
			return false;
		}
		return true;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public Integer getDuracaoMinutos() {
		return duracaoMinutos;
	}

	public void setDuracaoMinutos(Integer duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}

	@Override
	public String toString() {
		return "Filme{" + "codigo=" + codigo + ", nome=" + nome 
			+ ", genero=" + genero + ", sinopse=" + sinopse 
			+ ", duracaoMinutos=" + duracaoMinutos + '}';
	}
	
	

    
    
    
}
