package restEg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.print.DocFlavor.BYTE_ARRAY;

public class HttpUrlConnectionExampleGet {

	public void getMethodExample() throws IOException{
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection=	(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		int responseCode =	connection.getResponseCode();
		System.out.println(responseCode);	

		String responseMessage=	connection.getResponseMessage();
		System.out.println(responseMessage);	

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!= null) {
			buffer.append(line);
		}
		
		/*
		 * Class: InputStream, InputStreamReader, BufferedReader Purpose:
		 * getInputStream(): Retrieves the response body as an input stream.
		 * InputStreamReader: Converts the byte stream to a character stream.
		 * BufferedReader: Reads the character stream efficiently.
		 */

	}

	public void postMethodExample() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection=	(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		

		String jsonBody = "{\"name\":\"testrio1234567\",\"salary\":\"75000\",\"age\":\"28\"}";
		byte[] inputJson = jsonBody.getBytes();

		OutputStream outputStream=	connection.getOutputStream();
		outputStream.write(inputJson);
		
		System.out.println("Response code:" +connection.getResponseCode());
		System.out.println("Response message:" +connection.getResponseMessage());
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!= null) {
			buffer.append(line);
		}
		System.out.println(buffer);		

	}
	public void putMethodExample() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/public/api/v1/update/1105");
		HttpURLConnection connection=	(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonBody = "{\"name\":\"agnirio12354\",\"salary\":\"75000\",\"age\":\"28\"}";
		byte[] inputJson = jsonBody.getBytes();

		OutputStream outputStream=	connection.getOutputStream();
		outputStream.write(inputJson);
		
		System.out.println("Response code:" +connection.getResponseCode());
		System.out.println("Response message:" +connection.getResponseMessage());
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!= null) {
			buffer.append(line);
		}
		System.out.println(buffer);		
	}
	
	public void deleteMethodExample() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/public/api/v1/delete/681");
		HttpURLConnection connection=	(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		
		System.out.println("Response code:" +connection.getResponseCode());
		System.out.println("Response message:" +connection.getResponseMessage());
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!= null) {
			buffer.append(line);
		}
		System.out.println(buffer);		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HttpUrlConnectionExampleGet exampleConnection = new HttpUrlConnectionExampleGet();
		exampleConnection.getMethodExample();
		//exampleConnection.postMethodExample();
		//exampleConnection.putMethodExample();
		//exampleConnection.deleteMethodExample();

		



	}

}
