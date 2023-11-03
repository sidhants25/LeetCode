class LargestRectangleHistogram_84(object):
    def largestRectangleArea(self, heights):
        left_area = heights[0]
        left_rects = []
        left_rects.append((1, heights[0], heights[0]))

        for i in range(1, len(heights)):
            width, height, area = left_rects[i-1]
            cont_area = (width+1)*min(height,heights[i])
            double_area = 2*min(heights[i],heights[i-1])
            
            if heights[i] >= cont_area and heights[i] >= double_area:
                left_rects.append((1, heights[i], heights[i]))
            elif double_area >= cont_area:
                left_rects.append((2,min(heights[i],heights[i-1]),double_area))
            else:
                left_rects.append((width+1, min(height,heights[i]),cont_area))
            
            _,_,new_area = left_rects[i]
            if new_area > left_area:
                left_area = new_area

        right_area = heights[-1]
        right_rects = []
        right_rects.append((1, heights[-1], heights[-1]))

        for i in reversed(range(0, len(heights)-1)):
            width, height, area = right_rects[i+1]
            cont_area = (width+1)*min(height,heights[i+1])
            double_area = 2*min(heights[i],heights[i+1])
            
            if heights[i] >= cont_area and heights[i] >= double_area:
                right_rects.append((1, heights[i], heights[i]))
            elif double_area >= cont_area:
                right_rects.append((2,min(heights[i],heights[i+1]),double_area))
            else:
                right_rects.append((width+1, min(height,heights[i]),cont_area))
            
            _,_,new_area = right_rects[i]
            if new_area > right_area:
                right_area = new_area
            

            
        print('right', [x for x in right_rects])
        print(['left', x for x in left_rects])
    
        
        return max(right_area, left_area)

        