package com.ChatService.app.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ChatService.app.repository.MessegeRepository;
import com.ChatService.app.entity.*;




@Service
public class MessegeService implements MessegeInterface {

	@Autowired
	private MessegeRepository mesaRepository;
	

	@Override
	@Transactional(readOnly = true)
	public Iterable<Messege> findAll() {
		// TODO Auto-generated method stub
		return mesaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Messege> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return mesaRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Messege> findById(long id) {
		// TODO Auto-generated method stub
		return mesaRepository.findById(id);
	}

	@Override
	@Transactional
	public Messege Save(Messege mesa) {
		// TODO Auto-generated method stub
		return mesaRepository.save(mesa);
	}

	@Override
	@Transactional
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		mesaRepository.deleteById(id);
	}

}
