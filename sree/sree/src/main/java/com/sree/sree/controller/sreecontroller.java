package com.sree.sree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sree.sree.entities.load;
import com.sree.sree.services.loadservice;

@RestController
public class sreecontroller {
	@Autowired
	private loadservice Loadservice;
	 
	@GetMapping("/load")
public List<load> getload(@RequestParam long shipperid) {
	System.out.println(shipperid);
	return this.Loadservice.getload();
}

@GetMapping("/load/{loadid}")
public load getLoad(@PathVariable String loadid) {
	return this.Loadservice.getloads(Long.parseLong(loadid));
}
@PostMapping(path="/load")
public load addload(@RequestBody load Load) {
return this.Loadservice.addload(Load);
}
//@PutMapping("/load/{loadid}")
//public load updateload(@RequestBody load Load,@PathVariable("loadid")int loadid)
//{ this.Loadservice.updateload(Load,loadid);
//	}
}

