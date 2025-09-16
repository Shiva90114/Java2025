

class HeapInfo {

	public static void main(String[] args){
	
		long heapSize = Runtime.getRuntime().totalMemory(); // atta kiti memory
		long maxHeapSize = Runtime.getRuntime().maxMemory();// max kiti memory
		long freeHeapSize = Runtime.getRuntime().freeMemory();// free aahe

		System.out.println("Total Memory :"+heapSize/(1024*1024)+"MB");
		System.out.println("Max Memory :"+maxHeapSize/(1024*1024)+"MB");
		System.out.println("Free Memory :"+freeHeapSize/(1024*1024)+"MB");



	}
}
