package ECommerce.data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {
	public List<HashMap<String, String>> getJsonDataToMap() throws IOException {
		//read json to string
		String jsonContent=FileUtils.readFileToString(new File(System.getProperty("user.dir")+"\\src\\test\\java\\ECommerce\\data\\loginData.json"),StandardCharsets.UTF_8);
		
		//json string to hashmap using jackson databind
		 ObjectMapper objectMapper = new ObjectMapper();

	        
	    // Convert the JSON string to a HashMap
	     List<HashMap<String, String>> data = objectMapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {});

	      
	    return data;
	}

}
