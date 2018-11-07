public enum Direction {
    EAST(1), WEST(2), SOUTH(3), NORTH(4);

    protected final  int val;

    Direction(int val) {
        this.val = val;
    }

    public int getDirection() {
        return val;
    }
}
