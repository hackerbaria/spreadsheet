package com.spreadsheet.model;

import java.io.Serializable;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name ="data_log")
public class DataLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8677403928318253718L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idData_log", unique = true, nullable = false)
	private int id;
	
	@Column(name = "column")
	private String column;
	
	@Column(name = "row")
	private int row;
	
	@ManyToOne
    @JoinColumn(name="idUser")
	private User userdataLog;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time")	
	private Date time;
	
	public void setTime(Date time) {
		this.time = time;
	}

	@Column(name = "data")
	private String data;

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public User getUserdataLog() {
		return userdataLog;
	}

	public void setUserdataLog(User userdataLog) {
		this.userdataLog = userdataLog;
	}

	public Date getTime() {
		return time;
	}

	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	
	
	
	
	public DataLog(String column, int row, User userdataLog, Date time,
			String data) {
		super();
		this.column = column;
		this.row = row;
		this.userdataLog = userdataLog;
		this.time = time;
		this.data = data;
	}

	public DataLog() {
	}

	@Override
	public String toString() {
		return "DataLog [id=" + id + ", column=" + column + ", row=" + row
				+ ", userdataLog=" + userdataLog + ", time=" + time + ", data="
				+ data + "]";
	}
	
	
	
	
	
	
	

}
