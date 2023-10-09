package com.Spring.Apiss.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.annotation.MultipartConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.Spring.Apiss.Entity.CricketManagement;
import com.Spring.Apiss.Service.CrService;

@RestController
@RequestMapping("/cricket")
public class CrController {
	@Autowired
	private CrService cs;

	CricketManagement cricketManagement = new CricketManagement();

	@PostMapping("/")
	public CricketManagement add(@RequestBody CricketManagement cm) {
		return cs.save(cm);

	}

	@GetMapping("/")
	public List<CricketManagement> getAll(CricketManagement cm) {
		return cs.findAll(cm);

	}

	@GetMapping("/{jerseyNo}")
	public Optional<CricketManagement> getById(@PathVariable int jerseyNo) {
		return cs.findById(jerseyNo);
	}

	@PutMapping("/")
	public CricketManagement update(@ModelAttribute CricketManagement cm) {
		
		
		return cs.update(cm);

	}

	@DeleteMapping("/{jerseyNo}")
	public void delete(@PathVariable("jerseyNo") int jerseyNo) {
		cs.deleteById(jerseyNo);
	}

}
