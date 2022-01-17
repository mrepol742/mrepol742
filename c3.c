#include<stdio.h>

void change(int *b, int n);
 int main() { int i, a[] = {2, 4, 6, 8, 10}; change(a, 5); for(i=0; i<=4; i++) printf("%d, ", a[i]); return 0; } void change(int *b, int n) { int i; for(i=0; i<n; i++) *(b+1) = *(b+i)+5; }