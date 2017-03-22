package Test;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) throws Exception {
		// File file = new File("c:\\io\\hello.txt");
		// 1 判断文件或目录是否存在
		// System.out.println(file.exists());
		// 2 判断是否是文件
		// System.out.println(file.isFile());
		// 3 判断是否是目录
		// System.out.println(file.isDirectory());
		// 4 返回此对象表示的文件的相对路径名
		// System.out.println(file.getPath());
		// 5 返回此对象表示的文件或目录的名称
		// System.out.println(file.getName());
		// 6 删除此对象指定的文件或目录
		// file.delete();
		// 7 创建名称的空文件，不创建文件夹
		// try {
		// file.createNewFile();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// 8 文件长度
		// System.out.println(file.length()/1024);
		IOTest iotest = new IOTest();
		// iotest.fileOutputStream();
		iotest.fileInputputStream();
	}

	/**
	 * 字节输出流
	 * 
	 * @throws Exception
	 */
	public void fileOutputStream() throws Exception {

		File file = new File("c:\\io\\hello.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		FileOutputStream fos = new FileOutputStream(file);

		String msg = "大家好，我是张三";

		fos.write(msg.getBytes());

		fos.close();

	}

	/**
	 * 字节输入流
	 * 
	 * @throws Exception
	 */
	public void fileInputputStream() throws Exception {

		File file = new File("c:\\io\\hello.txt");

		FileInputStream fis = new FileInputStream(file);

		byte[] bys = new byte[fis.available()];// 存储读回来的数据

		// fis.read(bys);
		for (int i = 0; i < bys.length; i++) {
			bys[i] = (byte) fis.read();
		}

		String nsg = new String(bys);

		System.out.println(nsg);

	}

}
