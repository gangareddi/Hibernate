package Com.springHibernate;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class Dao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void insert(Registration registration) {
		hibernateTemplate.save(registration);

	}
}
