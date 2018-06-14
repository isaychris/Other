import unittest

def isPalindrome(word):
    word = word.lower()
    left_index = 0
    right_index = len(word) - 1

    while (left_index < right_index):
        if word[left_index] != word[right_index]:
            return False
        else:
            left_index += 1
            right_index -= 1
    return True

class MyTest(unittest.TestCase):
    def test1(self):
        self.assertEqual(isPalindrome('bob'), True)
        self.assertEqual(isPalindrome('racecar'), True)
        self.assertEqual(isPalindrome('murder'), False)

    def test2(self):
        self.assertEqual(isPalindrome('chris'), True)
        
if __name__ == '__main__':
    unittest.main()
