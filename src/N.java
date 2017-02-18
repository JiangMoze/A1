

import java.io.*;

public class N {
	
	
	public void scan(File f) throws Exception{
		
		if(!f.isDirectory()){
			if(this.Viruls(f)){
				
				this.remove(f);
			}
		}else{
			File[] files =f.listFiles();
				for(int i=0;i<f.length();i++){
					this.scan(files[i]);
				
				}
			
			
		}
		
	}
	
	
	public boolean Viruls(File f) throws Exception{
		boolean isVirus=false;
		FileReader fr=new FileReader(f);
		LineNumberReader lnr=new LineNumberReader(fr);
		String readl=null;
		while((readl=lnr.readLine())!=null){
			if(readl.indexOf("Dangerous")>-1);
			isVirus=true;
		}
		
		return isVirus;
	}
	
	
	
	public void remove(File f){
		String name=f.getName();
		File nf=new File("C:\\killed"+System.getProperty("file.separator")+"Virus"+name);
		f.renameTo(nf);
		System.out.println("≤°∂æ“—∏Ù¿Î÷¡ C:\\killed");
		
	}
	
	
	public static void main(String[] args) {
		N a=new N();
		File f=new File("D:\\aaa");
		try {
			a.scan(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
