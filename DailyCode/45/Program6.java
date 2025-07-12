//User Define Exception
//throw

class BiryaniException extends RuntimeException {

	BiryaniException(String msg) {
	      super(msg);
	}
}
class Demo{
	public static void main(String[] args){
	
		throw new BiryaniException("Last hoti");
	}

}
