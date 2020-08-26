#include<iostream>
using namespace std;
int main()
{
  int x,c,v;
  cin>>x;
  c=x%10;
  v=(x-x%1000)/1000;
  cout<<c+v;
  return 0;
}