package br.com.s2it.incubadora.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.s2it.incubadora.model.Contribuinte;

@Repository
public class ContribuinteRepository extends AbstractRepository {

	@SuppressWarnings("unchecked")
	public List<Contribuinte> listAll() {
		Criteria criteria = getSession().createCriteria(Contribuinte.class);
		return criteria.list();
	}

	public Object findById(int id) {
		Criteria criteria = getSession().createCriteria(Contribuinte.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.uniqueResult();
	}

}
