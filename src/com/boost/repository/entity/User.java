package com.boost.repository.entity;

import java.io.Serializable;

public class User implements Serializable{

	String gender;
	String email;
	String phone;
	String nat;
	Name name;
	Location location;
	Login login;
	Dob dob;
	
	
	
	@Override
	public String toString() {
		return "User [gender=" + gender + ", email=" + email + ", phone=" + phone + ", nat=" + nat + "]";
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNat() {
		return nat;
	}

	public void setNat(String nat) {
		this.nat = nat;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Dob getDob() {
		return dob;
	}

	public void setDob(Dob dob) {
		this.dob = dob;
	}

	public User() {
		
	}

	public User(String gender, String email, String phone, String nat, Name name, Location location, Login login,
			Dob dob) {
		super();
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.nat = nat;
		this.name = name;
		this.location = location;
		this.login = login;
		this.dob = dob;
	}

	public class Name implements Serializable{
		String title;
		String first;
		String last;
		public Name(String title, String first, String last) {
			super();
			this.title = title;
			this.first = first;
			this.last = last;
		}
		public Name() {
			super();
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getFirst() {
			return first;
		}
		public void setFirst(String first) {
			this.first = first;
		}
		public String getLast() {
			return last;
		}
		public void setLast(String last) {
			this.last = last;
		}
		
		
	}
	
	public class Location implements Serializable{
		String city;
		String country;
		String postcode;
		
		public Location() {
			super();
		}
		public Location(String city, String country, String postcode) {
			super();
			this.city = city;
			this.country = country;
			this.postcode = postcode;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getPostcode() {
			return postcode;
		}
		public void setPostcode(String postcode) {
			this.postcode = postcode;
		}
		
		
	}
	
	public class Login implements Serializable{
		String uuid;
		String username;
		String password;
		String md5;
		
		
		public String getUuid() {
			return uuid;
		}


		public void setUuid(String uuid) {
			this.uuid = uuid;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getMd5() {
			return md5;
		}


		public void setMd5(String md5) {
			this.md5 = md5;
		}


		public Login() {
			super();
		}


		public Login(String uuid, String username, String password, String md5) {
			super();
			this.uuid = uuid;
			this.username = username;
			this.password = password;
			this.md5 = md5;
		}
		
		
	}
	
	public class Dob implements Serializable{
		
		String date;
		Integer age;
		
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public Dob(String date, Integer age) {
			super();
			this.date = date;
			this.age = age;
		}
		public Dob() {
			super();
		}
		
		
	}
}
