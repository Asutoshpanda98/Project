package com.cg.scheduleprogramservice.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Schedule_Table")
public class ScheduleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String location;
	private Date startDate;
	private Date endDate;
	private String certificate;
	public ScheduleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScheduleEntity(int id, String name, String location, Date startDate, Date endDate, String certificate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.certificate = certificate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "ScheduleEntity [id=" + id + ", name=" + name + ", location=" + location + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", certificate=" + certificate + "]";
	}
	

}
