package com.hcl.algobasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

	//Stirng[] input = {"cup", "cake", "cup", "cup", "cake"};
	//String[] output = {"cup", "cake", "cup1", "cup2", "cake1"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List, Stack, Queue, Set, KeyValue/ Map
		
		String[] input = {"cup", "cake", "cup", "cup", "cake"};
		//String[] output = {"cup", "cake", "cup1", "cup2", "cake1"};
		//Step1: Build the map{"cup":3, "cake": 2}
		Map<String, Integer> map = new HashMap<>();
		for(String word: input) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		
		System.out.println("map=" + map);
		//Step2:
		List<String> list = new ArrayList<>();
		
		//should the list be driven by map or by the list, this is the 1st question
		
		//is this
		for(String key : map.keySet()) {
			int count = map.get(key);
			
			for(int i=0; i< count; i++) {
				if(i == 0) {
					list.add(key);
				} else {
					list.add(key + i);
				}
			}
		}
		
		System.out.println("list=" + list);
	}

}
