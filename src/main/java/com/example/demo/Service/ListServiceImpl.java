/*package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Domain.list;
import com.example.demo.Repository.ListRepository;

public class ListServiceImpl implements ListService{

	@Autowired
	private ListRepository listrepo;
	
	public List<list> getList(long uid) {
		return (List<list>) listrepo.getById(uid);
	}

}*/