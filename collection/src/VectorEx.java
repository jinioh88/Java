import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        list.add(new Board("제목1","내용2","작가1"));
        list.add(new Board("제목2","내용2","작가2"));
        list.add(new Board("제목3","내용2","작가3"));
        list.add(new Board("제목4","내용2","작가4"));

        list.remove(1);
        list.remove(2);

        for(Board board : list)
            System.out.println(board.subject);
    }
}
