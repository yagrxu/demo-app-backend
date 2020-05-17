package com.alibaba.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.demo.mapper.PersonMapper;
import com.alibaba.demo.model.Person;

@Component
public class PersonServiceImpl {

	@Autowired
	private PersonMapper personMapper;

	public List<Person> getPersons() {
		return personMapper.findAll();
	}

	public void addPerson(Person person) {
		personMapper.addPerson(person);
	}

}