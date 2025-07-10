package com.tnsif.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class customer3 {
 private int cid;
 private String cname;
 @Autowired
 private customer1 	Customer1;
 @Autowired
 private customer2 	Customer2;
 
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
 public void show() {
	 Customer1.show();
	 Customer2.show();
	 System.out.println("this is from customer3 class");
 }
}
