#include <stdio.h>

int main(void) {

	printf("int 3 / int 4 = int %d\n", 3 / 4);
	printf("int 3 / int 4 = 결과가 int로 나옴 0 = double로 표현하면 %f\n", 3 / 4);
	printf("double 3 / double 4 = 결과가 double로 나옴 %f\n", 3.0 / 4.0);

	printf("int 3 %% int 4 = int %d\n", 3 % 4);
	//printf("int 3 %% int 4 = int %d\n", 3.0 % 4.0);
	//나머지 연산은 정수에서만 사용 가능 - 실수는 컴파일 에러
	//fmod인가 함수 있을 거야.

	return 0;
}
