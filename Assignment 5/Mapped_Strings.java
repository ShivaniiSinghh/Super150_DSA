package Assignment_5;

public class Mapped_Strings {
}
/*
#include<bits/stdc++.h>
using namespace std;

void mapped(string input, string out)
{
    if(input.size()==0)
    {
      cout<<out<<endl;
      return;
    }

    int first=input[0]-'0';
    char ch=first + 'A' -1;
    string out1 =out+ ch;
    mapped(input.substr(1),out1);

      if(input[1]!='\0')
      {
        int second =input[1]-'0';
         second=first*10+second;
         if(second<=26)
         {
            char second_char = second+'A'-1;
            string out2= out+second_char;
            mapped(input.substr(2),out2);
         }
      }

    return;
}

int main()
{
  string s;
  cin>>s;
  string out="";

  mapped(s,out);

	return 0;
}
 */