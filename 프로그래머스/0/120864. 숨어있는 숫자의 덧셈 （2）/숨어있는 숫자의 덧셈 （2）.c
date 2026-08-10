#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* my_string) {
    int answer = 0;
    int tmp=0;
    for(int i=0;my_string[i]!='\0';i++){
        if(i!=0&&my_string[i-1]>='0'&&my_string[i-1]<='9'&&my_string[i]>='0'&&my_string[i]<='9'){
            tmp *=10;
            tmp += my_string[i]-'0';
            continue;
        }else if(my_string[i]>='0'&&my_string[i]<='9'){
            tmp = my_string[i]-'0';
            continue;
        }
        answer+=tmp;
        tmp = 0;
    }
    answer+=tmp;
    return answer;
}