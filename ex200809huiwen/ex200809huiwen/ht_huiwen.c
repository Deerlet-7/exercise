#include<stdio.h>
void huiwen(int num)
{
	int a[10] = 0; 
	int temp = num;
	int i;
	int j = 1;
	int k = 0;
	int n = j;
	while (temp / 10 != 0){
		j++;
	}
	temp = num;
	while (j > 0){
		a[j - 1] = num % 10;
		num = num / 10;
		j--;
	}
	while (1){
		if (a[k] ==a[j - 1]){
			k++;
			n--;
			if (k - (j - 1) == 2 || k - (j - 1) == 1)
			{
				printf("是回文数");
				break;
			}
		}
		else{
			printf("不是回文数");
			break;
		}
	}
	for (i = 0; i < j - 1; i++){
		printf("%d", a[i]);
	}
}
int main()
{
	int num = 12345;
	//scanf_s("%d", &num);
	huiwen(num);
	return 0;
}