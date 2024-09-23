#include <stdio.h>

int main()
{
    int sum = 0;          // To store the sum of ASCII values
    char name[20];
    int i = 0;

    printf("Enter a name: ");
    scanf("%19s", name);  // Read input, preventing buffer overflow by limiting to 19 characters

    while (name[i] != '\0') // Loop until the end of the string (null terminator)
    {
        printf("\nThe ASCII value of the character %c is %d", name[i], name[i]);
        sum = sum + name[i]; // Add ASCII value of the character to the sum
        i++;
    }

    printf("\nSum of the ASCII values of the string is: %d", sum); // Print the final sum

    return 0;
}
