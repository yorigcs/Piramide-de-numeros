public class Pyramid {
    int rows;
    Pyramid(int rows) {
        this.rows = rows;
    }


    public void print() {
        for (int i =1; i <= this.rows; i++) {
            StringBuilder row = new StringBuilder();
            for(int j = 0; j < i; j++) {
                row.append(i);
            }
            System.out.println(row);
        }
    }
}
