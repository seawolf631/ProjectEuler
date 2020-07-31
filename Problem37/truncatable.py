import math 

primeDict = {2:True,3:True,5:True,7:True}
answerList = []

def isPrime(num):
    isPrime = True
    for k in range(2,int(math.sqrt(num))+1):
        if num % k == 0:
            isPrime = False
    if isPrime:
        primeDict[num] = True
    return isPrime

x = 10
while len(answerList) < 11:
    if isPrime(x):
        isAns = True
        k = 1
        while k < len(str(x)):
            if primeDict.get(int(str(x)[k:]),False) == False:
                isAns = False
            k += 1
        k = len(str(x))
        while k > 0:
            if primeDict.get(int(str(x)[:k]),False) == False:
                isAns = False
            k -= 1
        if isAns:
            print(x)
            answerList.append(x)
    x += 1

finalAnswer = 0 
for k in answerList:
    finalAnswer += k
print("Final Answer = " + str(finalAnswer))
