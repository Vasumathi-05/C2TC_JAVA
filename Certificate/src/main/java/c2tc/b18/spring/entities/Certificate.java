package c2tc.b18.spring.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certificate {
@Id
private int id;
private int year;
private String college;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}

}
