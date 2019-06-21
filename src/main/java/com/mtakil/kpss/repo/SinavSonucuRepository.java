package com.mtakil.kpss.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mtakil.kpss.entity.SinavSonucu;


public interface SinavSonucuRepository extends CrudRepository<SinavSonucu, Long> {

	@Query("from SinavSonucu ss join ss.kisi k where k.tcno=:tcno")
	List<SinavSonucu> findByTcno(@Param("tcno") String tcno);
	
}
