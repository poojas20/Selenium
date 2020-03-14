
class stringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		
		sb.append("Java");//now original string is changed
		System.out.println(sb);//prints Hello Java
		
		sb.insert(1,"Java");//now original string is changed
		System.out.println(sb);//prints HJavaello
		
		sb.replace(1, 3, "Tes");
		System.out.println(sb);//prints HJavalo
		
		sb.delete(1, 4);
		System.out.println(sb);//prints Hlo

	}

}
