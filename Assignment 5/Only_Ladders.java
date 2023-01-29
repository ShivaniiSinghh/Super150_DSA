package Assignment_5;

public class Only_Ladders {
    /*
    #include<bits/stdc++.h>
    using namespace std;
    map<int,int>amm;
    set<string>tee;
    vector<int>vee;
    int cee=0;
    void foo(int eye,string strr,int ann)
    {
        if(eye==ann)
        {

            if(tee.find(strr)==tee.end())
            {
                cout<<strr.substr(1,strr.size())<<" END , ";
                tee.insert(strr);
                cee++;
            }
            return;
        }
        if(eye>ann)
        return;

        if(amm[eye]!=0)
        {
            foo(amm[eye],strr+" "+to_string(eye),ann);
			return;
        }
        for(int jay=1;jay<=6;++jay)
             foo(eye+jay,strr+" "+to_string(eye),ann);
    }
    int main() {
        int ann;cin>>ann;
        vector<int>vee;
        for(int eye =2;eye<ann;++eye)
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
        for(int eye = 0;eye<vee.size()/2;++eye)
            amm[vee[eye]]=vee[vee.size()-1-eye];

        foo(0,"",ann);
        cout<<"\n"<<cee;
        return 0;
    }
     */
}
