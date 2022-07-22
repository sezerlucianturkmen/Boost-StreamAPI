package com.muhammet.repository;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.muhammet.repository.entity.User;

public class UserRepositoryImpl {

	private List<User> userList;

	public UserRepositoryImpl(int cekilecekKayitSayisi) {
		super();
		getAllUsers(cekilecekKayitSayisi);
	}

	public List<User> getUserList() {
		return userList;
	}
	
	private void getAllUsers(int count) {
		Scanner sc= null;
		try {
			sc = new Scanner(new URL("https://randomuser.me/api/?results="+count).openStream(),"UTF-8");
			StringBuilder sb = new StringBuilder();
			while(sc.hasNext()) {
				sb.append(sc.nextLine());
			}
			Gson gson = new Gson();
			JsonElement jsonElement = JsonParser.parseString(sb.toString());
			JsonObject jsonObject = jsonElement.getAsJsonObject();
			JsonArray jsonArray = jsonObject.get("results").getAsJsonArray();
			int size = jsonArray.size();
			userList = new ArrayList();
			for(int i=0; i<size; i++) {
				JsonObject o = jsonArray.get(i).getAsJsonObject();
				User pp =  gson.fromJson(o,User.class);
				userList.add(pp);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
