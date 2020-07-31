
setOfNums = ['1','2','3','4','5','6','7','8','9']
answer = 0
finalX = 0
for x in range(1,1000000):
    tempAns = ''
    multiple = 1
    while len(tempAns) < 9:
        newInt = str(multiple*x)
        tempAns += str(newInt)
        multiple += 1
    if int(tempAns) > answer:
        if len(tempAns) == 9:
            allNums = True
            for k in setOfNums:
                if k not in tempAns:
                    allNums = False
            if allNums:
                answer = int(tempAns)
                finalX = x
print(answer)
print(finalX)
