package com.mycompany.algo1;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Packing {

	public static void main(String[] args) {
		int[] boxes = { 1, 3, 2 };
		int[] unitsPerBox = { 3, 1, 2 };
		int truckSize = 3;

		System.out.println(pack(boxes, unitsPerBox, truckSize));
		
		int[] boxes1 = {3, 1, 6};
		int[] unitsPerBox1 = {2, 7, 4};
		int truckSize1 = 6;
		System.out.println(pack(boxes1, unitsPerBox1, truckSize1));
	}

	private static int pack(int[] boxes, int[] unitsPerBox, int truckSize) {
		Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

		for (int i = 0; i < boxes.length; i++) {
			map.put(boxes[i], unitsPerBox[i]);
		}

		int maxPack = 0;
		int curSize = truckSize;
		for (Integer key : map.keySet()) {
			if (curSize != 0) {
				maxPack += (key * map.get(key));
				curSize -= map.get(key);
			} else {
				break;
			}
		}

		return maxPack;
	}

}
