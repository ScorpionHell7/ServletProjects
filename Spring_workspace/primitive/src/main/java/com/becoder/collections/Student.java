package com.becoder.collections;

import java.util.*;

public class Student {
	private int id;
	private List<String> li;
	private Map<Integer,String> mp;
	private Set<Integer> se;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getLi() {
		return li;
	}
	public void setLi(List<String> li) {
		this.li = li;
	}
	public Map<Integer, String> getMp() {
		return mp;
	}
	public void setMp(Map<Integer, String> mp) {
		this.mp = mp;
	}
	public Set<Integer> getSe() {
		return se;
	}
	public void setSe(Set<Integer> se) {
		this.se = se;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", li=" + li + ", mp=" + mp + ", se=" + se + "]";
	}
	

}
