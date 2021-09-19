package com.ChatService.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ChatService.app.entity.Messege;

@Repository
public interface MessegeRepository extends JpaRepository<Messege, Long> {

}
