#define _CRT_SECURE_NO_WARNINGS // include ���� ������� ��.
#include <stdio.h>
#define PIE 3.14

/*
Ctrl + F5 : ��������� �ʰ� ����
F5 : ����� �� ����
Ctrl + k + c : �ش� �� �ּ� ó��
Ctrl + k + u : �ش� �� �ּ� ����
Shift + Alt + Enter : �ڵ� ��ü ȭ��
*/

int main(void) {
	// 01. ����
	printf("hello");

	
	// 02.
	int number; // ���� ����: �ڷ��� ������
				/* 
					������ ��Ģ : ���ĺ�(��,�ҹ���), ����, �����
					���ڷ� ������ �� ����, ������ �ȵ�.
					�̹� ����� �ϰ��ִ� Ű���嵵 �ȵ�.
					�ִ��� ��ü������ © ��!
					ī�� ǥ����̶� ��.
				*/ 
	number = 7; // ���� �ʱ�ȭ; ������ ó�� ���� �ִ� ��
	printf("%d", number); // decimal; 10����

	int num = 1; // ����� ���ÿ� �ʱ�ȭ
	printf("num : %d\n", num); // ����

	int n1, n2; // �� �ٿ� �������� ���� ����


	/*
	����. ���� 2���� ���� �ٲ� �� �ִ�. ��� �ٲ� �� ������? ���ѽð� 5��
	*/

	//PIE = 1.2; <-- ��ũ�� ����� �� ������ �ȵ�.
	const int people = 29;
	//people = 30; <-- �ɺ��� ����� ������ �ȵ�. �ݵ�� ����� ���ÿ� �� �ʱ�ȭ.

	
	// 03. 
	// �ڷ���
	// ����(����) : char | ���� : short, int, long, long long | �Ǽ� : float, double, long double
	// �� �ڷ����� ���� ������ �ϱ��ϴ� ���� �ƴ�. ���� �ʿ��� ������ ���� �ڷḦ ã�ƺ���.
	char c = 'A'; // �����ڵ�!=�ƽ�Ű�ڵ�; 1����Ʈ
	char na = '��'; // ERROR
	char ga[3] = "��";
	// CP949�� EUC-KR�� �ѱ� 1���ڸ� 2����Ʈ�� �����ϴµ�, UTF-8�� �ѱ� 1���ڸ� 3����Ʈ�� �����մϴ�. 
	// ���� ���ڿ� "�ȳ�"�� ���̸� ���� �� 
	// .c ������ CP949, EUC-KR�� �����ߴٸ� 4, UTF-8�� �����ߴٸ� 6�� ���ɴϴ�.

	printf("%c\n", c);
	printf("%d\n", c);
	printf("%d\n", c + 1);
	printf("%s\n", ga);
	printf("int�� size�� %d\n", sizeof(100));

	printf("%0.2f\n", 3.141592); // �Ҽ��� �ڸ���


	// 04. �� ��ȯ
	double d = 10;
	int i = 1.2345;
	short s = 70000; // short : -32,768 ~ 32,767

	printf("%f\n", d);	// �Ǽ��� ����� ���� %f
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
		2010��� ���� scanf�� ���� �� �ҿ����ϴٴ� �� �˰ԵǼ�, Secure�� ������ scanf_s ź��
		scanf�� �״�� ����Ϸ��� ���� ����
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
	printf("�� ���� ���� �Է� : ");
	scanf("%d %d %d", &num1, &num2, &num3);
	printf("�Էµ� ������ : %d, %d, %d �Դϴ�. ", num1, num2, num3);

	/*
		��¦ ����. �Ǽ�, ����, �Ǽ��� ���ʴ�� �Է�
	*/


	// 06.
	// ��� ������ : +, -, *, /, %
	// ���� ������ : +=, -=, *=, /=, %=
	// �� ������ : <, >, ==, !=, <=, >= <-- �� �������� ��� ��ȯ 1 or 0
	// �� ���� ������ : ++, -- <-- ��ġ �ſ� �߿� (����(prefix), ����(postfix))

	// ������ �켱������ ���� �غ���.
	int result = num++ + num2 * 3;
	printf("���� ��� : %d\n", result);

	// ���� ���� ������
	int absolute = num > 0 ? num : num * -1;
	printf("���� : %d\n", absolute);

	return 0;
}