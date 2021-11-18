#include <stdio.h>

int main() {
    // My First C Program
    char name[100];
    printf("Your Full Name:\n");
    scanf("%[^\n]%*c", name);
    char course[100];
    printf("Your Course Name:\n");
    scanf("%[^\n]%*c", course);
    char school[100];
    printf("Your School Name:\n");
    scanf("%[^\n]%*c", school);
    int age;
    printf("Your Age:\n");
    scanf("%d", &age);
    
    printf("\n\nFull Name: %s\n", name);
    printf("Course Name: %s\n", course);
    printf("School Name: %s\n", school);
    printf("Age: %d\n", age);
    return 0;
}