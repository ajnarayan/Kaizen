# Given an array of integers, return a new array such that each element at index i of 
# the new array is the product of all the numbers in the original array except the one at i.
# [1, 2, 3, 4, 5] -->  [120, 60, 40, 30, 24]

#O(n)
def bruteforce(array):
	prod = 1
	for i in array:
		prod *= i

	outarray = []
	print prod
	for i in range(0,len(array)-1):
		outarray.append(prod / array[i])

	print outarray

#TODO: Without devision

def main():
	input_array = [1,2,3,4,5]
	bruteforce(input_array)

if __name__ == '__main__':
	main()