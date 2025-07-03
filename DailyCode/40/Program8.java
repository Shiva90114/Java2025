// StringBuffer
//
//Capacity
//
class StringBufferDemo{

	public static void main(String[] args){
	StringBuffer sb1 = new StringBuffer();
	System.out.println(sb1.capacity());  //16

        StringBuffer sb2 = new StringBuffer("Kanha");
        System.out.println(sb2.capacity());  //21				

	// (Currentcapacity + 1)*2
	sb2.append("AshishRamShivamRajuPrasad");
	System.out.println(sb2.capacity());  //44
	}

}
