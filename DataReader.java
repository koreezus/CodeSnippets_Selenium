import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public class DataReader {
  public List<HashMap<String,String>> mapJsonData(String filepath) throws IOException {
    //READ JSON TO STRING
    String jsonContent = FileUtils.readFileToString(new File(System.getProperty(filepath)), StandardCharsets.UTF_8);
    ObjectMapper mapper = new ObjectMapper();
    //MAP STRING TO LIST OF HASHMAP
    return mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
    });
  }
}
