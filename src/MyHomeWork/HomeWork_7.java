package MyHomeWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class HomeWork_7 {
	class Test_1 extends C_BaseFormat implements C_MyFunction {
		@Override
		void Ans() {
			super.Title("1");

			try {
				File f = new File("src\\MyHomeWork\\Sample.txt");

				if (!f.exists())
					throw new IOException("找不到檔案");

				BufferedReader rf = new BufferedReader(new FileReader(f));

				String fline;
				int linecount = 0;
				int charcount = 0;
				while ((fline = rf.readLine()) != null) {
					linecount++;
					charcount += fline.length();
				}
				System.out.println("檔案大小: " + f.length());
				System.out.println("總共" + charcount + "字元");
				System.out.println("總共" + linecount + "行");
				rf.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			super.End();
		}
	}

	class Test_2 extends C_BaseFormat implements C_MyFunction {
		@Override
		void Ans() {
			super.Title("2");

			Vector<Integer> ar = new Vector<Integer>();
			ar = C_MyFunction.super.RandNumber(1, 1000, 10);

			File outpuFile = new File("src\\MyHomeWork\\Data.txt");
			try {
				outpuFile.createNewFile();

				// FileWriter writer = new FileWriter(outpuFile);
				try (BufferedWriter writer = new BufferedWriter(new FileWriter(outpuFile))) {
					for (int i = 0; i < ar.size(); i++) {
						writer.append(ar.get(i).toString());
						writer.newLine(); // 每个数字后添加新行
					}
					System.out.println("Success");
				} catch (IOException e) {
					e.printStackTrace();
				}

			} catch (IOException e) {
			}
			super.End();
		}
	}

	class Test_3 extends C_BaseFormat implements C_MyFunction {
		@Override
		void Ans() {
			super.Title("3");
			CopyFile(new File("src\\MyHomeWork\\org.txt"), new File("src\\MyHomeWork\\new.txt"));
			super.End();
		}
	}

	class Test_4 extends C_BaseFormat implements C_MyFunction {
		
		Vector<Animal> ar;
		public Test_4() {
			ar = new Vector<Animal>();
			ar.add(new Dog("john"));
			ar.add(new Cat("kiki"));
		}
		@Override		
		void Ans() {
			super.Title("4");
			
			try {
				OutputDataToTheFile("src//Other", "Ojbect.ser", ar);
			} catch (IOException e) {
			}
			super.End();
		}
	}

	class Test_5 extends C_BaseFormat implements C_MyFunction {
		@Override
		void Ans() {
			super.Title("5");
			DataInput("src//Other//Ojbect.ser");
			super.End();
		}
	}

	public static void main(String[] args) {

		HomeWork_7 func = new HomeWork_7();
		Vector<C_BaseFormat> AnsAry = new Vector<C_BaseFormat>();
		
		AnsAry.add(func.new Test_1());
		AnsAry.add(func.new Test_2());
		AnsAry.add(func.new Test_3());
		AnsAry.add(func.new Test_4());
		AnsAry.add(func.new Test_5());
		
		for (int i = 0; i < AnsAry.size(); i++) {
			AnsAry.get(i).Ans();
		}
		
	}

}
