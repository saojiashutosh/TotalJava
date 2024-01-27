package TotalJava.OOPs.Interfaces;

public class Interfaces {
    public static void main(String[] args){
        Queen q=new Queen();
        q.moves();

        Rook r=new Rook();
        r.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    @Override
    public void moves() {
        System.out.println("Moves left,right,up,down,diagonal");
    }
}

class Rook implements ChessPlayer{
    @Override
    public void moves() {
        System.out.println("Moves up,down,right,left");
    }
}