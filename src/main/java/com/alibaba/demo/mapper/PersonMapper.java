package com.alibaba.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.alibaba.demo.model.Person;

@Mapper
public interface PersonMapper {

	@Select("SELECT id as id, name as name, address as address FROM person")
	List<Person> findAll();

	@Insert("INSERT into person(name,address) VALUES(#{name}, #{address})")
	void addPerson(Person person);

}