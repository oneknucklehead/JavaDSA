public class BookAllocation {
    public static void main(String[] args) {
        int[] pages = {12,34,67,90};
        int m=2;
        System.out.println( minimum(pages,m));

    }
    public static int minimum(int[] pages,int m){
        int start=0,end=0;
        for(int i=0;i<pages.length;i++){
            start=Math.max(start,pages[i]);
            end+=pages[i];
        }
        while(start<end){
            int pieces=1;
            int sum=0;
            int mid = start+(end-start)/2;
            for(int page:pages){
                if(sum+page>mid)
                {
                    sum=page;
                    pieces++;
                }
                else {
                    sum+=page;
                }
            }
            if(pieces>m){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;
    }
}
