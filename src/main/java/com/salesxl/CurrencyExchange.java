package com.salesxl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="currency_exchange")
public class CurrencyExchange {
	
	@Id
	@GenericGenerator(name = "exchange_id", strategy = "com.salesxl.CurrencyExchangeGenerator")
	@GeneratedValue(generator = "exchange_id")
	@Column(name="exchange_id")
	private String exchange_id;

	@Column(name="record_date")
	private Date record_date;
	
	@Column(name="base")
	private String base;
	
	@Column(name="INR")
	private double INR;
	
	@Column(name="USD")
	private double USD;
	
	@Column(name="GBP")
	private double GBP;
	
	@Column(name="EUR")
	private double EUR;
	
	@Column(name="AUD")
	private double AUD;
	
	@Column(name="CAD")
	private double CAD;
	
	@Column(name="SGD")
	private double SGD;
	
	@Column(name="BDT")
	private double BDT;
	
	@Column(name="record_time")
	private long record_time;
	
	public String getExchange_id() {
		return exchange_id;
	}

	public void setExchange_id(String exchange_id) {
		this.exchange_id = exchange_id;
	}

	public Date getRecord_date() {
		return record_date;
	}

	public void setRecord_date(Date record_date) {
		this.record_date = record_date;
	}

	

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public double getINR() {
		return INR;
	}

	public void setINR(double iNR) {
		INR = iNR;
	}

	public double getUSD() {
		return USD;
	}

	public void setUSD(double uSD) {
		USD = uSD;
	}

	public double getGBP() {
		return GBP;
	}

	public void setGBP(double gBP) {
		GBP = gBP;
	}

	public double getEUR() {
		return EUR;
	}

	public void setEUR(double eUR) {
		EUR = eUR;
	}

	public double getAUD() {
		return AUD;
	}

	public void setAUD(double aUD) {
		AUD = aUD;
	}

	public double getCAD() {
		return CAD;
	}

	public void setCAD(double cAD) {
		CAD = cAD;
	}

	public double getSGD() {
		return SGD;
	}

	public void setSGD(double sGD) {
		SGD = sGD;
	}

	public double getBDT() {
		return BDT;
	}

	public void setBDT(double bDT) {
		BDT = bDT;
	}

	public long getRecord_time() {
		return record_time;
	}

	public void setRecord_time(long record_time) {
		this.record_time = record_time;
	}
	
	

	
}

