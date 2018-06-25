package br.com.program.model.classes;

import java.util.ArrayList;
import java.util.List;

import br.com.program.model.listed.DifficultyLevel;

public class Question {
	private Long id;
	private DifficultyLevel difficulty;
	private String statement;
	private List<OptionAnswer> options;
	private Theme theme;
	
	public DifficultyLevel getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(DifficultyLevel difficulty) {
		this.difficulty = difficulty;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public List<OptionAnswer> getOptions() {
		if(options == null )
			options = new ArrayList<OptionAnswer>();
		return options;
	}
	public void setOptions(List<OptionAnswer> options) {
		this.options = options;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Theme getTheme() {
		return theme;
	}
	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Question other = (Question) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
