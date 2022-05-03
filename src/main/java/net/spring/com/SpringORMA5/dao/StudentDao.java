package net.spring.com.SpringORMA5.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import net.spring.com.SpringORMA5.entities.Student;

public class StudentDao {

	public HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Student student)
	{
		Integer r = (Integer) this.hibernateTemplate.save(student);
		
		return r;
	}
	
	public Student getstudent(int studid)
	{
		Student st = this.hibernateTemplate.get(Student.class,studid);
		return st;
	}
	
	//select all record
	public List<Student> getallstudent()
	{
		List<Student> loadAll =this.hibernateTemplate.loadAll(Student.class);
				return loadAll;
	}
	//delete a record
	public void deletestudent(int stid)
	{
		Student deletest =this.hibernateTemplate.get(Student.class, stid);
		this.hibernateTemplate.delete(deletest);
	}
}
