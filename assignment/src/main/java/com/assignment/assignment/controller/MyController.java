package com.assignment.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.assignment.entities.Load;
import com.assignment.assignment.services.LoadServices;

@RestController
public class MyController {
     @Autowired
     private LoadServices loadservices;
    
	@PostMapping("/load")
	 public String addLoad(@RequestBody Load load) {
		return this.loadservices.addLoad(load);
	   }
	 
	 @GetMapping("/load")
	 @ResponseBody
	 public List<Load> listgetbyId(@RequestParam (name="shipperId") String id) {
		 return this.loadservices.listgetbyId(id);
	 }
	 
	 @GetMapping("/load/{loadId}")
	 public Load getbyId(@PathVariable String loadId) {
		 return this.loadservices.getbyId(Integer.parseInt(loadId));
	 }
	 
	 @PutMapping("/load/{loadId}")
	 public String update(@RequestBody Load load,@PathVariable String loadId) {
		 return this.loadservices.updatebyId(load,Integer.parseInt(loadId));
	 }
	@DeleteMapping("/delete/{Id}")
		public ResponseEntity<HttpStatus> delete(@PathVariable String Id) {
			try {
				this.loadservices.deleteById(Integer.parseInt(Id));
				return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(Exception e){
	             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	      }
	 
}
