from ast import literal_eval
class Solution(object):
    def findAnagrams(self, s, p):
        char_map = {}
        for x in p:
           if x not in char_map:
               char_map[x] = 1
           else:
               char_map[x] += 1
        dic = {}
        lst =[]
        for i in range(len(s)):
            char = s[i]

            if char not in char_map.keys():
               dic.clear()
            #    print('clearing!', char, i)

            else:
                new_map = char_map.copy()
                dic[i] = new_map
                for index,index_map in dic.items():
                    if char not in index_map.keys() or index_map[char] == 0: 
                        dic.pop(index)
                    else:
                        # print(i, index, index_map)
                        index_map[char] += -1   
                        if index_map[char] == 0:
                            index_map.pop(char)
                        if not index_map:
                            lst.append(index)
                            dic.pop(index)

        
        return lst
               
            
