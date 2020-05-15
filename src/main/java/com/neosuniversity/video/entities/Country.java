package com.neosuniversity.video.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COUNTRY",schema="VIDEODB")
public class Country {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_COUNTRY",nullable=false,unique=false)
	private Long idcountry;
	
	
	@Column(name="COUNTRY",length=100,nullable=false)
	private String country;


	public Long getIdcountry() {
		return idcountry;
	}


	public void setIdcountry(Long idcountry) {
		this.idcountry = idcountry;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Country [idcountry=" + idcountry + ", country=" + country + "]";
	}

	
}
