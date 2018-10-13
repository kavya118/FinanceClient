package com.kavya.model;

import java.util.Set;

/* Each user involved in different transactiona */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	
	//primary key
		int id;
		
		String name;		
		
		Long contactnumber;

		String email_id;
		
		public User() {
		}

		public User(String name) {
		}
	
		public User(int id) {
			super();
			this.id = id;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getContactnumber() {
			return contactnumber;
		}

		public void setContactnumber(Long contactnumber) {
			this.contactnumber = contactnumber;
		}

		public String getEmail_id() {
			return email_id;
		}

		public void setEmail_id(String email_id) {
			this.email_id = email_id;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", contactnumber=" + contactnumber + ", email_id=" + email_id
					+ "]";
		}

		public User(int id, String name, Long contactnumber,
				 String email_id) {
			super();
			this.id = id;
			this.name = name;
			this.contactnumber = contactnumber;
			this.email_id = email_id;
		}
		
}

