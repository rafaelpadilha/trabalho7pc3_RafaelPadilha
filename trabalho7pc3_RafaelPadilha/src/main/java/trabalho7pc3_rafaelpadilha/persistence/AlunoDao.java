package trabalho7pc3_rafaelpadilha.persistence;

import java.util.List;

import trabalho7pc3_rafaelpadilha.model.Aluno;


public interface AlunoDao {
	public String save(Aluno aluno);
	
	public String delete(int matricula);
	
	public String update(Aluno aluno);
	
	public  List<Aluno> list();
	
	public Aluno findByMatricula(int matricula);
}
