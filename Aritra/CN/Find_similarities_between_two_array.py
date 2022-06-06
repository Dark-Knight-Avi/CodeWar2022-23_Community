def findSimilarity(arr1, arr2, n, m):

    # Write your code here.
    common = []
    union = []
    for item in arr1:
        if item in arr2:
            common.append(item)
        else:
            union.append(item)
    for item in arr2:
        union.append(item)
    return [len(common), len(union)]
    
