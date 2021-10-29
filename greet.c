#include<stdio.h>

int main() {
    printf("Enter your initials:\n");
    char s[20];
    scanf("%s", s);
    printf("Enter your age:\n");
    int i;
    scanf("%d", &i);
    printf("Hi %s, your age next year will be %d.", &s, i+1);
    return 0;
}