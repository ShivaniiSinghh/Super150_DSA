package Assignment_5;

public class Chessboard_Pattern {
    /*
    #include<bits/stdc++.h>
using namespace std;

#define ll long long


vector<string>tee;
map<int,int>pii;
map<string,bool>amm;
long long yoo = 0;
void foo(int eye,int jay,int ann,string strr)
{
    if(eye==ann-1 && jay==ann-1)
    {
        strr+="{"+to_string(eye)+"-"+to_string(jay)+"}";
        if(!amm[strr])
    {
                            cout<<strr<<" ";
        amm[strr]=1;
    }
        return;
    }
    if(eye>=n || jay>=n)
    return;

if( pii[eye*ann+jay+1]==-1)
{

	return;
}
	if(pii[ann*eye+jay+1]==1)
{

		foo(ann-1,ann-1,ann,strr+"{"+to_string(eye)+"-"+to_string(jay)+"}P");
}
    foo(eye+2,jay+1,ann,strr+"{"+to_string(eye)+"-"+to_string(jay)+"}K");
    foo(eye+1,jay+2,ann,strr+"{"+to_string(eye)+"-"+to_string(jay)+"}K");

    if(eye==0 || eye==ann-1)
    {

        for(int kay = jay+1;kay<ann;++kay)
        {
           foo(eye,kay,ann,strr+"{"+to_string(eye)+"-"+to_string(jay)+"}R");
        }
         for(int kay = eye+1;kay<ann;++kay)
        {
            foo(kay,jay,ann,strr+"{"+to_string(eye)+"-"+to_string(jay)+"}R");
        }

    }
    if(jay==0 || jay==ann-1)
    {

         for(int kay = jay+1;kay<ann;++kay)
        {
           foo(eye,kay,ann,strr+"{"+to_string(eye)+"-"+to_string(jay)+"}R");
        }
          for(int kay = eye+1;kay<ann;++kay)
        {
           foo(kay,jay,ann,strr+"{"+to_string(eye)+"-"+to_string(jay)+"}R");
        }
    }

    if(eye==jay || eye+jay==ann-1)
    {
        for(int kay = 1;kay<ann;++kay)
        {
            foo(eye+kay,jay+kay,ann,strr+"{"+to_string(eye)+"-"+to_string(jay)+"}B");
        }
    }

}

int main(){

    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    int ann;cin>>ann;
	vector<int>vee;
        for(int eye =2;eye<=ann*ann;++eye)
        {
            int kay = 0;
            int pii  = (eye+1)/2;
            for(int jay=2;jay<=pii;++jay)
            {
                if(eye%jay==0)
                {

                    kay=1;
                    break;
                }
            }
            if(!kay)
            vee.push_back(eye);
        }
		for(int eye = 0;eye<vee.size();++eye)
		{
			if(eye%2)
			pii[vee[eye]]=1;
			else
			pii[vee[eye]]=-1;
			// cout<<vee[eye]<<" "<<pii[]<<"\n";
		}
    if(ann==0)
    {
        cout<<0<<"\n";
        return 0;
    }
foo(0,0,ann,"");

cout<<"\n"<<amm.size()<<"\n";
    return 0;
}
     */
}
