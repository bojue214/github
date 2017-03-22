package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest2 {

	public static void main(String[] args) throws Exception {

		IOTest2 iotest = new IOTest2();
		// iotest.fileWriter();
		// iotest.fileWriter2();
		iotest.fileReader2();
		// iotest.fileReader1();
	}

	/**
	 * 字符输出流
	 * 
	 * @throws Exception
	 */
	public void fileWriter() throws Exception {

		File file = new File("c:\\io\\hello2.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileWriter fw = new FileWriter(file);
		fw.write("哈哈");
		fw.close();

	}

	/**
	 * 字符输出流
	 * 
	 * @throws Exception
	 */
	public void fileWriter2() throws Exception {

		File file = new File("c:\\io\\hello3.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileWriter fw = new FileWriter(file);

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("哈哈");

		bw.close();

		fw.close();

	}

	/**
	 * 字符流读取文件
	 */
	public void fileReader1() throws Exception {

		File file = new File("c:\\io\\hello3.txt");

		FileReader fr = new FileReader(file);

		char[] ch = new char[(int) file.length()];

		fr.read(ch);

		for (char c : ch) {
			System.out.print(c);
		}

	}

	/**
	 * 字符流读取文件
	 */
	public void fileReader2() throws Exception {

		File file = new File("c:\\io\\hello3.txt");

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);

		char[] ch = new char[(int) file.length()];

		br.read(ch);

		for (char c : ch) {
			System.out.print(c);
		}

		br.close();

		fr.close();

	}
}
