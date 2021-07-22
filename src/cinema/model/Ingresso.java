package cinema.model;

import java.time.LocalTime;
import java.util.Objects;

public final class Ingresso {
	private Integer codigo;
	private Filme filme;
	private Double preco;
	private LocalTime horario;
    
	public Ingresso(){}

	public Ingresso(Integer codigo, Filme filme, Double preco, String horario) {
		this.codigo = codigo;
		this.filme = filme;
		this.preco = preco;
		this.setHorario(horario);
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

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = LocalTime.parse(horario);
	}

	@Override
	public String toString() {
		return "Ingresso{" + "codigo=" + codigo + ", filme=" + filme 
			+ ", preco=" + preco + ", horario=" + horario + '}';
	}
	
	
    
	
    
}
