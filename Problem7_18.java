package 数组作业;

public class Problem7_18 {

	public int bubbleSort(int[] list) {
		int temp=0;
		for(int i=0;i<list.length;i++) {
			for(int j=i;j<list.length;j++) {
				if(list[i]>list[j]) {
					temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}
		return 1;
	}

}
