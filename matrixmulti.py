def solution(arr1, arr2):
    answer = []
    i,j,x,y = 0,0,0,0
    n = []
    a=0
    while(True):
        a+=arr1[i][j] * arr2[x][y]
        x+=1
        j+=1

        if(x==len(arr2)):
            x=0
            y+=1
            n.append(a)
            a=0

        if (j == len(arr1[0])):
            j = 0

        if (y == len(arr2[0])):
            y=0
            answer.append(n)
            n=[]
            i += 1

        if(i==len(arr1)):
            break

    return answer

#list(zip(*arr2))  행>열 변환


arr1=[[2, 3, 2], [4, 2, 4], [3, 1, 4]]
arr2=[[5, 4, 3], [2, 4, 1], [3, 1, 1]]
print()
print(solution(arr1,arr2))
'''
문제 설명
2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하입니다.
행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수입니다.
곱할 수 있는 배열만 주어집니다.
입출력 예
arr1	                                arr2	                            return
[[1, 4], [3, 2], [4, 1]]	            [[3, 3], [3, 3]]	                [[15, 15], [15, 15], [15, 15]]
[[2, 3, 2], [4, 2, 4], [3, 1, 4]]	    [[5, 4, 3], [2, 4, 1], [3, 1, 1]]	[[22, 22, 11], [36, 28, 18], [29, 20, 14]]

'''