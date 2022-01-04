# include <iostream>
using namespace std;

int main() {

  char passcode;
  cout << "Enter passcode: ";
  cin >> passcode;

  switch(passcode) {
      case 'a':
      cout << "Teddy Bear";
      break;
      case 'A':
      cout << "Pumpkin";
      break;
      case 'B':
      case 'b':
      cout << "Lollipop";
      case 'C':
      case 'c':
      cout << "Hammer";
      break;
      default:
      cout << "No items";
  }

  return 0;
}
