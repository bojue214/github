package Test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest3 {

	public static void main(String[] args) throws Exception {

		IOTest3 i3 = new IOTest3();
		i3.datareader();
		// i3.dataoutputWriter();
	}

	/**
	 * 二进制方式写入文件
	 */
	public void dataoutputWriter() throws Exception {

		File file = new File("c:\\io\\er.txt");

		FileOutputStream fos = new FileOutputStream(file);

		DataOutputStream dis = new DataOutputStream(fos);

		dis.writeUTF("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\nsdfdsfdsfsdfsdf");

		dis.close();
		fos.close();

	}

	/**
	 * 二进制方式读取文件
	 */
	public void datareader() throws Exception {

		File file = new File("c:\\io\\er.txt");

		FileInputStream fis = new FileInputStream(file);

		DataInputStream dis = new DataInputStream(fis);

		String msg = dis.readUTF();

		System.out.println(msg);

	}

}
