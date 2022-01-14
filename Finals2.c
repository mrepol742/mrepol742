#include<stdio.h>

int main() {

    int n;
  int arr[10];
  printf("Enter 1 to 10: ");
  scanf("%d", &n);
printf("\n\n");
  for (int i = 0; i < n; ++i) {
    printf("Number %d: ", i + 1);
    scanf("%d", &arr[i]);
  }


  for (int i = 1; i < n; ++i) {
    if (arr[0] < arr[i]) {
      arr[0] = arr[i];
    }
  }

  printf("\nThe largest value is: %d\n", arr[0]);
  
    return 0;
}