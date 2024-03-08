import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Loader<E> {
	public static <E> E loadFile() throws Exception{
		String FILE_NAME = "properties.dat";
		try (FileInputStream streamIn = new FileInputStream(FILE_NAME); ObjectInputStream objectinputstream = new ObjectInputStream(streamIn)){
			return (E) objectinputstream.readObject();
		} 
		catch (FileNotFoundException e1) {
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		throw new Exception("File does not exist");
	}
}
