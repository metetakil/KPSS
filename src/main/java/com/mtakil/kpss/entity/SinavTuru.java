package com.mtakil.kpss.entity;


public enum SinavTuru {

	KPSS("KPSS", "Kamu Personel Sinavi"),
	YDS("YDS", "Yabanci Dil Sinavi"),
	UDS("UDS", "Universitelerarasi Yabanci Dil Sinavi");
	
	private String tur;
	private String uzunAd;
	
	private SinavTuru(String tur, String uzunAd) {
		this.tur = tur;
	}

	public String getTur() {
		return tur;
	}

	public String getUzunAd() {
		return uzunAd;
	}

	@Override
	public String toString() {
		return tur;
	}
	
}
