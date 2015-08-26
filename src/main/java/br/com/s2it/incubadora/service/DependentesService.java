package br.com.s2it.incubadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.s2it.incubadora.model.Contribuinte;
import br.com.s2it.incubadora.model.Dependentes;
import br.com.s2it.incubadora.repository.DependentesRepository;

@Service
@Transactional
public class DependentesService {

	@Autowired
	private DependentesRepository repository;

	public void save(Dependentes dependentes) {
		repository.persist(dependentes);
	}

	public List<Dependentes> listAll() {
		return repository.listAll();

	}

	public void update(Contribuinte contribuinte) {
		repository.update(contribuinte);
	}

	public void delete(Contribuinte contribuinte) {
		repository.delete(contribuinte);
	}

	// public boolean canToRemove(int cod){
	//
	// }
}
