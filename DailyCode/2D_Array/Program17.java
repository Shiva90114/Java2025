// 2D Array
// Program - 17

class ArrayDemo{

	public static void main(String[] args){
	
		String str1 = "Core2Web";
		String str2 = new String("Core2Web");
		String str3 = "Core2Web";
		String str4 = new String("Core2Web");
		
		if(str1 == str2){
		System.out.println("Equal");
		}else{
		System.out.println("Not Equal");
		}
	
		if(str2 == str4){
                System.out.println("Equal");
                }else{
                System.out.println("Not Equal");
                }

		if(str1 == str3){
                System.out.println("Equal");  // check Identity Hash Code
                }else{
                System.out.println("Not Equal");
                }

		if(str2 == str4){
                System.out.println("Equal");
                }else{
                System.out.println("Not Equal");
                }

	}
}

