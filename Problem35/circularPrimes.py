import math

def isPrime(num):
    isPrime = True
    for x in range(2, int(math.sqrt(num)+1)):
        if num % x == 0:
            isPrime = False
    return isPrime

primeDict = {}

answers = []

for x in range(2,1000000):
    tempIsPrime = isPrime(x)
    primeDict[x] = tempIsPrime

for x in range(2, 1000000):
    tempIsPrime = primeDict.get(x,False)
    if tempIsPrime:
        k = 1
        isCircular = True
        tempX = x
        while k < len(str(x)):
            tempX = str(tempX)[1:] + str(tempX)[0]
            if primeDict.get(int(tempX),False) == False:
                isCircular = False
            k += 1
        if isCircular:
            answers.append(x)
answers.sort()
answers = list(dict.fromkeys(answers))
print(answers)
print(len(answers))
