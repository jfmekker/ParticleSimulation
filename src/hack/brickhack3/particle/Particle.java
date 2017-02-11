package hack.brickhack3.particle;

/**
 * Created by Connor on 2/11/2017.
 */
public class Particle {

    private double x;
    private double y;
    private double velocityCompX;
    private double velocityCompY;

    public Particle(double x, double y) {
        this.x = x;
        this.y = y;

    }

    /**
     * Get the x-position of this particle
     *
     * @return
     */
    public double getX() {
        return x;
    }

    /**
     * Set a new x-position of this particle
     *
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     *
     * @return
     */
    public double getY() {
        return y;
    }

    /**
     *
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     *
     * @return
     */
    public double getVelocityCompX() {
        return velocityCompX;
    }

    /**
     *
     * @param velocityCompX
     */
    public void setVelocityCompX(double velocityCompX) {
        this.velocityCompX = velocityCompX;
    }

    /**
     *
     * @return
     */
    public double getVelocityCompY() {
        return velocityCompY;
    }

    /**
     * 
     * @param velocityCompY
     */
    public void setVelocityCompY(double velocityCompY) {
        this.velocityCompY = velocityCompY;
    }

    /**
     * Sets the velocity of this particle
     *
     * @param magnitude a magnitude
     * @param direction a direction (in degrees)
     */
    public void setVelocity(double magnitude, double direction) {
        this.velocityCompX = magnitude * Math.cos(Math.toRadians(direction));
        this.velocityCompY = magnitude * Math.sin(Math.toRadians(direction));
    }


    
}
