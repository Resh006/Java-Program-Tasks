package com.tnsif.ShoppingMall.AdminService;

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
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminController {
@Autowired
private AdminService service;

//Retrieval
@GetMapping("/adminservice")
public List<Admin> list() {
	return service.listAll();
}
//Retrieve by Id
@GetMapping("/adminservice/{id}")
public ResponseEntity<Admin>get(@PathVariable Integer id){
	try {
		Admin admin = service.get(id);
		return new ResponseEntity<Admin>(admin,HttpStatus.OK);
	}
	catch (Exception e) {
	Admin admin = service.get(id);
	return new ResponseEntity<Admin>(admin,HttpStatus.NOT_FOUND);
}
}
//Create
@PostMapping("/adminservice")

public void add(@RequestBody Admin admin) {
		service.save(admin);
}
//RESTful API method for Update operation
@PutMapping("/adminservice/{id}")
public ResponseEntity<?> update(@RequestBody Admin admin, @PathVariable Integer id)
{
try
{
Admin existProduct = service.get(id);
service.save(admin);
return new ResponseEntity<>(HttpStatus.OK);
}
catch (Exception e)
{
return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
}
//RESTful API method for Delete operation
@DeleteMapping("/adminservice/{id}")
public void delete(@PathVariable Integer id)
{
service.delete(id);
}
}
 
