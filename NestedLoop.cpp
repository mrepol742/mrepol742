#include <iostream>

using namespace std;

int main()
{
  
    for(int i=5;i<=9;i++) {
    for(int j=0;j<i;j++)
    if (i==6) {
      cout <<i-2;
    } else if (i==7) {
        cout << i-4;
    } else if (i==8) {
        cout << i-6;
    } else if (i==9) {
        
    cout << i-8;
    } else {
    cout<<i;
    }
     cout<<"\n";
  }
    return 0;
}