package com.mtakil.kpss.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mtakil.kpss.entity.SinavSonucu;
import com.mtakil.kpss.repo.SinavSonucuRepository;


@RestController
public class SinavSonucuController {

	private static final Logger logger = LoggerFactory.getLogger(SinavSonucuController.class);
	
	@Autowired
	private SinavSonucuRepository sinavSonucuRepository;
	
	@GetMapping("/kpss/sinavSonucu")
	public List<SinavSonucu> getSinavSonucu(@RequestParam(value="tcno", required = true) String tcno) {
		logger.info("Received getSinavSonucu request for " + tcno);
		return sinavSonucuRepository.findByTcno(tcno);
	}
	
}
