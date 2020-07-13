import itertools
def solution(relation):
    answer = []

    for i in range(1,len(relation[0])+1):
        r = [i for i in range(0, len(relation[0]))]
        r=list(itertools.combinations(r,i))
        for j in r:
            b = []
            for x in range(len(relation)):
                a = []
                for y in j:
                    a.append(relation[x][y])
                b.extend([a])

            for x in range(len(b)):
                for y in range(x+1,len(b)):
                    if(b[x]==b[y]):
                        b[y]=0
            if(b.count(0)==0):
                answer.append(j)

    for i in range(len(answer)):
        for j in range(i+1,len(answer)):
            count = 0
            for x in answer[i]:
                if(x in answer[j]):
                    count+=1
            if(count==len(answer[i])):
                answer[j]=[-1]

    answer=[i for i in answer if i!=[-1]]

    return len(answer)




relation=	[["100", "ryan", "music", "2"], ["200", "apeach", "math", "2"], ["300", "tube", "computer", "3"],
              ["400", "con", "computer", "4"], ["500", "muzi", "music", "3"], ["600", "apeach", "music", "2"]]
print(solution(relation))