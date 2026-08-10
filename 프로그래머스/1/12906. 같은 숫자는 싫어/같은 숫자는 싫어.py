def solution(arr):
    answer = []
    answer.append(arr[0])
    count = 0
    for i in range(len(arr)):
        if(answer[count]!=arr[i]):
            answer.append(arr[i])
            count+=1
    return answer