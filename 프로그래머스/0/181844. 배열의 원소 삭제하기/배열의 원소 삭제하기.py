def solution(arr, delete_list):
    answer = []
    for r in arr:
        if r not in delete_list:
            answer.append(r)
    return answer