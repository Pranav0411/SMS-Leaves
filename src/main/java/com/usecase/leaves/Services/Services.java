package com.usecase.leaves.Services;

import java.util.List;

import com.usecase.leaves.payload.DataTransfer;

public interface Services {
	
	DataTransfer createLeave(DataTransfer dt);
	List<DataTransfer> getAllLeaves();

}
