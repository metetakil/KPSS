package com.mtakil.kpss.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
//@JsonIdentityInfo(generator=ObjectIdGenerators.None.class, property="id")
public class Kisi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tcno", nullable = false)
	private String tcno;
	
	@Column(name = "ad")
	private String ad;
	
	@Column(name = "soyad")
	private String soyad;
	
	@Column(name = "dogum_tarihi")
	private Date dogumTarihi;
	
	@OneToMany(mappedBy = "kisi")
	@JsonManagedReference
	private List<SinavSonucu> sinavSonucu = new ArrayList<>();

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTcno() {
		return tcno;
	}
	public void setTcno(String tcno) {
		this.tcno = tcno;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public Date getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public List<SinavSonucu> getSinavSonucu() {
		return sinavSonucu;
	}
	public void setSinavSonucu(List<SinavSonucu> sinavSonucu) {
		this.sinavSonucu = sinavSonucu;
	}
	@Override
	public String toString() {
		return String.format("Kisi id:%d, TC no:%s, ad:%s, soyad:%s, dogumTarihi:%s sinavSonuclari:%s", id, tcno, ad, soyad, dogumTarihi, sinavSonucu);
	}
	
}
