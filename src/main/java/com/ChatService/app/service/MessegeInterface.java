package com.ChatService.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ChatService.app.entity.Messege;





public interface MessegeInterface {
	
	public Iterable<Messege> findAll();
	
	public Page<Messege> findAll(Pageable pageable);
	
	public Optional<Messege> findById(long id);
	
	public Messege Save(Messege mesa);
	
	public void deleteById(long id);

}
