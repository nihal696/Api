package com.Spring.Apiss.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Spring.Apiss.Entity.CricketManagement;
import com.Spring.Apiss.Repo.CrRepo;

@Service
public class CrService {
	
	@Autowired
	private CrRepo crr;
	

	public CricketManagement save(CricketManagement cm) {
		// TODO Auto-generated method stub
		return crr.save(cm);
	}
	
	public List<CricketManagement> findAll(CricketManagement cm){
		return this.crr.findAll();

}


	public Optional<CricketManagement> findById(int jerseyNo) {
		// TODO Auto-generated method stub
		return crr.findById(jerseyNo);
	}
	
	public CricketManagement update( CricketManagement cm) {
		System.out.println(cm);
		return crr.save(cm);
	}

	public void deleteById( int jerseyNo) {		
		crr.deleteById(jerseyNo);	
	}	
}