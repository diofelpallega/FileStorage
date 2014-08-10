import unittest
from villain2 import *

class MyTest(unittest.TestCase):
    def test_01_output(self):
        self.failIf(index(object,"january",3,"white") != "You are - The Black Creature of the North -","Wrong output")
    def test_02_output(self):
        self.failIf(index(object,"febuary",8,"cyan") != "You are - The Vengeful Knight of the South -","Wrong output")
    def test_03_output(self):
        self.failIf(index(object,"march",4,"yellow") != "You are - The Dark King/Queen of the Dead -","Wrong output")
 
# runs all the tests defined above at once
if __name__ == '__main__':
	unittest.main()
