import java.util.Scanner;

public class aextra(int a[],int n,int t){
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]==t) return mid;
            if(a[s]<=a[mid]){
            if(a[s]<=t && t>a[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        else{
            if(a[e]>=t && a[mid]<t){
                s=mid+1;
            }
            else{
                mid=1
            }
        }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();

        int ans = search(a, n, t);
        System.out.println(ans);
    }
}