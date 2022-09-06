package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Admin;
import com.response.ResponseInfo;
import com.service.AdminService;
import com.utility.GlobalResources;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	@Autowired
	AdminService adminService;
	private Logger logger = GlobalResources.getLogger(AdminController.class);
	private Object Adminid;
	
	
	@PostMapping("/addAdmin")
	public ResponseEntity<ResponseInfo> addadmin( @RequestBody Admin admin, HttpServletRequest request ) {
		System.out.println(admin);
		String methodName = "addAdmin()";
		logger.info(methodName + "Called");
		
		String msg = Admin.addAdmin(admin);
		ResponseInfo rinfo = new ResponseInfo(HttpStatus.CREATED.value(), HttpStatus.CREATED.name(),
				request.getRequestURI(),msg);
		ResponseEntity<ResponseInfo> rentity = new ResponseEntity<>(rinfo, HttpStatus.CREATED);
		return rentity;	
	}	
	
	@GetMapping("/admin")
	List<Admin> getAllAdmins()
	{
		String methodName="getAllAdmins()";
		logger.info(methodName+"Called");
	return Admin.getAllAdmins();
	}
	
	@GetMapping("/admin/byId/{adminid}")
	Admin getAdmin(@PathVariable("adminid") Long adminid)
	{
		String methodName="getAdmin()";
		logger.info(methodName+"Called");
		return Admin.getAdmin(Adminid);
	}
	
	@DeleteMapping("/deleteAdmin/{adminId}")
	ResponseEntity<ResponseInfo> deleteAdmin(@PathVariable("adminId") Long adminId, HttpServletRequest request){
		boolean b=Admin.deleteAdmin(Adminid);
		String methodName="deleteAdmin()";
		logger.info(methodName+"Called");
		String msg=null;
				if(b==true) {
					msg="Delete Admin";
					}
				else {
				msg="Admin not Deleted";
				}
		ResponseInfo rinfo=new ResponseInfo(HttpStatus.ACCEPTED.value(),HttpStatus.ACCEPTED.name(),request.getRequestURI(),msg);
		ResponseEntity<ResponseInfo> rentity=new ResponseEntity<>(rinfo,HttpStatus.ACCEPTED);
		return rentity;
		}
	@PutMapping("/admin")
	ResponseEntity<ResponseInfo> updateAdmin(@RequestBody Admin admin, HttpServletRequest request){
		String methodName="updateAdmin()";
		logger.info(methodName+"Called");
	String msg=Admin.updateAdmin(admin);
	ResponseInfo rinfo=new ResponseInfo(HttpStatus.ACCEPTED.value(),HttpStatus.ACCEPTED.name(),request.getRequestURI(),msg);
	ResponseEntity<ResponseInfo> rentity=new ResponseEntity<>(rinfo,HttpStatus.ACCEPTED);
	return rentity;
	}
	

}
