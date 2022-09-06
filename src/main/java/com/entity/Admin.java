
	package com.entity;

	import java.util.List;

import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.validation.constraints.NotNull;

	@Entity
	@Table(name="Admin")
	public class Admin {
		
		@Id
		@NotNull
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		
		@NotNull
		private String title;
		
		@NotNull
		private String body;

		private String Department;

		private String Address;

		private String Name;

		public Admin(@NotNull Long id, @NotNull String title, @NotNull String body) {
			super();
			this.id = id;
			this.title = title;
			this.body = body;
		}

		public Admin() {
			super();
		}

		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String Name) {
			this.Name = Name;
		}

		public String getDepartment() {
			return Department;
		}

		public void setDepartment(String Department) {
			this.Department = Department;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String Address) {
			this.Address = Address;
		}
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", Name=" + Name + ", Department=" + Department + ", Address=" + Address+ "]";
		}

		public static String updateAdmin(Admin faculty) {
			// TODO Auto-generated method stub
			return null;
		}

		public static String addAdmin(Admin faculty) {
			// TODO Auto-generated method stub
			return null;
		}

		public static List<Admin> getAllAdmins() {
			// TODO Auto-generated method stub
			return null;
		}

		public static Admin getAdmin(Object adminid) {
			// TODO Auto-generated method stub
			return null;
		}

		public static boolean deleteAdmin(Object adminid) {
			// TODO Auto-generated method stub
			return false;
		}
		
	
		
		
		
		

	}


