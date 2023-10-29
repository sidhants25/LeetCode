from collections import deque 

class WordLadder_127(object):
    def ladderLength(self, beginWord, endWord, wordList):

        if endWord not in wordList:
            return 0

        words = set()

        queue = deque()
        queue.append((beginWord,0))
        words.add(beginWord)

        while queue:
            curr, moves = queue.popleft()
            if curr == endWord:
                return moves+1

            for w in wordList:
                if w not in words and self.countDiff(curr,w):
                    queue.append((w, moves +1))
                    words.add(w)


        return 0
    
    def countDiff(self, word1, word2):
        diff = 0
        for i in range(len(word1)):
            if word1[i] != word2[i]:
                diff += 1
                if diff > 1:
                    return False
        return diff == 1

        