package com.java.phone;//

import java.util.Hashtable;
import java.util.Map;

import com.javaex.collection.hash.a16.ClassRoom;

public class PhoneVO {
	//필드

	private String name;
	private String hp;
	private String tel;
	private Long id;
	
	public PhoneVO() {
		super();
	}

	public PhoneVO(String name, String hp, String tel) {
		super();
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}
	public PhoneVO(Long id, String name, String hp, String tel) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "PhoneInfo [name=" + name + ", hp=" + hp + ", tel=" + tel + "]";
	}
}
