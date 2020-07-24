names_file = open("names.txt","r")
for line in names_file:
    names=line.split(",")
names_file.close()

names[-1] = names[-1][:-2]
sorted_names = sorted(names)

letter_score_dict = {'A':1, 'B':2,'C':3,'D':4,'E':5,'F':6,'G':7,'H':8,'I':9,'J':10,'K':11,'L':12,'M':13,'N':14,'O':15,'P':16,'Q':17,'R':18,'S':19,'T':20,'U':21,'V':22,'W':23,'X':24,'Y':25,'Z':26}

total_names_score =0

for x in range(len(sorted_names)):
    rank_in_list = x+1
    word_score = 0
    for y in sorted_names[x]:
        word_score += letter_score_dict.get(y,0)
    total_names_score += (word_score*rank_in_list)
    print(sorted_names[x] + "  " + str(rank_in_list))
print("Total=" + str(total_names_score))

