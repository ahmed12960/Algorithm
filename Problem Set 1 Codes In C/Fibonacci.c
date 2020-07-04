#include <stdio.h>
int main(){
int n;
printf("Enter a Number: ");
scanf("%d", &n);
int F[n + 1];
F[0] = 0;
F[1] = 1;
int i;
for( i = 2; i <= n; i++)
F[ i ] = F[ i - 2 ] + F[ i - 1 ];

printf("Fibonacci number: %d\n", F[ n ]);
return 0;
}
