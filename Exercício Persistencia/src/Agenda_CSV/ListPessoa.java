package Agenda_CSV;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListPessoa {
	
	List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	public boolean add(Pessoa pessoa) {
		listaPessoas.add(pessoa);
		return true;
	}
	
	public List<Pessoa> getList(){
		return listaPessoas;
	}
	
	public void setList(List<Pessoa> list){
		this.listaPessoas = list;
	}
	
	public void alterar(Pessoa pessoa) {
		for(int i = 0; i < listaPessoas.size(); i++) {
			
		}
	}
	
	public void excluir(Pessoa pessoa) throws IOException {
		PersistenciaCSV arq = new PersistenciaCSV();
		for(int i = 0; i < listaPessoas.size(); i++) {
			if(pessoa.getNome().equalsIgnoreCase(listaPessoas.get(i).getNome()))
				listaPessoas.remove(pessoa);
		}
		arq.gravar(listaPessoas);
	}
	
	public List<Pessoa> consultaPorNome(String nome){
		List<Pessoa> consultaNome = new ArrayList<Pessoa>();
		for(int i = 0; i < listaPessoas.size(); i++) {
			if(listaPessoas.get(i).getNome().contains(nome)) {
				consultaNome.add(listaPessoas.get(i));
			}
		}
		return consultaNome;
	}
	
	public void aniversariantes(int mes) {
		
	}
	
	public List<Pessoa> consultaEmail(String email) {
		List<Pessoa> consultaEmail = new ArrayList<Pessoa>();
		for(int i = 0; i < listaPessoas.size(); i++) {
			if(listaPessoas.get(i).getEmail().contains(email)) {
				consultaEmail.add(listaPessoas.get(i));
			}
		}
		return consultaEmail;
	}

}
