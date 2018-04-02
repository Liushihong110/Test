package arraySort;

import java.util.Scanner;

/**
 * 
 * 需求:键盘录入5个整型数，并将这各个数字按照从大到小的顺序输出到控制台。
 * 		功能已完成！
 * 	eclipse提取方法的快捷键是:Alt+Shift+M
 *
 */
public class ArraySort {
	public static void main(String[] args) {
		//定义一个长度为5的数组，用于接收录入的数据
		int [] arr = new int [5];
		//键盘录入数字
		Scanner sc = new Scanner(System.in);
		for(int x = 1;x<=arr.length;x++) {
			//提示请输入要录入的整型数字
			System.out.println("请输入要录入的第"+x+"个数据");
			arr[x-1]= sc.nextInt();
		}
		SortPrint(arr);
	}

	private static void SortPrint(int[] arr) {
		//利用冒泡排序将得到的数组按照从大到小的顺序进行排列并输出到控制台进行打印。
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//遍历排好序的数组并将其打印到控制台。
		for(int x = 0; x<arr.length;x++) {
			System.out.print(arr[x] + (x==arr.length-1? "":","));
		}
	}
}
