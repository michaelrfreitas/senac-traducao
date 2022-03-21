package br.aca.senac.traducao.repository;

import java.io.Serializable;
import java.util.List;

import br.aca.senac.traducao.domain.model.FileEntity;

public interface IFileDao<T extends Serializable> {
	
	void save(FileEntity entity);

	List<FileEntity> findAll();

	FileEntity find(String year, String month, String name);
}
