# Given a list of numbers, return whether any two sums to k.
# For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
# Time complexity = O(n)

def isPairSum(array_input, k):
	countMap = {}
	for i in array_input:
		if abs(k-i) in countMap:
			return i, abs(k-i)
		else:	
			countMap[i] = i
	
	return None, None

def main():
	array_input = [10, 15, 3, 7]
	k = 17
	ele1, ele2 = isPairSum(array_input, k)
	if ele1 != None and ele2 != None:
		print "The pair is " + str(ele1) + " and "+ str(ele2)
	else:
		print "No pair exists"



if __name__ == '__main__':
	main()

