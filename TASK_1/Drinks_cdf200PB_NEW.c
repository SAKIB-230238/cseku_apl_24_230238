#include <stdio.h>

int main() {
    int n, p, total = 0;

    // Read the number of elements
    scanf("%d", &n);

    // Loop to read 'n' integers and calculate their sum
    for (int i = 0; i < n; i++) {
        scanf("%d", &p);  // Read the next integer
        total += p;  // Add it to the total sum
    }

    // Calculate the average by dividing the total by 'n'
    double result = (double)total / n;

    // Print the result with 12 decimal places
    printf("%.12f\n", result);

    return 0;
}
