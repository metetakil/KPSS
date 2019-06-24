package com.mtakil.kpss.repo;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mtakil.kpss.entity.SinavSonucu;
import com.mtakil.kpss.entity.SinavTuru;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SinavSonucuRepositoryTests {

	@Autowired
	private SinavSonucuRepository sinavSonucuRepository;
	
	@Test
	public void testFindById() {
		Optional<SinavSonucu> ss = sinavSonucuRepository.findById(7L);
		assertTrue(ss.isPresent());
		assertTrue(ss.get().getId() == 7);
		assertTrue(ss.get().getAldigiPuan() == 90);
		assertTrue(ss.get().getSinavTuru() == SinavTuru.UDS);
	}
	
	@Test
	public void testFindByTcno() {
		List<SinavSonucu> ssList = sinavSonucuRepository.findByTcno("19315957022");
		assertTrue(ssList.size() == 1);
		assertTrue(ssList.get(0).getSinavYili() == 2019);
	}

	@Test
	public void testFindByTcno_Beyza() {
		List<SinavSonucu> ssList = sinavSonucuRepository.findByTcno("30739496584");
		assertTrue(ssList.size() == 2);
		assertTrue(ssList.get(0).getKisi().getAd().equals("Beyza"));
		assertTrue(! ssList.get(1).getKisi().getAd().equals("Mete"));
	}
	
	@Test
	public void testFindByTcno_NoPerson() {
		List<SinavSonucu> ssList = sinavSonucuRepository.findByTcno("123");
		assertTrue(ssList.size() == 0);
	}
	
}
