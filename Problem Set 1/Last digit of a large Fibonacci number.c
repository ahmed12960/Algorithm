#include <stdio.h>

    int get_fibonacci_last_digit(long long n) {
    int first = 0;
    int second = 1;

    int res;
    int i;

    for (i = 2; i <= n; i++) {
        res = (first + second) % 10;
        first = second;
        second = res;
    }

    return res;
}

int main() {
    int n;
    scanf("%d",&n);
    int c = get_fibonacci_last_digit(n);
    printf("Last Number: %d",c);

    return 0;
}
