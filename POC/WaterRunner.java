class Water{
	
	public Water(){
		
		System.out.println("Created Water");
		
	}
}

class WaterRunner{
	
	public static void main(String[] things){
		
		System.out.println("start main in WaterRunner");
		
		new Water();
		
		System.out.println("end main in WaterRunner");
		
	}	
}