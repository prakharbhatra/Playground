#include<iostream>
using namespace std;
int main()
{
  int a=3,b=4,c,d,x,y;
  cin>>x>>y;
  c=x-a;
  d=y-b;
  if(c>d)
    cout<<c;
  else
    cout<<d;
  return 0;
}