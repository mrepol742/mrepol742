#include<iostream>

using namespace std;

int fact(int);

int main(){
int n;
	cout<<"Input n:";
	cin>>n;
	cout<<" The answer is:"<<fact(n)<<endl;
			}
int fact(int n){
if ( n== 0 || n == 1)
return 1;
else
return n* fact(n-1);
}