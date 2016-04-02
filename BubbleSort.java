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
	
	//create a mutator method to let the numbers which the user enter sort from small to large
	public void setBubbleSort(){
		for(int i = 1; i < bubble.length; i++){
			for(int j = 0; j < bubble.length - i; j++){
				if(bubble[j] > bubble[j + 1]){
					keep = bubble[j];
					bubble[j] = bubble[j + 1];
					bubble[j + 1] = keep;
				}
			}
		}
	}

}