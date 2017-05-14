package MyUtil;

public class Main {
	
	public static void main(String []args) throws OverflowException, UnderflowException{
		StackImplements obj = new StackImplements(2);
		StackListImplements obj2 = new StackListImplements(3);
		QueueImplements obj3 = new QueueImplements(1);
		QueueLinkedList obj4 = new QueueLinkedList(3);
		obj3.enter(3);
		obj3.enter(2);
		obj3.enter(1);
		System.out.println(obj3.printElements());
//		obj4.enter(0);

		

	
//		obj4.leave();
//		System.out.println(obj3.printElements());
//		obj.push(3);
//		obj.push(2);
		System.out.println(obj4.printElements());
//		obj.push(new String("a"));
//		obj.push(new String("b"));
//		obj.push(new String("c"));
//		obj.push("d");
//		obj2.push(4);
//		obj2.push(3);
//		obj2.push(2);
//		Object o []= new Object[10];
//		for (int i = 0; i < o.length; i++) {
//			o[i]= i;		
//			}
//		for (int i = 0; i < o.length; i++) {
//			System.out.println(o[i]);
//		}
//		
//		obj.pop();
//		obj.top();
//		System.out.println(obj2.printElements());
//		System.out.println(obj.elements[1]);
//		System.out.println(obj3.printElements());
	
		
		
	}
	
}
