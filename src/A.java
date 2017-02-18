public class A{

	public static void main(String [] args){
		
		int [][][] a={{{0,1,2,3,4},{7,8,9}},{{10,11,12,13,14},{22,23,34},{25}},{{31,33}}};  //x:1 y:0,z:4
		
		
		//System.out.println(a[1][0][4]);
		
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a[i].length;j++){
				
				for(int k=0;k<a[i][j].length;k++){
					System.out.println(a[i][j][k]);
					
				}
			}
		}
		
		
		for(int [][] i :a){
			
			for( int [] j  :i){
				
				for( int k :j){
					System.out.println(k);
					
				}
			}
		}
		
	}
}