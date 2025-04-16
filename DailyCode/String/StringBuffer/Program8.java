class StringDemo{
	public static void main(String[] args){
		  StringBuffer sb= new StringBuffer("Shashi");
		  System.out.println(sb.capacity());   //22
               sb.append("Bagal");
               System.out.println(sb.capacity());   //22
	      sb.append("Core2Web");
               System.out.println(sb.capacity()); //22
	     
	       sb.append("Core2Web");
	       System.out.println(sb.capacity()); //46
	}



}

