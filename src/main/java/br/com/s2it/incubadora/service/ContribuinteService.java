package br.com.s2it.incubadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.s2it.incubadora.model.Contribuinte;
import br.com.s2it.incubadora.repository.ContribuinteRepository;

@Service
@Transactional
public class ContribuinteService {

	@Autowired
	private ContribuinteRepository repository;
	
	public void save(Contribuinte contribuinte){
		repository.persist(contribuinte);
	}
	
	public List<Contribuinte> listAll(){
		return repository.listAll();
		
	}
	
	public void update(Contribuinte contribuinte){
		repository.update(contribuinte);
	}
	
	public void delete(Contribuinte contribuinte) {
		repository.delete(contribuinte);		
	}
	
	public boolean canToRemove(int cod){
		Contribuinte contribuinte = null;
		
		try{
			contribuinte = (Contribuinte) repository.findById(cod);
		}catch (Exception e){
			return false;
		}
		if (contribuinte != null){
			return true;
		}
		
		return false;
		
	}
}
