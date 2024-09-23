#include <stdio.h>

void main()
{
    int num;
    int i, key, element_found = 0;

    printf("Enter number of elements you would like to take as input: ");
    scanf("%d", &num);  // Read the number of elements

    int arr[num];  // Declare an array of size 'num'

    printf("\nEnter all the elements of your choice:");
    for (i = 0; i < num; i++) {
        scanf("%d", &arr[i]);  // Read all the elements into the array
    }

    printf("\nEnter the key element that you would like to be searched: ");
    scanf("%d", &key);  // Read the key to be searched

    /* Linear search starts */
    for (i = 0; i < num ; i++) {
        if (key == arr[i]) {  // Check if the key matches the current array element
            element_found = 1;  // Mark that the element is found
            break;  // Exit the loop when the element is found
        }
    }

    if (element_found == 1)
        printf("We got the element at index %d", i + 1);  // Output the position (1-based index)
    else
        printf("We haven’t got the element at any index in the array\n");  // Output if element not found
}
