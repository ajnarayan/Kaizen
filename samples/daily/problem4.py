# cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and 
# last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.


#Decorator that returns the pair function given 2 input
def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair

def car(f):
	return f(lambda a,b: a)

def cdr(f):
	return f(lambda a,b: b)

def main():
	print "first element in pair 3,4 is : " + str(car(cons(3,4)))
	print "last element in pair 3,4 is : " + str(cdr(cons(3,4)))

if __name__ == '__main__':
    	main()    