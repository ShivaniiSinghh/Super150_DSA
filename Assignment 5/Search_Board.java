package Assignment_5;

public class Search_Board {
    /*
    #include<bits/stdc++.h>
using namespace std;

 int diiir[4][2]={{1,0},{0,1},{-1,0},{0,-1}};
bool sea(int eye,int jay,vector<vector<char>>&vee,int ele,string strr)
{
    if(ele==strr.size())
            return true;

    if(eye<0 || jay<0 || eye>=vee.size() || jay>=vee[0].size() || vee[eye][jay]!=strr[ele])
            return false;

          char tee ='*';
            swap(vee[eye][jay],tee);
         for(auto cee:diiir)
         {
             if(saa(eye+cee[0],jay+cee[1],vee,ele+1,strr))
             {
                 swap(vee[eye][jay],tee);
                   return true;
             }
         }
        swap(vee[eye][jay],tee);
        return false;
}

int main(){

    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    int ann,amm,kayy;cin>>ann>>amm>>kayy;
    vector<vector<char>>vee(ann,vector<char>(amm));
    for(int eye = 0;eye<ann;++eye)
        for(int jay = 0;jay<amm;++jay)
            cin>>vee[eye][jay];
    set<string>strr;
    while(kayy--)
    {
        string doubleu;cin>>doubleu;
        int pii = 0;
        for(int eye=0;eye<vee.size();++eye)
        {
            for(int jay=0;jay<vee[0].size();++jay)
            {
                if(vee[eye][jay]==doubleu[0])
                {

                char tee ='*';
                swap(vee[eye][jay],tee);
                for(auto cee:diiir)
                {
                        if(saa(eye+cee[0],jay+cee[1],vee,1,doubleu))
                        {
                            pii = 1;
                            break;
                        }
                }

                    swap(vee[eye][jay],tee);
                    if(pii)
                    break;
                }
            }
            if(pii)
            break;
        }
        if(pii)
        strr.insert(doubleu);
    }
    for(auto cee:strr)
    cout<<cee<<" ";


    return 0;
}
     */
}
