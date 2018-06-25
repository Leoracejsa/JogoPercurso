package br.com.program.dto;

import java.util.List;

import br.com.program.model.classes.OptionAnswer;

public class QuestionDto {
	private Integer difficulty;
	private String statement;
	private List<OptionAnswer> option;
	private Long theme;
	
	public Integer getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public List<OptionAnswer> getOption() {
		return option;
	}
	public void setOption(List<OptionAnswer> option) {
		this.option = option;
	}
	public Long getTheme() {
		return theme;
	}
	public void setTheme(Long theme) {
		this.theme = theme;
	}
	
	
	
}
