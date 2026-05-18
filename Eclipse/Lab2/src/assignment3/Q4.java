package assignment3;

class Box<T>{
	T obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return obj;
	}
}

public class Q4 {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.set("Hello");
		Box<String> box2 = box1;
		System.out.println("String box contents before change:" + box1.get() + ", " + box2.get());
		box2.set("World");
		System.out.println("String box contents after change:" + box1.get() + ", " + box2.get());
		
		System.out.println();
		
		Box<Integer> box3 = new Box<>();
		box3.set(10);
		Box<Integer> box4 = box3;
		System.out.println("Integer box contents before changes:" + box3.get() + ", " + box4.get());
		box4.set(20);
		System.out.println("Integer box contents after changes:" + box3.get() + ", " + box4.get());
		
		System.out.println();
		
		Box<Object> box5 = new Box<>();
		box5.set("Hello");
		Box<Object> box6 = new Box<>();
		box6.set(20);
		System.out.println("Object box (String):" + box5.get());
		System.out.println("Object box (Integer):" + box6.get());
	}

}
