package com.spreadsheet.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="data")
public class Data implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9037825037429563723L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idData", unique = true, nullable = false)
	private int id;	
	
	@Column(name = "data_col")
	private String col;
	
	@Column(name = "data_row")
	private int row;	
	
	@Column(name = "cell_data")
	private String value;
	
	@ManyToOne
    @JoinColumn(name="idSpreadSheet")
	private SpreadSheet spreadsheetData;

	public String getCol() {
		return col;
	}

	public void setCol(String col) {
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public SpreadSheet getSpreadsheetData() {
		return spreadsheetData;
	}

	public void setSpreadsheetData(SpreadSheet spreadsheetData) {
		this.spreadsheetData = spreadsheetData;
	}

	@Override
	public String toString() {
		return "Data [col=" + col + ", row=" + row + ", value=" + value
				+ ", spreadsheetData=" + spreadsheetData + "]";
	}

	public Data(String col, int row, String value, SpreadSheet spreadsheetData) {
		super();
		this.col = col;
		this.row = row;
		this.value = value;
		this.spreadsheetData = spreadsheetData;
	}
	
	public Data() {		
	}
	
	

}
