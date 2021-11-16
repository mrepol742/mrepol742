#include <stdio.h>
#include<conio.h>

int main(){
  int grade;
  printf("Enter your Grade: ");
  scanf("%d",&grade);
  if (grade >= 98){
    printf("Grading Remarks: 1.0");
  } else if (grade >= 95 && grade <= 97) {
    printf("Grading Remarks: 1.25");
  } else if (grade >= 92 && grade <= 94) {
    printf("Grading Remarks: 1.5");
  } else if (grade >= 89 && grade <= 91) {
    printf("Grading Remarks: 1.75");
  } else if (grade >= 86 && grade <= 88) {
    printf("Grading Remarks: 2.0");
  } else if (grade >= 83 && grade <= 85) {
    printf("Grading Remarks: 2.25");
  } else if (grade >= 80 && grade <= 82) {
    printf("Grading Remarks: 2.5");
  } else if (grade >= 77 && grade <= 79) {
    printf("Grading Remarks: 2.75");
  } else if (grade >= 75 || grade == 76) {
    printf("Grading Remarks: 3.0");
  } else if (grade <= 74){
    printf("Grading Remarks: 5.0");
  }
  return 0;
}