#define _CRT_SECURE_NO_WARNINGS // include 위에 적어줘야 함.
#include <stdio.h>
#define PIE 3.14

/*
Ctrl + F5 : 디버깅하지 않고 시작
F5 : 디버깅 후 시작
Ctrl + k + c : 해당 줄 주석 처리
Ctrl + k + u : 해당 줄 주석 해제
Shift + Alt + Enter : 코드 전체 화면
*/

int main(void) {
	// 01. 복습
	printf("hello");

	
	// 02.
	int number; // 변수 선언: 자료형 변수명
				/* 
					변수명 규칙 : 알파벳(대,소문자), 숫자, 언더바
					숫자로 시작할 수 없고, 공백은 안됨.
					이미 기능을 하고있는 키워드도 안됨.
					최대한 구체적으로 짤 것!
					카멜 표기법이라 함.
				*/ 
	number = 7; // 변수 초기화; 변수에 처음 값을 넣는 것
	printf("%d", number); // decimal; 10진수

	int num = 1; // 선언과 동시에 초기화
	printf("num : %d\n", num); // 개행

	int n1, n2; // 한 줄에 여러개도 선언 가능


	/*
	예제. 변수 2개의 값을 바꿀 수 있다. 어떻게 바꿀 수 있을까? 제한시간 5분
	*/

	//PIE = 1.2; <-- 매크로 상수는 값 변경이 안되.
	const int people = 29;
	//people = 30; <-- 심볼릭 상수는 변경이 안되. 반드시 선언과 동시에 값 초기화.

	
	// 03. 
	// 자료형
	// 정수(문자) : char | 정수 : short, int, long, long long | 실수 : float, double, long double
	// 각 자료형의 값의 범위는 암기하는 것이 아님. 차라리 필요할 때마다 관련 자료를 찾아보자.
	char c = 'A'; // 유니코드!=아스키코드; 1바이트
	char na = '나'; // ERROR
	char ga[3] = "가";
	// CP949와 EUC-KR은 한글 1글자를 2바이트로 저장하는데, UTF-8은 한글 1글자를 3바이트로 저장합니다. 
	// 따라서 문자열 "안녕"의 길이를 구할 때 
	// .c 파일을 CP949, EUC-KR로 저장했다면 4, UTF-8로 저장했다면 6이 나옵니다.

	printf("%c\n", c);
	printf("%d\n", c);
	printf("%d\n", c + 1);
	printf("%s\n", ga);
	printf("int의 size는 %d\n", sizeof(100));

	printf("%0.2f\n", 3.141592); // 소수점 자르기


	// 04. 형 변환
	double d = 10;
	int i = 1.2345;
	short s = 70000; // short : -32,768 ~ 32,767

	printf("%f\n", d);	// 실수를 출력할 때는 %f
	printf("%d\n", i);
	printf("%d\n", s);

	printf("%d\n", (short)3.1415);
	printf("%d\n", (int)3.1415);
	printf("%f\n", (double)10);
	printf("%f\n", (float)10);



	// 05.
	int scanfNum;
	//scanf_s("%d", &scanfNum);
	//scanf("%d", &scanfNum);
	/*
		2010년대 이후 scanf가 보안 상 불완전하다는 걸 알게되서, Secure를 보안한 scanf_s 탄생
		scanf를 그대로 사용하려면 제일 위에
		#define_CRT_SECURE_NO_WARNINGS
	*/

	char character;
	int inum;
	float fnum;

	scanf("%c", &character);
	scanf("%d", &inum);
	scanf("%f", &fnum);

	printf("%c, %d, %f \n", character, inum, fnum);

	
	int num1, num2, num3;
	printf("세 개의 정수 입력 : ");
	scanf("%d %d %d", &num1, &num2, &num3);
	printf("입력된 정수는 : %d, %d, %d 입니다. ", num1, num2, num3);

	/*
		깜짝 예제. 실수, 정수, 실수를 차례대로 입력
	*/


	// 06.
	// 산술 연산자 : +, -, *, /, %
	// 대입 연산자 : +=, -=, *=, /=, %=
	// 비교 연산자 : <, >, ==, !=, <=, >= <-- 참 거짓으로 결과 반환 1 or 0
	// ★ 증감 연산자 : ++, -- <-- 위치 매우 중요 (전위(prefix), 후위(postfix))

	// 연산자 우선순위는 직접 해보자.
	int result = num++ + num2 * 3;
	printf("연산 결과 : %d\n", result);

	// 삼항 조건 연산자
	int absolute = num > 0 ? num : num * -1;
	printf("절댓값 : %d\n", absolute);

	return 0;
}