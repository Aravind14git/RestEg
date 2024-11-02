package restEg;

import java.net.http.HttpResponse;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;

public class UnirestHttpRequestExample {
	
	public void getRequestExample() throws UnirestException {
		
		com.mashape.unirest.http.HttpResponse<JsonNode> jsonResponse=
			Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();
		System.out.println("Response code:" + jsonResponse.getStatus());
		System.out.println("Response code:" + jsonResponse.getStatusText());
		System.out.println("Response body :" +jsonResponse.getBody());
	}
	
public void postRequestExample() throws UnirestException {
		
		
com.mashape.unirest.http.HttpResponse<JsonNode> jsonResponse= Unirest.post("https://dummy.restapiexample.com/api/v1/create")
.body("{\"name\":\"testrio123456789\",\"salary\":\"75000\",\"age\":\"28\"}").asJson();
		System.out.println("Response code:" + jsonResponse.getStatus());
		System.out.println("Response code:" + jsonResponse.getStatusText());
		System.out.println("Response body :" +jsonResponse.getBody());
	}

public void putRequestExample() throws UnirestException {
	
com.mashape.unirest.http.HttpResponse<JsonNode>
jsonResponse= Unirest.post("https://dummy.restapiexample.com/public/api/v1/update/886")
.body("{\"name\":\"testrio1234567891\",\"salary\":\"75000123\",\"age\":\"28\"}").asJson();
		System.out.println("Response code:" + jsonResponse.getStatus());
		System.out.println("Response code:" + jsonResponse.getStatusText());
		System.out.println("Response body :" +jsonResponse.getBody());
	}

public void deleteRequestExample() throws UnirestException {
	
com.mashape.unirest.http.HttpResponse<JsonNode>
jsonResponse= Unirest.post("https://dummy.restapiexample.com/public/api/v1/delete/8825")
.body("{\"name\":\"testrio123456789\",\"salary\":\"75000123\",\"age\":\"28\"}").asJson();
		System.out.println("Response code:" + jsonResponse.getStatus());
		System.out.println("Response code:" + jsonResponse.getStatusText());
		System.out.println("Response body :" +jsonResponse.getBody());
	}

	public static void main(String[] args) throws UnirestException {
		// TODO Auto-generated method stub
		UnirestHttpRequestExample example = new UnirestHttpRequestExample();
		//example.getRequestExample();
		//example.postRequestExample();
	example.putRequestExample();
	//example.deleteRequestExample();


	}

}
