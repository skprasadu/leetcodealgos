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

		int[] boxes1 = { 2, 7, 4 };
		int[] unitsPerBox1 = { 3, 1, 6 };
		int truckSize1 = 6;
		System.out.println(pack(boxes1, unitsPerBox1, truckSize1));
	}

	private static int pack(int[] boxes, int[] unitsPerBox, int truckSize) {
		Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

		for (int i = 0; i < boxes.length; i++) {
			map.put(boxes[i], unitsPerBox[i]);
		}

		int result = 0;
		for (Integer box : map.keySet()) {
			int units = map.get(box);
			if (units < truckSize) {
				result += box * units;
				truckSize -= units;
			} else {
				result += box * truckSize;
				truckSize = 0;
			}
		}

		return result;
	}

}
