import java.util.*;
//the time I put on coding  homework4 is less than before , thanks god so much because I am afraid that I can't hang out the homework on time.
public class Player {
	private String n;// �W�r
	private int c;// total
	private int b;//�w�X
	private ArrayList<Card> oneRoundCard=new ArrayList<Card>();// �������d

	public Player(String name, int chips) {
	   this.n=name;//�קK�V�c����
	   this.c=chips;
	}
	//�^�ǩm�W
	public String getName() {
		return n;
	}
	public int makeBet() {//�U�w�X
		b=1;
		if(c<=0) {
		   return 0;
		}//�ˬd�w�X���ର<0
		return b; 
	}
	public void setOneRoundCard(ArrayList<Card> cards) {
		oneRoundCard=cards;
	}//�]�w���a�P��
	//�O�_�n�P
	public boolean hitMe() {
		int a1=0;
		for(int i=0;i<oneRoundCard.size();i++) {
			Card c=new Card(null,0);
			c=oneRoundCard.get(i);
			a1+=c.getRank();//�o��s�I��
		}
		//�I��<16�~�n�P
		if(a1<=16) {
			return true;
		}else {
			return false;
		}	
	}
	//�o��Ҧ����`�M
	public int getTotalValue() {
		int a2=0;
		for(int i=0;i<oneRoundCard.size();i++) {
			Card c=new Card(null,0);
			c=oneRoundCard.get(i);
			a2+=c.getRank();
		}
		return a2;
	}
	public  int getCurrentChips() {
		    return c;
	}//�^���w�X
	public void increaseChips(int diff) {
		   c=c+diff;
	}//�w�X������
	public void sayHello() {
		System.out.println("Hello , I am "+n+" .");
		System.out.println("I have "+c+" chips");
	}//��ܥX���a���۩I
}
