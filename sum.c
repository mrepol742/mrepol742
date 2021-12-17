#include <stdio.h>

int main() {
    int first;
    printf("Enter first integer:\n");
    scanf("%d", &first);
    int second;
    printf("Enter second integer:\n");
    scanf("%d", &second);
    int sum = first + second;
    printf("the sum is %d\n", sum);

    if (sum > 100) {
        printf("the sum is %d. The sum is greater than 100", sum);
    } else if (sum <= 80 || sum >= 61) {
        printf("the sum is less than or equals to 80");
    } else if (sum <= 60 || sum >= 41) {
        printf("the sum is less than or equals to 60");
    } else if (sum <= 40 || sum >= 21) {
        printf("the sum is less than or equals to 40");
    } else {
        printf("the sum is less than or equals to 20");
    } 
    return 0;
}