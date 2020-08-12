#include<stdio.h>

void main()
{
	int i = 0;
	int j = 0;
	int k = 9;
	int temp = 0;
	int a[10] = { 13, 24, 57, 78, 43, 12, 34, 56, 23,97};
	int b[10];
	for (i = 0; i < 10; i++)
	{
		if (a[i] % 2 != 0){
			b[j] = a[i];
			j++;
		}
		else
		{
			b[k] = a[i];
			k--;

		}
	}
	for (i = 0; i < 10; i++){
		printf(" %d", b[i]);
	}
	system("pause");
}