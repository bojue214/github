package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class IOTest4 {

	public static void main(String[] args) throws Exception {
		IOTest4 i4 = new IOTest4();
		// i4.xlh();
		i4.fxlh();
	}

	/**
	 * 序列化
	 * 
	 * @throws Exception
	 */
	public void xlh() throws Exception {

		List<Student> list = new ArrayList<Student>();

		Student s1 = new Student();
		s1.setId("1");
		s1.setName("张三");

		Student s2 = new Student();
		s2.setId("2");
		s2.setName("李四");

		list.add(s1);
		list.add(s2);

		File file = new File("c:\\io\\xlh.txt");

		FileOutputStream fos = new FileOutputStream(file);

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(list);

		oos.close();

		fos.close();

	}

	/**
	 * 反序列化
	 * 
	 * @throws Exception
	 */
	public void fxlh() throws Exception {

		File file = new File("c:\\io\\xlh.txt");

		FileInputStream fis = new FileInputStream(file);

		ObjectInputStream ois = new ObjectInputStream(fis);

		List<Student> list = (List<Student>) ois.readObject();

		ois.close();
		fis.close();

		for (Student s : list) {
			System.out.println(s.getId() + "\t" + s.getName());
		}

	}

}
