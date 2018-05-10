import java.util.StringTokenizer;

//String Ŭ���� (�پ��� �Լ�)
//���߿��� ���� ��� (������ ��κ� ���ڿ� ������ : ���� ó��)
//String Ŭ���� static �Լ��� �����Ѵ�(public)
//String Ŭ���� new �� ���ؼ� ��밡���� �Ϲ��Լ��� ������ �ִ�(public)
public class Ex06_String_Function {

	public static void main(String[] args) {
		String str=""; //���ڿ��� �ʱ�ȭ
		
		String[] strarr = {"aaa", "bbb", "Ccc"};
		for(String s : strarr) {
			System.out.println(s);
		}
		//String �Լ�
		String ss = "hello";
		String concatstr = ss.concat(" world");
		System.out.println(concatstr);
		//boolean bo = ss.contains("el");
		//boolean bo = ss.contains("e");
		boolean bo = ss.contains("elo");
		System.out.println(bo);
		
		String ss2 = "a b c d";//[a][][b][][c][][d]
		System.out.println(ss2.length());
		String filename = "hello java, world";
		System.out.println(filename.indexOf(","));//���� ��ġ(index)
		System.out.println(filename.indexOf("java"));
		//Ȱ�� (���� ���ϴ� �ܾ ����� ����� ���忡 ���� �Ǿ� �ִٸ� 0���� ū ��)
		System.out.println(filename.lastIndexOf("a"));
		System.out.println(filename.lastIndexOf("javb")); //�迭(-1 ���ٴ� ǥ��)
		//return -1 (���̾���)
		
		//length, indexof(), subString(), replace...
		String result = "superman";
		System.out.println(result.substring(0));
		System.out.println(result.substring(2));
		System.out.println(result.substring(0,0));
		System.out.println(result.substring(0,1));
		System.out.println(result.substring(1,1));//index endIndex -1
		System.out.println(result.substring(2,3));
		/*Returns a string that is a substring of this string. 
		The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
		Thus the length of the substring is endIndex-beginIndex. */
		//Quiz
		String filename2 = "bit.png";
		//aaaaa.hwp , bbbbbb.mpeg �ϼ��� �ִ�
		//���⼭ ���ϸ�� Ȯ����� �и��ؼ� ����ϼ���
		//bit
		//png
		//.�� ��������
		int position = filename2.indexOf(".");
		String file = filename2.substring(0,position);
		System.out.println(position);
		String extention = filename2.substring(position+1, filename2.length());
		String extention2 = filename2.substring(++position);
		
		System.out.println("���ϸ� : " + file);
		System.out.println("Ȯ���� : " + extention);
		System.out.println("Ȯ���� : " + extention2);
		
		//replace
		String s4 = "ABCD";
		String result4 = s4.replace("A", "�ȳ�");
		System.out.println(result4);
		
		System.out.println(s4.charAt(0));
		System.out.println(s4.charAt(3));
		System.out.println(s4.endsWith("CD"));
		System.out.println(s4.equalsIgnoreCase("aBcD"));
		
		//POINT : split
		String s6 = "���۸�,��Ƽ,�����,������,������";
		String[] namearry = s6.split(",");
		for(String s : namearry) {
			System.out.println(s);
		}
		String filename3 = "bit.hwp";
		String[] arry = filename3.split("\\."); //����ǥ������ ����ó�� �ν�
		System.out.println(arry.length);
		for(String s : arry) {
			System.out.println(s);
		}
		//Java
		//010-{\d4}-0000
		//010-000-0000 ���ڰ� ����ǥ�� ���Ŀ� ��ġ�ϴ� ��(false)
		//���� ī�信 ����(���� : ����ǥ���� 5�� ����� ����)
		
		String s7 = "a/b,c.d-f";
		StringTokenizer sto = new StringTokenizer(s7,"/,.-");
		while(sto.hasMoreTokens()) {
			System.out.println(sto.nextToken());
		}
		
		//�ͼ��� quiz
		String s8 ="ȫ                                           ��                                  ��";
		//����> ȫ�浿 �������� ����
		System.out.println(s8.replace(" ", ""));
		
		String s9 = "                   ȫ�浿                                         ";
		System.out.println(">"+s9+"<");
		System.out.println(">"+s9.trim()+"<");
		
		String s10 = "           ȫ      ��      ��                 ";
		//System.out.println(s10.replace(" ", ""));
		String re = s10.trim();
		String re2 = re.replace(" ", "");
		System.out.println(re2);
		
		//�������� �Լ��� �����ҋ���
		//method chain ���
		System.out.println(s10.trim().replace(" ", ""));
		
		//Quiz-1
		String snumstr="";
		int sum = 0;
		String[] numarr = {"1","2","3","4","5"};
		//���� �迭�� �ִ� ���ڰ����� ���� sum ������ ��Ƽ� ����ϼ���
		for(int i = 0; i<numarr.length; i++) {
			sum +=Integer.parseInt(numarr[i]);
		}
		System.out.println(sum);
		
		
		
		
		
		//Quiz-2
		String jumin ="123456-1234567";
		/*System.out.println(jumin.replace("-", "0"));
		//���� �ֹι�ȣ�� ���� ���ϼ���
		int a = Integer.parseInt(jumin.substring(0,1));
		int b = Integer.parseInt(jumin.substring(1,2));
		int c = Integer.parseInt(jumin.substring(2,3));
		int d = Integer.parseInt(jumin.substring(3,4));
		int e = Integer.parseInt(jumin.substring(4,5));
		int f = Integer.parseInt(jumin.substring(5,6));
		//int g = Integer.parseInt(jumin.substring(6,7));
		int h = Integer.parseInt(jumin.substring(7,8));
		int i = Integer.parseInt(jumin.substring(8,9));
		int j = Integer.parseInt(jumin.substring(9,10));
		int k = Integer.parseInt(jumin.substring(10,11));
		int l = Integer.parseInt(jumin.substring(11,12));
		int m = Integer.parseInt(jumin.substring(12,13));
		int n = Integer.parseInt(jumin.substring(13,14));
		System.out.println(a+b+c+d+e+f+h+i+j+k+l+m+n);*/
		String result22 = jumin.replace("-", "0");
		int jae=0;
		
		for(int i1 =0; i1<result22.length(); i1++) {
			jae += Integer.parseInt(result22.substring(i1,i1+1));
			
		}System.out.println(jae);
		/////////////////////////////////////����� �ڵ�/////////////////////////////////////////////////
		/*//Quiz-2
				String jumin="123456-1234567";
				//�� �ֹι�ȣ�� ���� ���ϼ���
				 int sum2 = 0;
				 for(int i = 0 ; i < jumin.length() ; i++){
						 String numstr = jumin.substring(i,i+1);
						 if(numstr.equals("-"))continue;
						 sum2+= Integer.parseInt(numstr);
					 }
				  System.out.println("�ֹι�ȣ�� :  " + sum2);

			    //�ֹι�ȣ�� ���� ���ϼ��� _2
		 	    //String jumin2 = jumin.replace("-", "").split(regex);
				   String[] numarr2 = jumin.replace("-", "").split("");
				   int sum3 =0;
				   for(String i : numarr2){
					   sum3 += Integer.parseInt(i);
				   }
				   System.out.println("�ֹι�ȣ��2 : " + sum3);

				
			   //�ֹι�ȣ�� ���� ���ϼ��� _3
				   String jumin4 = jumin.replace("-", "");
				   int sum4 = 0;
				   for(int i = 0; i < jumin4.length() ; i++){
					   sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
				   }
				   System.out.println("�ֹι�ȣ��3 : " + sum4);

				
				   //format (web) String Ŭ���� static �Լ� > format 
				   //prinf() cmd ���
				   String str5 = String.format("%d-%s",10,"AA");
				   System.out.println(str5);
				   //static : valueof , format
				
				*/
		
		
			
			
		}
		
	}


