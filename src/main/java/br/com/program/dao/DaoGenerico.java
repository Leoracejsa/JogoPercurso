package br.com.program.dao;

import java.util.List;

import br.com.program.model.classes.Question;

public interface DaoGenerico<T> {

	public boolean salvar(T obj);
	public boolean remover(Long id);
	public T buscar(Long id);
	public List BuscarTodos();
}
