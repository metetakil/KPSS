package com.mtakil.kpss.repo;

import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mtakil.kpss.entity.Kisi;


@RunWith(SpringRunner.class)
@SpringBootTest
public class KisiRepositoryTests {

	@Autowired
	private KisiRepository kisiRepository;
	
	@Test
	public void testFindById() {
		Optional<Kisi> kisi = kisiRepository.findById(3L);
		assertTrue(kisi.isPresent());
		assertTrue(kisi.get().getAd().equals("Mete"));	
	}
	
	@Test
	public void testFindByTcno_Beyza() {
		Optional<Kisi> kisi = kisiRepository.findByTcno("30739496584");
		assertTrue(kisi.isPresent());
		assertTrue(kisi.get().getAd().equals("Beyza"));
	}
	
	@Test
	public void testFindByTcno_NotExits() {
		Optional<Kisi> kisi = kisiRepository.findByTcno("23324");
		assertTrue(! kisi.isPresent());
	}
	
}
