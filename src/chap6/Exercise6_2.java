package chap6;

public class Exercise6_2 {

	public static void main(String[] args) {
		SutdaCard s1 = new SutdaCard(3, false);
		SutdaCard s2 = new SutdaCard();
		
		System.out.println(s1.info());
		System.out.println(s2.info());
	}
}



class SutdaCard { 
	int num;
	boolean isKwang;
	
	//������
	SutdaCard (){
		this(1,true);
	}
	
	SutdaCard (int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	//info �޼ҵ�
String info() { 
	return num + (isKwang? "K": "");
}	
	
}

