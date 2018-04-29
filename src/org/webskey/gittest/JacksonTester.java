package org.webskey.gittest;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
	public static void main(String args[]){

		ObjectMapper mapper = new ObjectMapper();
		String json1 = "{\"table\":\"C\","
				+ "\"currency\":\"dolar amerykañski\","
				+ "\"code\":\"USD\","
				+ "\"rates\":[{"
				+ "\"no\":\"064/C/NBP/2016\","
				+ "\"effectiveDate\":\"2016-04-04\","
				+ "\"bid\":3.6929,\"ask\":3.7675}]}";

		try{
			Nbp nbp = mapper.readValue(json1, Nbp.class);
			System.out.println(nbp);
			List<NbpArray> myObjects = nbp.getRates();
			for(NbpArray obj: myObjects) {
				System.out.println(obj.toString());
			}
		} catch (IOException e) { e.printStackTrace(); }
	}
}