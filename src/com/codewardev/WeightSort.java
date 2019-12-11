package com.codewardev;

// https://www.codewars.com/kata/55c6126177c9441a570000cc/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeightSort {

	public static String orderWeight(String string) {
		System.out.println(string.trim());
		
		return Arrays.stream(string.split(" "))
				.sorted((str1, str2) -> {
					int i = Arrays.stream(str1.split("")).mapToInt(Integer::valueOf).sum();
					int j = Arrays.stream(str2.split("")).mapToInt(Integer::valueOf).sum();
					return (i-j== 0? str1.compareTo(str2): Integer.compare(i, j));
				})
				.collect(Collectors.joining(" "));
		
	}

}
