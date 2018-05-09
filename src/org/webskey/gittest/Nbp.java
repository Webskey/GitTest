package org.webskey.gittest;

import java.util.List;

public class Nbp implements Comparable<Nbp>{
	private String table;
	private String currency;
	private String code;
	private List<NbpArray> rates;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Nbp(String table, String currency, int id) {
		this.table = table;
		this.currency = currency;
		this.id = id;
	}
	
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public List<NbpArray> getRates() {
		return rates;
	}
	public void setRates(List<NbpArray> rates) {
		this.rates = rates;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String toString() {
		return this.table+"  "+this.currency;
	}
	@Override
	public int compareTo(Nbp obj) {
		return obj.id - this.id;
	}
}