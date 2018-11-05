import java.util.Scanner;

class CountingValleys{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int result = countV(n, s);
    System.out.println(result);
  }

  public static int countV(int n, String s){
    int lvl = 0;
    int v = 0;

    for(char c : s.toCharArray()){
      if (c == 'U')
        lvl+=1;
      if (c == 'D')
        lvl-=1;
      if (lvl == 0 && c == 'U')
        v+=1;
    }
    return v;
  }
}
