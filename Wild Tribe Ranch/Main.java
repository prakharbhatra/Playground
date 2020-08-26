#include <iostream>
using namespace std;

int main() 
{
  int x,v;
  cin>>x>>v;
  if(x>v)
    cout<<"Yes, you can enter.";
  
   else if(x==v)
     cout<<"Yes, you can enter. Kindly use a rope.";
 
  else
     cout<<"Sorry, you can't enter";
    return 0;
}