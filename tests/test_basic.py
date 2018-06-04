from .context import sample

import unittest


class BasicTestSuite(unittest.TestCase):
	"""Basic Test Suite"""

	def test_true(self):
		assert True



if __name__ == '__main__':
	unittest.main()
