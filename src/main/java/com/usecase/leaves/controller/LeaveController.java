package com.usecase.leaves.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.leaves.Services.Services;
import com.usecase.leaves.payload.DataTransfer;


@RestController
@RequestMapping("/api/leaves")
@CrossOrigin(origins = "http://localhost:3000")
public class LeaveController {
	
	@Autowired
	private Services services;
	
	@PostMapping("/create")
	public ResponseEntity<DataTransfer> createStudent(@RequestBody DataTransfer stdo)
	{
		DataTransfer dataTransfer =  this.services.createLeave(stdo);
		return new ResponseEntity<>(dataTransfer,HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<DataTransfer>> getAllLeaves()
	{
		return ResponseEntity.ok(this.services.getAllLeaves());
	}

}
