public class Triangle {
    private double angle1;
    private double angle2;
    private double angle3;

    public Triangle(double angle1, double angle2) {
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = 180 - angle1 - angle2;
    }

    int type() {
        int type = 1;
        if (this.angle1 > 90 || this.angle2 > 90 || this.angle3 > 90) {
            type = 3;
        } else if (this.angle1 == 90 || this.angle2 == 90 || this.angle3 == 90) {
            type = 2;
        }
        return type;
    }

    int specialType() {
        int type = -1;
        if (this.angle1 == this.angle2 && this.angle2 == this.angle3) {
            type = 2;
        } else if (this.angle1 == this.angle2 || this.angle2 == this.angle3 || this.angle1 == this.angle3) {
            if (this.type() == 2) {
                type = 3;
            } else {
                type = 1;
            }
        }
        return type;
    }
}
