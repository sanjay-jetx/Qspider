package Shopping_Payment.Abstract;

public abstract class Payment {
    private double Member_Amount;

    public double getMember_Amount() {
        return Member_Amount;
    }

    public void setMember_Amount(double Member_Amount) {
        this.Member_Amount = Member_Amount;
    }

    public double DisplayAmount() {
        return this.Member_Amount;
    }

    abstract int pay();
}
