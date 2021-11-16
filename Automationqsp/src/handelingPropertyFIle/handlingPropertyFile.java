package handelingPropertyFIle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class handlingPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/Config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("browser");
		System.out.println(value);

	}

}
