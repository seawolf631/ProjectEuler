
rareFractions = []
for x in range(10,100):
    for y in range(10,100):
        if str(x)[1] == str(y)[0]:
            if int(str(x)[0]) > 0 and int(str(y)[1]) > 0:
                if x/y == int(str(x)[0])/int(str(y)[1]):
                    if x/y < 1:
                        rareFractions.append(x/y)
                        print(str(x) + "  " + str(y))
print(rareFractions)
total = 1
for k in rareFractions:
    total *= k
print("total =" + str(total))
