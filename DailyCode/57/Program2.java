

// Parent Delegation Model


class AIDemo{

	public static void main(String[] args){
	
		System.out.println(AIDemo.class.getClassLoader());  //App

		System.out.println(AIDemo.class.getClassLoader().getParent());  //Ext

		System.out.println(AIDemo.class.getClassLoader().getParent().getParent());  // null - Bootstrap
	}

}
