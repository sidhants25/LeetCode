class CombinationSum_39(object):
    def combinationSum(self, candidates, target):
        dic = {}

        for x in candidates:
            dic[x] = []
            dic[x].append([x])

        for i in range(1,target+1):
            if i not in dic:
                dic[i] = []
            for j in range(1, i/2 + 1):
                if len(dic[j]) > 0 and len(dic[i - j]) > 0:
                    for small in dic[j]:
                        for big in dic[i - j]:
                            z = small + big
                            z.sort()
                            if z not in dic[i]:
                                dic[i].append(z)
        return dic[target]