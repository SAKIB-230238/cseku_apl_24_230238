#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);  // Read input integer from the user

    while (n != 1)    // Continue until n is reduced to 1
    {
        printf("%d ", n);  // Print the current value of n

        for (int i = 2; i <= n; i++)  // Find the smallest divisor of n
        {
            if (n % i == 0)  // Check if i is a divisor of n
            {
                n /= i;      // Divide n by its smallest divisor
                break;       // Exit the loop after dividing
            }
        }
    }

    printf("%d\n", n);  // Print the final value (which will be 1)
    return 0;
}
