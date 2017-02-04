package appointments.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="appointment")
public class Appointment {

	@Id
	private Long id;
	@Column(name="purpose")
	private String purpose;
	
	@Column(name="appointment_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date time;
	
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=User.class)
	@JoinColumn(name="username")
	private User createdBy;
	
	public Appointment(String purpose, Date time, User createdBy) {
		super();
		this.purpose = purpose;
		this.time = time;
		this.createdBy = createdBy;
	}
	
	public long getId() {
		return id;
	}
	
	public String getPurpose() {
		return purpose;
	}
	
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public Date getTime() {
		return time;
	}
	
	public void setTime(Date time) {
		this.time = time;
	}
	  
	public User getCreatedBy() {
		return createdBy;
	}
	
	
}
