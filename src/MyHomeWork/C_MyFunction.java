package MyHomeWork;


import java.util.Vector;
import java.io.*;
public interface C_MyFunction {
	
	
	
	default Vector<Integer> RandNumber(int Min,int Max,int e)
	{
		final int or = Min;
		Min--;
		if(Min<0)
			Min = or;
			
		Vector<Integer> a = new Vector<Integer>();
		for (int i = 0; i <e; i++) {
			a.add((int)(Math.random()* (Max-Min+1))+Min);
		}
		return a;
	}
	default void CopyFile(File oldFile,File newFile) 
	{
		
		try {
			if(!oldFile.exists())
			throw new IOException("所選檔案不存在");
			FileReader fr = new FileReader(oldFile);
			FileWriter fw = new FileWriter(newFile);
				try {
					//if(newFile.createNewFile())
						newFile.createNewFile();
					//throw new IOException("檔案新增失敗");
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			int i = 0;
			while ((i = fr.read())!=-1)
			{
				fw.write(i);					
			}
			fw.close();
			fr.close();
			System.out.println("資料複製完成");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	default void CheckFolder(String FloderPath)
	{
		File file = new File(FloderPath);
		if(!file.exists())
		{
			try {
				if(!file.mkdir())
					throw new IOException("資料夾創建失敗");			
			} catch (Exception e) {
					System.out.println(e.getMessage());
					
			}
		}
		
	}
	default<T> void OutputDataToTheFile(String FilePath,String Filename,Vector<T> OutputData)throws IOException
	{
		try {
			if(OutputData.isEmpty())
				throw new IndexOutOfBoundsException();
			File file  =new File(FilePath+ "//"+Filename);
			CheckFolder(file.getParent());
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			for (int i = 0; i < OutputData.size(); i++) {
				oos.writeObject(OutputData.get(i));
			}
			oos.close();
			System.out.println("資料輸出完成");
		} catch (IOException e) {
			throw e;
			
		}
	}
	default void DataInput(String FilePath)
	{
		
		try {
			
			ObjectInputStream ois =new ObjectInputStream(new FileInputStream(new File(FilePath)));
			System.out.println("資料如下");
			System.out.println("------------------------------");
			try {
				while (true) {
					((Animal)ois.readObject()).speak();;
					System.out.println("------------------------------");
				}
			} catch (EOFException  | ClassNotFoundException c) {
				System.out.println("資料讀取完畢");
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
