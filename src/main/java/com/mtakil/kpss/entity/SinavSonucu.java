package com.mtakil.kpss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class SinavSonucu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "sinav_turu", nullable = false)
	private SinavTuru sinavTuru;
	
	@Column(name = "sinav_yili", nullable = false)
	private int sinavYili;
	
	@Column(name = "aldigi_puan", nullable = false)
	private int aldigiPuan;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="kisi_id", nullable = false)
	private Kisi kisi;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SinavTuru getSinavTuru() {
		return sinavTuru;
	}
	public void setSinavTuru(SinavTuru sinavTuru) {
		this.sinavTuru = sinavTuru;
	}
	public int getSinavYili() {
		return sinavYili;
	}
	public void setSinavYili(int sinavYili) {
		this.sinavYili = sinavYili;
	}
	public int getAldigiPuan() {
		return aldigiPuan;
	}
	public void setAldigiPuan(int aldigiPuan) {
		this.aldigiPuan = aldigiPuan;
	}
	public Kisi getKisi() {
		return kisi;
	}
	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}
	@Override
	public String toString() {
		return String.format("SinavSonucu: id:%d, sinavTuru:%s, sinavYili:%d, aldigiPuan:%d, kisi:%s", id, sinavTuru, sinavYili, aldigiPuan, kisi);
	}
}
