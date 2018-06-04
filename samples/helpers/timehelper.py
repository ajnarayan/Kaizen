import time 


def timed_function(inputfunction):
	"""
    Outputs the time a function takes
    to execute.
    """

    def wrapper():
    	t1 = time.time()
    	inputfunction()
    	t2 = time.time()
    	return "Time it took to run the function: " + str((t2 - t1)) + "\n"

    return wrapper