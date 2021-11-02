package nl.tudelft.jpacman.board;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

/**
*/
public class BoardTest {
    private int maxWidth = 1;
    private int maxHeight = 1;
    /**
    */
    @Test // board has correct width
    void testWidth() {
        BasicSquare[][] grid = {{mock(BasicSquare.class)}};
        Board board = new Board(grid);
        assertThat(board.getWidth()).isEqualTo(maxWidth);
    }
    /**
    */
    @Test //Board has correct height
    void testHeight() {
        BasicSquare[][] grid = {{mock(BasicSquare.class)}};
        Board board = new Board(grid);
        assertThat(board.getHeight()).isEqualTo(maxHeight);
    }
    /**
    */    
    @Test //Square in board have null
    void testSquareAt() {
        BasicSquare[][] grid = new BasicSquare[1][1];
        Board board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isNull();
    }
}
