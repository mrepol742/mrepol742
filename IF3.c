#include<stdio.h>

int main() {
    int integer;
    printf("Enter an Integer: ");
    scanf("%d", &integer);
    if (integer % 2 == 0) {
        printf("%d is a even number\n", integer);
    } else {
        printf("%d is a odd number\n", integer);
    }
    return 0;
}
