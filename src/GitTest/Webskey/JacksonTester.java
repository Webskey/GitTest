package GitTest.Webskey;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
   public static void main(String args[]){
   
      ObjectMapper mapper = new ObjectMapper();
      String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
      String json2 = "{\"table\":\"C\","
      		+ "\"currency\":\"funt szterling\","
      		+ "\"code\":\"GBP\"}";
      
      //map json to student
      try{
         Student student = mapper.readValue(jsonString, Student.class);
         Nbp nbp = mapper.readValue(json2, Nbp.class);
         System.out.println(nbp);
         System.out.println();
         
         System.out.println(student);
         System.out.println(student.getName());
         
         jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
         
         System.out.println(jsonString);
      }
      catch (JsonParseException e) { e.printStackTrace();}
      catch (JsonMappingException e) { e.printStackTrace(); }
      catch (IOException e) { e.printStackTrace(); }
   }
}

class Student {
   private String name;
   private int age;
   public Student(){}
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public String toString(){
      return "Student [ name: "+name+", age: "+ age+ " ]";
   }
}

class Nbp {
	private String table;
	private String currency;
	private String[] rates;
	private String code;
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String[] getRates() {
		return rates;
	}
	public void setRates(String[] rates) {
		this.rates = rates;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String toString() {
		return this.table+"  "+this.currency;
	}
}
