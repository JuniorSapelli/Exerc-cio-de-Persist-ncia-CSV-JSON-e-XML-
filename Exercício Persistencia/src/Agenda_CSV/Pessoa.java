package Agenda_CSV;

import java.util.Date;

public class Pessoa {

	private int codigo;
	private String nome;
	private String email;
	private Date dataNasc;
	private String telefone;
	
	//set e ge
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if(codigo > 0)
			this.codigo = codigo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0)
			this.nome = nome;
	}
	
	//toString
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
}