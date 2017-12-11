package trabalho7pc3_rafaelpadilha.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import trabalho7pc3_rafaelpadilha.model.Aluno;
import trabalho7pc3_rafaelpadilha.persistence.AlunoDaoImp;

@ManagedBean
@ViewScoped
public class AlunoController {
	private Integer matricula=7;
	private String nome;
	private String ra;
	private Aluno aluno;
	private String mensagem;
	
	
	public void addAluno() {
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setRa(ra);
		AlunoDaoImp ad = new AlunoDaoImp();
		setMensagem(ad.save(aluno));
		aluno = new Aluno();
	}
	public void editAluno() {
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setRa(ra);
		AlunoDaoImp ad = new AlunoDaoImp();
		setMensagem(ad.update(aluno));
		aluno = new Aluno();
	}
	public void deleteAluno() {
		AlunoDaoImp ad = new AlunoDaoImp();
		setMensagem(ad.delete(matricula));
	}
	public List<Aluno> getAlunos(){
		AlunoDaoImp ad = new AlunoDaoImp();
		return ad.list();
	}
	public Aluno findAluno() {
		AlunoDaoImp ad = new AlunoDaoImp();	
		return ad.findByMatricula(matricula);
	}

	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
