//this snippet should be placed in base test java file
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;

@DataProvider
public Object[][] getData() throws IOException {
  List<HashMap<String,String>> data =getJsonDataToMap(System.getProperty("user.dir")+"PLACE DIRECTORY HERE");
  return new Object[][]{{data.get(0)},{data.get(1)}};
}
