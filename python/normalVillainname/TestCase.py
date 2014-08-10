#DIOFEL S. PALLEGA
#CSC 181 
#3rd YEAR
from villain import what
import unittest

class ArithTest(unittest.TestCase):
    def runTest(self):
        """ Test Audition """
        self.failUnless(what('january',11,'yellow') == "The Black Sorcerer/Sorceress  of the Dead", "Add Fail")

def suite():
  suite_ = unittest.TestSuite()
  suite_.addTest(ArithTest())
  return suite_


runner = unittest.TextTestRunner()
test_suite = suite()
runner.run(test_suite)	
