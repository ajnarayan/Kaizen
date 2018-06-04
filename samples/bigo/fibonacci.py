# -*- coding: utf-8 -*-
import time 


# Prints the sum of fibonacci numbers from 0..n
# Runtime: O(n)
# Without memo: O(2^n)

def memoize(func):
	memo = {}

	def checkmemo(i):
		if i not in memo:
			memo[i] = func(i)
		
		return memo[i]

	return checkmemo


@memoize
def fib(n):
	if n <= 0:
		return 0
	if n == 1:
		return 1

	return fib(n-1) + fib(n-2)


def main():
	print(fib(10))

if __name__ == '__main__':	
	main()     