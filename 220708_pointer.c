#include <stdio.h>
int main(void) {

	/*
		sizeOf
	*/

	/*복습*/
	int num = 30;
	int* ptr = &num; 
	printf("num의 주소 = ptr의 값 = %p\n", ptr); // 출력할 때마다 다르게 나옴.

	/*
		메모리에서 생각해보자.
		사실 이건 단순히 주소가 아님.
		변수는 1호~4호 이렇게 할당을 받는데..
		거기 시작 주소를 뜻함.
	*/

	/*예제1*/
	char cnum = 'z';
	double dnum = 3.14;

	char* cptr = &cnum; 
	double* dptr = &dnum;

	printf("cptr = %p\n", cptr);
	printf("dptr = %p\n", dptr);

	/*예제2*/
	int inum = 9999;
	int * iptr2 = &inum;
	int* iptr = &inum; // 선언할때 *는, iptr이 포인터 변수라는 걸 알려주기 위함.

	printf("iptr2를 (10진수)%%d로 출력하면 = %d\n", iptr2);
	printf("iptr2를 (포인터)%%p로 출력하면 = %p\n", iptr2); // 16진수
	printf("iptr2를 (16진수)%%x로 출력하면 = %x\n\n", iptr2); // 16진수
	/*
	    http://www.tcpschool.com/c/c_pointer_intro
		같은 16진수인데, %p를 쓰는 이유?
		64bit 컴퓨터에서 64bit 컴파일러로 돌리면, 
		한번에 처리할 수 있는 연산이 64비트 = 8바이트 라는 뜻.
		8bit = 1바이트 
		포인터 변수의 크기는 무조건 8바이트! (char *, double *, int * 모두)
		8자리가 나와야합니다.
	*/

	printf("inum = inum의 값 = %d", inum);	// 9999
	printf("&inum = inum이 있는 곳(주소) = %p", &inum); // 
	printf("iptr = iptr의 값 = &inum = %p\n", iptr);   // = &inum = inum의 주소 = inum상자가 있는 곳
	printf("*iptr = *(iptr의 값) = *(&inum) = *(inum이 있는 곳)%d\n\n", *iptr); // = inum = inum상자에 든 값
								   // 여기서, *는 값을 가져오라는 뜻.


	/*예제3*/
	int n = 10;
	int* pNum = &n; // pNum에 n의 주소를 저장

	*pNum = 20; // pNum이 가리키고 있는 주소에 있는 변수를 가리킴
	printf("n : %d\n", n);
	(*pNum)++;
	printf("n : %d\n", n);
	printf("*pnum : %d\n", *pNum);

	/*
		포인터를 사용하는 이유
		- 직접 주소를 찾아가서 직접적은 접근을 해야할 때 사용합니다.
		예를 들면, 임베디드 프로그래밍 (내장 시스템을 제어하기 위한.. 세탁기 등)
		또는 메모리를 우리가 우리 손으로 할당 해야할 때.
		     = 이게 우리는 장점이라고 본다. 특히 임베디드 세계에선 정말!
		(지금은 컴퓨터가 필요한 만큼 알아서 할당해주고 있음, 다다음주에 해볼거야)
		
	*/

	/*예제5*/
	int myArr[3] = { 1,2,3 };
	printf("배열의 이름은 사실, 배열의 주소를 뜻함 : %p\n", myArr);
	printf("0번 원소 : %p\n", &myArr[0]); // 이것도 변수 하나하나임.
	printf("1번 원소 : %p\n", &myArr[1]);
	printf("2번 원소 : %p\n", &myArr[2]);

	/*예제6*/
	int iArr[3] = { 10, 20, 30 };
	printf("%d %d %d\n", iArr[0], iArr[1], iArr[2]);
	printf("%d %d %d\n", *iArr, *(iArr+1), *(iArr+2));
	printf("%p %p %p %p\n", iArr, &iArr[0], &iArr[1], &iArr[2]);

	/*
		시간 있으면 2차원 배열
	*/

	return 0;
}
