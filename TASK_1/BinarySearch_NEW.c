#include <stdio.h>

// Function to perform binary search on a sorted array
int binarySearch(int array[], int x, int low, int high) {
  // Loop to continue searching while the low index is less than or equal to the high index
  while (low <= high) {
    int mid = low + (high - low) / 2; // Find the middle element

    // Check if the target element (x) is found at the mid position
    if (x == array[mid])
      return mid;

    // If the target element is greater than the mid element, search in the right half
    if (x > array[mid])
      low = mid + 1;

    // Otherwise, search in the left half
    else
      high = mid - 1;
  }

  return -1; // Return -1 if the element is not found
}

int main(void) {
  int array[] = {3, 4, 5, 6, 7, 8, 9};  // Sorted array
  int n = sizeof(array) / sizeof(array[0]);  // Calculate the size of the array
  int x = 4;  // Element to search for

  // Call the binary search function and store the result
  int result = binarySearch(array, x, 0, n - 1);

  // Print the result based on whether the element was found
  if (result == -1)
    printf("Not found");
  else
    printf("Element is found at index %d", result);

  return 0;
}
