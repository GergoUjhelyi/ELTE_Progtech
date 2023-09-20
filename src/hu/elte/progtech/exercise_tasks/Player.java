package hu.elte.progtech.exercise_tasks;

public final class Player {

    private final String nickName;
    private final String email;
    private final double credits;

    /**
     *
     *  Final class: no child item
     *  Private class members: no direct access
     *  Final class members: can't modify the object state
     *  (Deep copy + no setters, just getters if needed)
     */
    public Player(String nickName, String email, double credits) {
        this.nickName = nickName;
        this.email = email;
        this.credits = credits;
    }

    public String getNickName() {
        return nickName;
    }

    public String getEmail() {
        return email;
    }

    public double getCredits() {
        return credits;
    }
}
