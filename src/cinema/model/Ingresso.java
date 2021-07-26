package cinema.model;

import java.util.Objects;

public final class Ingresso {
	private Integer codigo;
	private String filme;
	private Double preco;
	private String horario;
    
	public Ingresso(){}

	public Ingresso(Integer codigo, String filme, Double preco, String horario) {
		this.codigo = codigo;
		this.filme = filme;
		this.preco = preco;
		this.horario = horario;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 11 * hash + Objects.hashCode(this.codigo);
		hash = 11 * hash + Objects.hashCode(this.filme);
		hash = 11 * hash + Objects.hashCode(this.preco);
		hash = 11 * hash + Objects.hashCode(this.horario);
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
		final Ingresso other = (Ingresso) obj;
		if (!Objects.equals(this.codigo, other.codigo)) {
			return false;
		}
		if (!Objects.equals(this.filme, other.filme)) {
			return false;
		}
		if (!Objects.equals(this.preco, other.preco)) {
			return false;
		}
		if (!Objects.equals(this.horario, other.horario)) {
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

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Ingresso{" + "codigo=" + codigo + ", filme=" + filme 
			+ ", preco=" + preco + ", horario=" + horario + '}';
	}
	
	
    
	
    
}
