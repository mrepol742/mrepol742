#include <stdio.h>

int main() {
    int grade;
    printf("Enter a grade\n");
    scanf("%d", &grade);
    if (grade > 75) {
        printf("you pass");
    } else {
        printf("YOU FAILED");
    }
    return 0;
}