def solution(n):
    answer = []
    i = 2
    while(i<n and n!=0):
        if(n%i==0):
            answer.append(i)
            while(n%i==0):
                n=n/i
        else:
            i+=1
    if(i==n):
        answer.append(i)
    return answer