package br.com.s2it.incubadora.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.s2it.incubadora.model.Dependentes;

@Repository
public class DependentesRepository extends AbstractRepository {

	@SuppressWarnings("unchecked")
	public List<Dependentes> listAll() {
		Criteria criteria = getSession().createCriteria(Dependentes.class);
		return criteria.list();
	}

	public Object findById(int idContribuinte) {
		Criteria criteria = getSession().createCriteria(Dependentes.class);
		criteria.add(Restrictions.eq("codContribuinte", idContribuinte));
		return criteria.uniqueResult();
	}
}
