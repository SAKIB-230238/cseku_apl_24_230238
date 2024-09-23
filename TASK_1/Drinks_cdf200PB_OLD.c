#include <stdio.h>

int main() {
    int n, p, total = 0;
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        scanf("%d", &p);
        total += p;
    }

    double result = (double)total / n;
    printf("%.12f\n", result);

    return 0;
}
