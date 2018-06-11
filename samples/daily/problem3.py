# Given an array of integers, find the first missing positive integer in 
# linear time and constant space. In other words, find the lowest positive integer that does 
# not exist in the array. The array can contain duplicates and negative numbers as well.

# For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.


#Logic: 
#loop through every element and make sure that a[i] has i

#Time : O(n)
#Space : O(1)
def findMissingInteger(array):
	n = len(array)
	for i in xrange(n):
		while array[i] != i + 1:
			# element is negative or > length ignore it 
			if array[i] <0 or array[i] >= n:
				break

			#handle duplicates
			if array[i] == array[array[i]-1]:
				break
				
			#Swap a[2] with a[a[2]]	
			temp = array[i]
			array[i] = array[temp-1]
			array[temp-1] = temp
			print array


	for x in xrange(0, n):
		if array[x] != x+1 :
			return x +1

	return 1

def main():
	input_array = [1, 2, 0]
	print "Missing least positive integer is: " + str(findMissingInteger(input_array))
	pass


if __name__ == '__main__':
	main()