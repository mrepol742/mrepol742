#include <stdio.h>
#include <malloc.h>
#include <stdlib.h>

struct node {
  int value;
  struct node *next;
};
void Link();
void insert();
void display();
void Delete();
int count();

typedef struct node DATA_NODE;

DATA_NODE *head_node, *first_node, *temp_node = 0, *prev_node, next_node;
int data;

int main() {
  int option = 0;

  printf("Input the Integer values of the links:3 7 1");
 
  while (option < 5) {

    printf("\nMENU\n");
    printf("[1] : Inserting value of the Link  \n");
    printf("[2] : Deleting value of the Link \n");
    printf("[3] : Exit\n");
    printf("Enter your Choice:");
    scanf("%d", &option);
    switch (option) {
      case 1:
        insert();
        break;
      case 2:
        Delete();
        break;
      case 3:
        display();
        break;
      case 4:
        count();
        break;
      default:
        break;
    }
  }

  return 0;
}

void insert() {
  
  printf("\ninserting a value at\n");
    printf("[a] : the biginning of the list  \n");
    printf("[b] : the middle of the list \n");
    printf("[c] : the end of the list \n");
    printf("[d] : EXIT \n");

   printf("Enter your Choice: 1 ");
 		
printf("Input the  values of the Inserted");

printf("\ninserting a value at\n");
    printf("the values in the link are 10 3 7 1\n");
    printf("insert another value? [Y/N]:N");
    
    
    printf("select another case? [Y/N]:N");
    
    
   printf("PRESS ANY KEY TO CONTINUE.....");
 
  scanf("%d", &data);

  temp_node = (DATA_NODE *) malloc(sizeof (DATA_NODE));

  temp_node->value = data;

  if (first_node == 0) {
    first_node = temp_node;
  } else {
    head_node->next = temp_node;
  }
  temp_node->next = 0;
  head_node = temp_node;
  fflush(stdin);
}

void Delete() {
  int countvalue, pos, i = 0;
  countvalue = count();
  temp_node = first_node;
  printf("\nDisplay Linked List : \n");

  printf("\nEnter Position for Delete Element : \n");
  scanf("%d", &pos);

  if (pos > 0 && pos <= countvalue) {
    if (pos == 1) {
      temp_node = temp_node -> next;
      first_node = temp_node;
      printf("\nDeleted Successfully \n\n");
    } else {
      while (temp_node != 0) {
        if (i == (pos - 1)) {
          prev_node->next = temp_node->next;
          if(i == (countvalue - 1))
          {
			  head_node = prev_node;
		  }
          printf("\nDeleted Successfully \n\n");
          break;
        } else {
          i++;
          prev_node = temp_node;
          temp_node = temp_node -> next;
        }
      }
    }
  } else
    printf("\nInvalid Position \n\n");
}

void display() {
  int count = 0;
  temp_node = first_node;
  printf("\nDisplay Linked List : \n");
  while (temp_node != 0) {
    printf(" %d  ", temp_node->value);
    count++;
    temp_node = temp_node -> next;
  }
  printf("\nItems In Linked List : %d\n", count);
}

int count() {
  int count = 0;
  temp_node = first_node;
  while (temp_node != 0) {
    count++;
    temp_node = temp_node -> next;
  }
  printf("\nItems In Linked List : %d\n", count);
  return count;
}