package com.subarraysum.impl.java;

import com.subarraysum.dto.java.OutputDto;

public class FindMaxSubArrayImpl implements IFindMaxSubArraySum {

	@Override
	public OutputDto findMaxSubArraySum(Integer[] arr) {
		OutputDto dto = new OutputDto();
 		int maxTillI = Integer.MIN_VALUE;
		int maxTillLast = 0;
		int start = 0;
		int end = 0;
		int s = 0;

		for (int i = 0; i < arr.length; i++) {
			maxTillLast = maxTillLast + arr[i];

			if (maxTillI < maxTillLast) {
				maxTillI = maxTillLast;
				start = s;
				end = i;
			}

			if (maxTillLast < 0) {
				maxTillLast = 0;
				s = i + 1;
			}
		}
		Integer [] subArrayElements = new Integer[((end - start)+1)];
		for (int j = start, k=0; j <= end; j++, k++) {
			subArrayElements[k] = arr[j];
		}
		
		dto.setMaxSum(maxTillI);
		dto.setStartingIndex(start);
		dto.setEndingIndex(end);
		dto.setLength((end - start)+1);
		dto.setElements(subArrayElements);
		return dto;
	}
}
