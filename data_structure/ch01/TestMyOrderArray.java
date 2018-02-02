package ch01;

/**
 * 类说明： 测试myorderarray
 * @author 孙博腾 E-mail: tengdowell@gmail.com
 */
public class TestMyOrderArray {
	public static void main(String[] args) {
		MyOrderArray my = new MyOrderArray();
		MyArray my1 = new MyArray();
		my.insert(10);
		my.insert(8);
		my.insert(99);
		my.insert(14);
		my.insert(19);
		// my1.insert(10);
		// my1.insert(8);
		// my1.insert(99);
		// my1.insert(14);
		// my1.insert(19);
		// my1.display();
		// my.deleteIndex(0);
		my.display();
		System.out.println(my.findIndex(99));
	}
}
