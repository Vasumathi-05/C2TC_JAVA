package c2tc.b18.spring.entities;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters.LocalDateConverter;

@Entity
public class Placement {
@Id
private int uid;
private String name;
private String college;
private int year;
private String qualification;
private Date date;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
}
