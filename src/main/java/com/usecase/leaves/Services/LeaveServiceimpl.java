package com.usecase.leaves.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.leaves.model.Leaves;
import com.usecase.leaves.payload.DataTransfer;
import com.usecase.leaves.repository.Leaverepo;

@Service
public class LeaveServiceimpl implements Services {
	
	@Autowired
	private Leaverepo leaverepo;

	public LeaveServiceimpl(Leaverepo leaverepo) {
		super();
		this.leaverepo = leaverepo;
	}

	@Override
	public DataTransfer createLeave(DataTransfer dt) {
		
		Leaves le = this.ltodt(dt);
		Leaves savedle = this.leaverepo.save(le); 
		// TODO Auto-generated method stub
		return this.dttol(savedle);
	}

	@Override
	public List<DataTransfer> getAllLeaves() {
		
		List<Leaves> l = this.leaverepo.findAll();
		List<DataTransfer> leav =  l.stream().map(leave->this.dttol(leave)).collect(Collectors.toList());
		// TODO Auto-generated method stub
		return leav;
	}
	
	private Leaves ltodt(DataTransfer dt)
	{
		Leaves le = new Leaves();
		le.setId(dt.getId());
		le.setName(dt.getName());
		le.setStartdate(dt.getStartdate());
		le.setEnddate(dt.getEnddate());
		le.setReason(dt.getReason());
		
		return le;
	}
	
	private DataTransfer dttol(Leaves le)
	{
		DataTransfer dt = new DataTransfer();
		dt.setId(le.getId());
		dt.setName(le.getName());
		dt.setStartdate(le.getStartdate());
		dt.setEnddate(le.getEnddate());
		dt.setReason(le.getReason());
		
		return dt;
	}

}
