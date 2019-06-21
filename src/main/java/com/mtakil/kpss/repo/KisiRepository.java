package com.mtakil.kpss.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mtakil.kpss.entity.Kisi;


public interface KisiRepository extends CrudRepository<Kisi, Long> {

	public Optional<Kisi> findByTcno(String tcno);
	
}
