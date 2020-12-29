package string;

public class CycleLeaderIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="x3y5z6";
	/*	StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		
		for(char ch:str.toCharArray()){
			if(ch>='1' && ch<='9'){
				sb2.append(ch);
			}
			else
				sb1.append(ch);
		}
		
		System.out.println(sb1.append(sb2));*/
		
		int intindex=1;
		int charindex=1;
		boolean flag=true;
		int i=1;
		char[] ch=str.toCharArray();
		while(flag){
			if(ch[i]>='a' && ch[i]<='z'){
				charindex++;
			}else{
				intindex++;
			}
			if(charindex<intindex){
				char temp=ch[charindex];
				ch[charindex]=ch[intindex];
				ch[intindex]=temp;
				intindex++;
			}
			i++;
			
		}
	}

}
