//U10416019鄭文琪

public class BubbleSort{
	//data fields
	private int number = 2;
	private int[] bubble = new int[number];
	private int keep;
	
	//create a constructor
	BubbleSort(int number, int[] bubble){
		this.number = number;
		this.bubble = bubble;
		setBubbleSort();
		setPrintBubble();
		System.out.println("");
	}

}