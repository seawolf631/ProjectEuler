pentagonArr = []
pentagonDict = {}

n = 1
while True:
    newNumber = int((n * (3*n-1))/2)
    pentagonArr.append(newNumber)
    pentagonDict[newNumber] = True
    for x in pentagonArr:
        if pentagonDict.get((newNumber-x),False) == True:
            y = newNumber-x
            if pentagonDict.get((y-x),False) == True:
                answer = abs(y-x)
                print(answer)
                break
    n += 1
