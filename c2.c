#include<stdio.h>

int main() { void *vp; char ch=74, *cp="JACK";  int j=65; vp=&ch; printf("%c", *(char*)vp); vp=&j; printf("%c", *(int*)vp); vp=cp; printf("%s", (char*)vp+2); return 0; }