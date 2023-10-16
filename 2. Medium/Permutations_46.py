class Permutations_46(object):
    def permute(self, nums):

        b = True
        queue = []
        for x in nums:
            s = [x]
            c_e = set()
            c_e.add(x)
            queue.append((s,c_e))
        
        
        while b:
            seq, curr_elems = queue[0]
            if len(seq) == len(nums):
                b = False
                break
            queue.pop(0)
            for x in nums:
                if x not in curr_elems:
                    new_seq = seq[:]
                    new_seq.append(x)
                    new_elems = curr_elems.copy()
                    new_elems.add(x)
                    queue.append((new_seq, new_elems))

        
        sol = [x for x,y in queue]
        return sol