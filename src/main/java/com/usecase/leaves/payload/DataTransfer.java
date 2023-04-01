package com.usecase.leaves.payload;

import java.time.LocalDate;




import com.fasterxml.jackson.annotation.JsonFormat;

public class DataTransfer {
	
	private int id;
	private String name;
	
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

	

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public LocalDate getEnddate() {
		return enddate;
	}

	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate startdate;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate enddate;
	
	private String reason;

}
