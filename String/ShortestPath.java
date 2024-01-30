package TotalJava.String;

public class ShortestPath {
    public static void main(String[] args ){
        String path = "WEENESW";
        System.out.println(getShortestPath(path));
    }

    private static float getShortestPath(String path) {
        int x= 0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if(dir =='N'){
                x++;
            } else if (dir == 'S') {
                x--;
            } else if (dir == 'E') {
                y++;
            }else{
                y--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return  (float)Math.sqrt(x2+y2);
    }
}
