
triDict = {}
pentDict = {}
hexDict = {}

def triFunc(num):
    return int(((num+1)*num)/2)

def pentFunc(num):
    return int(((3 * num - 1)*num)/2)

def hexFunc(num):
    return int((2*num - 1)*num)

for i in range(1, 100000):
    newTri = triFunc(i)
    newPent = pentFunc(i)
    newHex = hexFunc(i)
    triDict[newTri] = True
    pentDict[newPent] = True
    hexDict[newHex] = True

for key in triDict.keys():
    if pentDict.get(key,False):
        if hexDict.get(key,False):
            print(key)
